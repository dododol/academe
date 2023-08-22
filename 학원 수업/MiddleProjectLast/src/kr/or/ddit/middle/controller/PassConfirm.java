package kr.or.ddit.middle.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.middle.service.ILoginService;
import kr.or.ddit.middle.service.LoginServiceImpl;
import kr.or.ddit.middle.vo.LoginVO;

@WebServlet("/passConfirm.do")
public class PassConfirm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*
		 * // 요청시 전송 데이터 받기 - 입력한 pass String pass = request.getParameter("userpass");
		 * //로그인창에서 로그인한 후 받은 비밀번호 값.
		 * 
		 * // service객체 얻기 ILoginService service = LoginServiceImpl.getInstance();
		 * 
		 * // service 메서드 호출 - 결과값 받기 - String String res = service.selectByPw(pass);
		 * 
		 * // 결과값을 request에 저장 request.setAttribute("selectByPw", res);
		 * 
		 * // view페이지로 이동
		 * 
		 * 
		 * HttpSession session = request.getSession();
		 * 
		 * if(res != null) {
		 * request.getRequestDispatcher("/html/mypagepw.jsp").forward(request,
		 * response);
		 * 
		 * }else { response.sendRedirect(request.getContextPath()+"/html/sign.jsp"); }
		 */
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 요청시 전송 데이터 받기  - 입력한 pass
				String pass = request.getParameter("userPW"); //로그인창에서 로그인한 후 받은 비밀번호 값.
				
				// service객체 얻기
				ILoginService service = LoginServiceImpl.getInstance();
				
				// service 메서드 호출  -  결과값 받기  - String
				String res = service.selectByPw(pass);
				
				// 결과값을 request에 저장
				request.setAttribute("selectByPw", res);
				
				// view페이지로 이동
				
				request.getRequestDispatcher("/mypage.do").forward(request, response);
					
				
	}

}
