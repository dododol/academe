package kr.or.ddit.middle.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.middle.service.INoticeService;
import kr.or.ddit.middle.service.NoticeServiceImpl;
import kr.or.ddit.middle.vo.NoticeVO;

@WebServlet("/board/noticeUpdate.do")
public class NoticeUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		NoticeVO notiVO = new NoticeVO();
		
		int nono = Integer.parseInt(request.getParameter("nono"));
		
		INoticeService service = NoticeServiceImpl.getInstance();
		
		notiVO = service.selectNotice(nono);
		
		request.setAttribute("UpdateNotiVO", notiVO);
		
		request.getRequestDispatcher("/html/board/noticeUpdate.jsp").forward(request, response);
	
	}

}
