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

@WebServlet("/board/updateQnaReply.do")
public class UpdateQnaReply extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		LoginVO loginVO = (LoginVO)request.getSession().getAttribute("loginSign");
		
		int reno=Integer.parseInt(request.getParameter("reno"));
		int qnano=Integer.parseInt(request.getParameter("qnano"));
		String content = request.getParameter("content");
		
		
		String userId= loginVO.getMem_id();
		IQnaService service = QnaServiceImpl.getInstance();
		
		ReplyVO reVo= new ReplyVO();
		
		reVo.setQ_no(qnano);
		reVo.setRe_no(reno);
		reVo.setRe_content(content);
		
		System.out.println("revo" + reVo);
		int cnt = service.updateReply(reVo);
		
		
	   if(cnt > 0)	
		     response.sendRedirect(request.getContextPath()+"/board/QnaDetail.do?qnano="+qnano);
	
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
