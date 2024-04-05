package com.exam.myapp.comm;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class LoadServlet extends HttpServlet{
	
	@Override
	public void init() throws ServletException {
		System.out.println("LoadServlet:init() 실행...");
		String className = getInitParameter("cn");	//현재 서블릿의 초기화파라미터값 읽기
		try {
			Class.forName(className);	// 지정한 클래스를 메모리에 로드
//			DriverManager.registerDriver(new OracleDriver());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
	}

}
