package kr.or.ddit.middle.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.middle.service.ILoginService;
import kr.or.ddit.middle.service.LoginServiceImpl;
import kr.or.ddit.middle.vo.LoginVO;


@WebServlet("/ID.do")
public class ID extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		String userNAME = request.getParameter("userNAME");
		String userNUM = request.getParameter("userNUM");
		
		LoginVO vo = new LoginVO();
		vo.setMem_name(userNAME);
		vo.setMem_num(userNUM);
		
		ILoginService service = LoginServiceImpl.getInstance();
		
		String idSearch = service.idSearch(vo);
		
		request.setAttribute("idSearch", idSearch);
		
		if(idSearch !=null) {
			
			response.setContentType("text/html; charset=UTF-8");
			out.print("<script> alert('회원고객님의 찾으신 기존 아이디는 :"+idSearch+"입니다.'); window.close();</script>");
		
			out.flush();
			
			
		
		}else {
			response.setContentType("text/html; charset=UTF-8");
			out.print("<script> alert('회원고객님의 입력하신 정보가 틀립니다. 다시 입력해주세요.'); location.href='http://localhost/MiddleProject/html/searchlogin.jsp';</script>");
			out.flush();
//			request.getRequestDispatcher("/html/searchlogin.jsp").forward(request, response);
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
