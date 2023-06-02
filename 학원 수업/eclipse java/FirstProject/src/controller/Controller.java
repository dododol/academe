package controller;

import service.LoginService;

public class Controller {

	public static void main(String[] args) {
		
		new Controller().init();

	}
	
	public void init() {
		LoginService loginService = LoginService.getInstance();
		loginService.login();
	}

}


//데이터베이스에서의 커서는 행의 집합을 의미.