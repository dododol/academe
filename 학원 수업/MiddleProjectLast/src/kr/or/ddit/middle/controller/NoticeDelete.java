package kr.or.ddit.middle.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.middle.service.INoticeService;
import kr.or.ddit.middle.service.NoticeServiceImpl;

@WebServlet("/board/noticeDelete.do")
public class NoticeDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		int nono = Integer.parseInt(request.getParameter("nono"));
		
		INoticeService service = NoticeServiceImpl.getInstance();
		
		int cnt = service.deleteNotice(nono);
		
		response.sendRedirect(request.getContextPath()+"/board/noticelist.do");
		
	
	}

}
