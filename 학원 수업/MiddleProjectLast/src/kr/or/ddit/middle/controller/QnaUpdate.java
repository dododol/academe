package kr.or.ddit.middle.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.middle.service.IQnaService;
import kr.or.ddit.middle.service.QnaServiceImpl;
import kr.or.ddit.middle.vo.QnaVO;

@WebServlet("/board/qnaUpdate.do")
public class QnaUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.setCharacterEncoding("UTF-8");
		
		QnaVO qnaVO = new QnaVO();
		
		int qnano = Integer.parseInt(request.getParameter("qnano"));
		
		IQnaService service = QnaServiceImpl.getInstance();
		
		qnaVO = service.selectQna(qnano);
		
		request.setAttribute("UpdateQnaVO", qnaVO);
		
		request.getRequestDispatcher("/html/board/qnaUpdate.jsp").forward(request, response);
	
	}

}
