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

@WebServlet("/board/qnaUpdateView.do")
public class QnaUpdateView extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		int q_no = Integer.parseInt(request.getParameter("qna_no"));
		String q_title = request.getParameter("qna_title");
		String q_content = request.getParameter("qna_content");
		int q_pass = Integer.parseInt(request.getParameter("qna_pass"));
		
		QnaVO qVO= new QnaVO();
		
		IQnaService service = QnaServiceImpl.getInstance();
		
		qVO.setQ_title(q_title);
		qVO.setQ_content(q_content);
		qVO.setQ_no(q_no);
		qVO.setQ_pass(q_pass);
		
		
		int cnt = service.updateQna(qVO);
		
		response.sendRedirect(request.getContextPath()+"/board/qnaList.do");
	
	
	}

}
