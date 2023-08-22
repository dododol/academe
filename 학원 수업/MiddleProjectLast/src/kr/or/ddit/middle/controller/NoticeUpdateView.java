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

@WebServlet("/board/noticeUpdateView.do")
public class NoticeUpdateView extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		int n_no = Integer.parseInt(request.getParameter("notice_no"));
		String n_title = request.getParameter("notice_title");
		String n_content = request.getParameter("notice_content");
		
		NoticeVO notiVo = new NoticeVO();
		
		INoticeService service = NoticeServiceImpl.getInstance();
		
		notiVo.setN_title(n_title);
		notiVo.setN_content(n_content);
		notiVo.setN_no(n_no);
		
		
		int cnt = service.updateNotice(notiVo);
		
		response.sendRedirect(request.getContextPath()+"/board/noticelist.do");
	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		
	
	}

}
