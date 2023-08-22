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

@WebServlet("/board/qnaForm.do")
public class QnaForm extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("UTF-8");
		
		String qnaTitle = request.getParameter("qna_title");
		String qnaId = request.getParameter("qna_writer");
		String qnaContent = request.getParameter("qna_content");
		int qnaPass = Integer.parseInt(request.getParameter("qna_pass"));
		
		QnaVO qVO = new QnaVO();
		
		qVO.setQ_title(qnaTitle);
		qVO.setMem_id(qnaId);
		qVO.setQ_content(qnaContent);
		qVO.setQ_pass(qnaPass);
		
		IQnaService service = QnaServiceImpl.getInstance();
		
		System.out.println("qVO" + qVO);
		
		int cnt = service.insertQna(qVO);
		
		if (cnt > 0) {
			response.sendRedirect(request.getContextPath() + "/board/qnaList.do");
		} else {
			request.getRequestDispatcher("/html/board/qnaForm.jsp").forward(request, response);
		}
		
	}

}
