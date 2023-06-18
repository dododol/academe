package controller;

import java.util.HashMap;
import java.util.Map;

import service.LoginService;

public class Controller {
	
	public static Map<String, Object> sessionStorage =
			new HashMap<String, Object>();

	public static void main(String[] args) {
		new Controller().init();

	}

	public void init() {
		LoginService loginService = LoginService.getInstance();
		loginService.login();
	}
}
