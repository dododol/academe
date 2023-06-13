package kr.or.ddit.service;

import java.util.Map;
import java.util.Scanner;

import kr.or.ddit.controller.NoticeController;
import kr.or.ddit.dao.LoginDao;
import kr.or.ddit.util.View;

// 로그인 기능을 담당할 서비스 클래스
public class LoginService {
	
	// 개발하고자 하는 시스템에서 LoginService 클래스를 하나의 객체로 관리하기 위해서
	// 싱글턴 패턴을 적용하여 하나의 객체에서 모든 데이터가 가용될 수 있도록 허용
	// LoginService 객체를 만들어 낼때 사용할 instance 변수를 선언한다.
	private static LoginService instance = null;
	
	// 해당 클래스를 기본 생성자로 호출하여 인스턴스를 생성하지 못하도록 private으로 막는다.
	private LoginService() {}
	
	// 기본 생성자로는 인스턴스를 만들 수 없으므로 getInstance() 함수를 이용하여
	// LoginService 객체를 만들 수 있도록 getInstance) 함수를 생성합니다.
	public static LoginService getInstance() {
		// 기본적으로 상단에 만들어둔 LoginService 객체 변수인 instance는 null이다.
		// 최초로 LoginService 클래스 안에 있는 getInstance() 함수가 호출되는 순간
		// 제일 처음에 instance가 null이므로, new 생성자를 통해서 LoginService
		// 객체가 만들어진다
		// 그 이후에 getInstance() 를 호출 했을때는 이미 객체가 만들어져 있어서
		// instance는 null이 아니므로 new 생성자를 통해 클래스가 생성되지 않고
		// 이미 만들어져 있는 instance 변수가 리턴된다.
		if(instance == null) {
			instance = new LoginService();
		}
		return instance;
	}
	
	// 서비스는 데이터를 관장하는 데이터 담당자인 DAO를 호출합니다.
	// DB로 요청할 기능을 DAO한테 요청하고 결과를 받기 위해서 DAO를 부를 수 밖에 없습니다.
	// "데이터 담당자 DAO님!, 저 로그인 할건데 idmpw 줄테니까 회원정보 일치하는거 있으면
	// 나좀 던져줄래요??? 꼭요! 알겠죠?"
	LoginDao loginDao = LoginDao.getInstance();
	
	public int signIn() {
		// 페이지 정보를 담기 위한 공간(로그인 처리가 끝나고 컨트롤러로 리턴할 페이지 정보)
		int pageNo = 0;
		
		if((boolean)NoticeController.sessionStorage.get("login")) {
			System.out.println("[■SYSTEMLOG] 이미 로그인 되어 있습니다!");
			// 로그인 되어 있으므로 로그인을 더이상 진행하지 않아도 되므로 메인 메뉴로 넘어갑니다.
			return View.MAIN;
		}
		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("■ 아이디 입력 >> ");
		String id = sc.nextLine();
		System.out.print("■ 비밀번호 입력 >> ");
		String pw = sc.nextLine();
		
		// 입력 받은 아이디, 비밀번호를 이용하여 로그인을 요청한다. (데이터 담당자인 Dao로)
		// 서비스에서 입력받은 아이디 비밀번호를 Dao한테 넘겨주면 id, pw에 해당하는
		// 회원정보를 Map타입으로 던져줍니다.
		Map<String, Object> member = loginDao.signIn(id,pw);
		
		if(member != null && member.get("MEM_ID").equals(id)) {
			// 로그인 상태를 true로 로그인 도이ㅓ 있음이라는 상태로 저장
			NoticeController.sessionStorage.put("login", true);
			// 로그인 인증된 회원정보를 loginInfo에 저장
			NoticeController.sessionStorage.put("loginInfo", member);
			
			System.out.println("■" + member.get("MEM_+NAME") + 
					"님 환영합니다!");
			pageNo = View.MAIN; // 로그인이 완료되었으므로 메인화면으로 이동한다.
		} else {	// 회원인증이 되지 않음 실패!!
			System.out.println("[■SYSTEMLOG] Server Error...! 로그인 실패");
			pageNo=View.HOME;
		}
	}
}
