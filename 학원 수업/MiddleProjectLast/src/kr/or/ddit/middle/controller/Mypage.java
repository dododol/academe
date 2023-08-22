package kr.or.ddit.middle.controller;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.middle.service.ILoginService;
import kr.or.ddit.middle.service.LoginServiceImpl;
import kr.or.ddit.middle.vo.LoginVO;

@WebServlet("/mypage.do")
public class Mypage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		
		
		ILoginService service = LoginServiceImpl.getInstance();
		
		HttpSession session =  req.getSession();
		LoginVO loginVO = (LoginVO)session.getAttribute("loginSign");
	      
	    LoginVO updateVo = service.selectAllInfo(loginVO.getMem_id());
		
		req.setAttribute("selectAllInfo", updateVo);
		req.getRequestDispatcher("/html/mypage/mypage.jsp").forward(req, resp);
	}

	

}
