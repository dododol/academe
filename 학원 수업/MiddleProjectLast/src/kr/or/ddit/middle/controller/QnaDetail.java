package kr.or.ddit.middle.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.middle.service.IQnaService;
import kr.or.ddit.middle.service.QnaServiceImpl;
import kr.or.ddit.middle.vo.QnaVO;
import kr.or.ddit.middle.vo.ReplyVO;



@WebServlet("/board/QnaDetail.do")
public class QnaDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		int qnano= Integer.parseInt(request.getParameter("qnano"));
			
		IQnaService service = QnaServiceImpl.getInstance();
		
		QnaVO qVO = service.selectQna(qnano);
		List<ReplyVO> List = service.selectReplyList(qnano);
		
		
		request.setAttribute("qnadetail", qVO);
		request.setAttribute("replyList", List);
		
		
		request.getRequestDispatcher("/html/board/qnadetail.jsp").forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
