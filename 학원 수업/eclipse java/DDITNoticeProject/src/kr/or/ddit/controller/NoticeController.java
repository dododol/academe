package kr.or.ddit.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import kr.or.ddit.service.LoginService;
import kr.or.ddit.util.View;

public class NoticeController {
	
	// 로그인 후 세션 처리를 진행할 때, 사용할 Map공간
	// 사용자와 서버의 연결 파이프라인이라고 생각하면 쉽습니ㅡ
	public static Map<String, Object> sessionStorage =
			new HashMap<String, Object>();
	
	// # 컨츠롤러 뿌리에서 가지치기를 할 service를 부른다.
	// 로그인을 진행할 때 사용할 서비스 객체를 부르기 위한 준비
	LoginService loginService = LoginService.getInstance();

	// 공지사항 시작을 알리는 시스템 진입점
	public static void main(String[] args) {
		new NoticeController().start(); // 공지사항 시스템 시작
	}
	
	public void start() {
		// 로그인 시, 저장할 로그인 세션 정보
		// 로그인 처리가 정상적으로 진행 됐을때, login 키에 로그인 되었다는 flag값인
		// true를 등록해서 로그인 상태값을 유지해준다.
		sessionStorage.put("login",  false);	// 로그인 상태 : 미로그인
		sessionStorage.put("loginInfo", null);
		
		// 최초 시스템을 시작했을대, 처음부터 나ㅌ나야할 페이지가 필요한데
		// 그 녀석을 HOME라는 페이지로 이동하기 위해서 HOME를 셋팅
		int view = View.HOME;
		
		// 언제는지 어디서든지 내가 원하는 메뉴를 선택하기 위한 무한루프
		while(true) {
			switch (view) {
				case View.HOME: view = home(); break;
				case View.MAIN: view = mainPage(); break;
				case View.SIGNIN: view = loginService.signIn(); break;
				case View.MYPAGE: view = myPage(); break;
				default : break;
				
			}
		}
	}
	
	// 홈 화면이면서 첫 메뉴에 해당하는 메소드를 컨트롤러에서 실행한다.
	private int home() {
		System.out.println("::: 대덕인재개발원 공지사항 게시판");
		System.out.println("::: 중요한 공지 내용을 확인할 수 있습니다.");
		System.out.println("::: 아래 메인 메뉴에서 원하는 메뉴를 선택해주세요.");
		System.out.println("--- [HOME MENU] ---");
		System.out.println("1.로그인 2.회원가입 3.아이디찾기 4.비밀번호찾기");
		System.out.println("-----------------------");
		System.out.print("번호입력 >> ");
		
		Scanner sc = new Scanner(System.in);
				
		// 입력한 메뉴 번호에 따라 번호에 해당하는 메뉴로 이동한다.
			switch (sc.nextInt()) {
			case 1: return View.SIGNIN;
			case 2: return View.SIGNUP;
			case 3: return View.FINDID;
			case 4: return View.FINDPW;
			default: return View.HOME;
				}
	}
	
	//로그인 후 사용할 메인 화면
	private int mainPage() {
		// 직접 사용하지는 않겠지만, member라는 변수안에 들어있는
		// 각각의 회원정보들을 꺼내서 관리자인지 회원인지의 등급에 따라서
		// 메뉴를 달리할수도 있고 다른 이벤트를 취할 수 있겠죠?
		Map<String, Object> member =
				(Map<String, Object>)
				NoticeController.sessionStorage.get("loginInfo");
		
		System.out.println("--- [MAIN MENU] ---");
		System.out.println("1.공지사항 2.내정보");
		System.out.println("-------------------");
		System.out.print("번호입력 >>");
		
		Scanner sc = new Scanner(System.in);
		switch (sc.nextInt()) {
		case 1: return View.NOTICE_LIST;
		case 2: return View.MYPAGE;
		default: return View.HOME;
		}
	}
	
	private int myPage() {
		Map<String, Object> member =
				(Map<String, Object>)
				NoticeController.sessionStorage.get("loginInfo");
		
		System.out.println("----[내정보]---");
		System.out.println("■ID : " + member.get("MEM_ID"));
		System.out.println("■PW : " + member.get("MEM_PW"));
		System.out.println("■이름 : " + member.get("MEM_NAME"));
		System.out.println("■성별 : " + member.get("MEM_GENDER"));
		System.out.println("■생일 : " + member.get("MEM_BIR"));
		System.out.println("■등급 : " + member.get("GRADE"));
		System.out.println("■1.뒤로가기");
		System.out.println("■번호입력 >>");
		
		Scanner sc = new Scanner(System.in);
				switch (sc.nextInt()) {
				case 1: return View.MAIN;
				default : return View.HOME;
				}
	
	}
}