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


/**
 * Servlet implementation class QnaTitleSearch
 */
@WebServlet("/board/qnaTitleSearch.do")
public class QnaTitleSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String data = request.getParameter("sword");
		
		IQnaService service = QnaServiceImpl.getInstance();
		
		List<QnaVO> searchQna = service.getSearchQna(data);
		
		request.setAttribute("search", searchQna);
		
		request.getRequestDispatcher("/html/board/qnasearchlist.jsp").forward(request, response);
	
	}

}
