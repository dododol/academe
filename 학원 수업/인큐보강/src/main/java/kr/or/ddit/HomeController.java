package kr.or.ddit;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 * 
 * 골뱅이Controller 어노테이션
 * 스프링 프레임워크에게 "프링아 이 클래스는 웹 브라우저의 요청(request)을 
 * 받아들이는 컨트롤러야"라고 알려주는 것임
 * 스프링은 servlet-context.xml의 context:component-scan설정에 의해
 * 이 클래스를 자바빈 객체로 등록(메모리에 바인딩(올림))
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 * 요청URI : localhost/
	 * 요청파라미터 : 
	 * 요청방식 : get
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		//session.setAttribute("속성명",값)
		//INSERT INTO MODEL(SERVERTIME) VALUES(FORMATTERDDATE);
		model.addAttribute("serverTime", formattedDate );
		
		//forwarding
		//servlet-context.xml
		/*
		 <beans:property name="prefix" value="/WEB-INF/views/" />
		<beans:property name="suffix" value=".jsp" />
		
		/WEB-INF/views/ + home + .jsp
		 */
		return "home";
	}
	
}
