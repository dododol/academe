package kr.or.ddit.servlet03;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.text.MessageFormat;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Model 2 아키텍처 기반의 책임의 분리 구조
 * Model 1 : request와 response가 하나의 객체(서블릿/JSP)에 의해 처리되는 구조 
 * Model 2 : request(servlet, controller) 처리 객체와 response(servlet/JSP, view) 처리 객체가 분리된 구조
 *			Model : content의 원형이 되는 information -> MVC pattern
 *Controller의 역할
 *1. 요청 접수
 *2. 요청 검증/분석
 *3. Model(information) 생성
 *4. scope를 통해 model 공유
 *5. view 선택
 *6. view로 이동
 *
 *View 역할
 *model로부터 content를 생성해 응답으로 전송
 *
 */
@WebServlet("/ver4/imageForm.do")
public class ImageFormServlet_ver4 extends HttpServlet{
	
	private File imageFolder;
	private ServletContext application;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		
		application = getServletContext();
		
		String value = application.getInitParameter("imageFolder");
		
		imageFolder = new File(value);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] cookies = req.getCookies();
		String imgCookieValue = "";
		if(cookies != null) {
			for(Cookie tmp : cookies) {
				if("imgCookie".equals(tmp.getName())) {
					imgCookieValue = URLDecoder.decode( tmp.getValue() , "UTF-8");
					break;
				}
			}
		}
		
		req.setAttribute("imgCookieValue", imgCookieValue);
		
		String[] imageFileNames = imageFolder.list((d,n)->Optional.ofNullable(application.getMimeType(n))
															.orElse("").startsWith("image/"));
		
		String options = Stream.of(imageFileNames)
								.map((in)->MessageFormat.format("<option>{0}</option>", in))
								.collect(Collectors.joining("\n"));
		
		String cPath = req.getContextPath(); 
		
		req.setAttribute("cPath", cPath);
		req.setAttribute("options", options);
		
		String viewName = "/WEB-INF/views/04/imageForm.jsp";
		req.getRequestDispatcher(viewName).forward(req, resp);
	}
}











