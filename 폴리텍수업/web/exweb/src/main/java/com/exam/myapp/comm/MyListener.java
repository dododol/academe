package com.exam.myapp.comm;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

//리스너 : 특정 사건(이벤트)이 발생하면 자동으로 실행
//	감시하고 싶은 사건(이벤트)에 따라서 그에 맞는 XxxListener 인터페이스를 구현

//리스너 등록방법
//(1)web.xml에 <listener> 태그를 사용하여 등록
//(2)리스너 클래스에 @WebListener를 적용


// ServletContextListener : 서블릿컨텍스트의 생성과 소멸을 감시
public class MyListener implements ServletContextListener{

	@Override	//서블릿컨텍스트 생성 (웹앱 최초 시작) 후 한번 실행
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("MyListener:init() 실행...");
		ServletContext context = sce.getServletContext();	//새로 생성된 서블릿컨텍스트 객체 가져오기
		String className = context.getInitParameter("cn");	//현재 서블릿의 초기화파라미터값 읽기
		try {
			Class.forName(className);	// 지정한 클래스를 메모리에 로드
//			DriverManager.registerDriver(new OracleDriver());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
	}
	
	@Override	//서블릿컨텍스트 소멸 (웹앱종료) 직전에 한번 실행
	public void contextDestroyed(ServletContextEvent sce) {
		
	}
	
}
