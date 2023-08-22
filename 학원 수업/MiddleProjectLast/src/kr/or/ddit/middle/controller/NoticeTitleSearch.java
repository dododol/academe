package kr.or.ddit.middle.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.middle.service.INoticeService;
import kr.or.ddit.middle.service.NoticeServiceImpl;
import kr.or.ddit.middle.vo.NoticeVO;

@WebServlet("/board/noticeTitleSearch.do")
public class NoticeTitleSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		
		String data = request.getParameter("sword");
		
		INoticeService service = NoticeServiceImpl.getInstance();
		
		List<NoticeVO> searchNotice = service.getSearchNotice(data);
		
		request.setAttribute("search", searchNotice);
		
		request.getRequestDispatcher("/html/board/noticesearchlist.jsp").forward(request, response);
	}

}
