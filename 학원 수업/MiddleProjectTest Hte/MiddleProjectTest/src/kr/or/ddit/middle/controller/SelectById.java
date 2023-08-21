package kr.or.ddit.middle.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.middle.service.ILoginService;
import kr.or.ddit.middle.service.LoginServiceImpl;


@WebServlet("/selectById.do")
public class SelectById extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				// 요청시 전송 데이터 받기  - 입력한 id
				String userId = request.getParameter("id");

				
				// service객체 얻기
				ILoginService service = LoginServiceImpl.getInstance();
				
				// service 메서드 호출  -  결과값 받기  - String
				String res = service.selectById(userId);

				
				// 결과값을 request에 저장
				request.setAttribute("selectById", res);
				
				// view페이지로 이동
				request.getRequestDispatcher("/htmlview/resultInput.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
