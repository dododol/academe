package service;

import java.util.Map;
import java.util.Scanner;

import controller.Controller;
import dao.LoginDAO;

public class LoginService {
	
	private static LoginService instance;
	
	private LoginService() {
	}
	
	public static LoginService getInstance() {
		if (instance == null)
			instance = new LoginService();
		return instance;
	}
	
	Scanner sc = new Scanner(System.in);
	
	public static int LoginCount = 0;
	LoginDAO dao = LoginDAO.getInstance();
	Map<String, Object> result = null;
	
	public void login() {
		System.out.println("[[ 로그인 ]]");
		while (true) {
			System.out.print("id 입력 : ");;
			String id = sc.nextLine();
			
			System.out.print("비밀번호 입력 : ");
			String pw = sc.nextLine();
			result = dao.login(id, pw);
			LoginCount++;
			if(LoginCount>4) break;
			if(result != null) {
				Controller.sessionStorage.put("ENAME", id);
				System.out.println(result.get("ENAME") + "님 반갑습니다.");
				break;
			} else {
				System.out.println("다시 로그인하세요");
			}
		}
	}


}
