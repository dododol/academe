package kr.or.ddit.middle.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.middle.service.IQnaService;
import kr.or.ddit.middle.service.QnaServiceImpl;

@WebServlet("/board/qnaDelete.do")
public class QnaDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		
		int qnano = Integer.parseInt(request.getParameter("qnano"));
		
		IQnaService service = QnaServiceImpl.getInstance();
		
		int cnt = service.deleteQna(qnano);
		
		response.sendRedirect(request.getContextPath()+"/board/qnaList.do");
	}

}
