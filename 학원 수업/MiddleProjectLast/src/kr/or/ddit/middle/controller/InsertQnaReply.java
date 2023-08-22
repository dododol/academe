package kr.or.ddit.middle.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.middle.service.IQnaService;
import kr.or.ddit.middle.service.QnaServiceImpl;
import kr.or.ddit.middle.vo.LoginVO;
import kr.or.ddit.middle.vo.ReplyVO;

@WebServlet("/board/insertQnaReply.do")
public class InsertQnaReply extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		LoginVO loginVO = (LoginVO)request.getSession().getAttribute("loginSign");
		
		String replyId= request.getParameter("replyId");
		String replyContent = request.getParameter("replyWrite");
		int qnano = Integer.parseInt(request.getParameter("qnano"));
		
		IQnaService service = QnaServiceImpl.getInstance();
		ReplyVO vo = new ReplyVO();
		vo.setMem_id(loginVO.getMem_id());
		vo.setRe_content(replyContent);
		vo.setQ_no(qnano);
		
		System.out.println(vo);
		
		int cnt =service.insertReply(vo);
		
		response.sendRedirect(request.getContextPath()+"/board/QnaDetail.do?qnano="+qnano);
	
	}

}
