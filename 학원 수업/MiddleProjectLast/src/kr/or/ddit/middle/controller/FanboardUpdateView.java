package kr.or.ddit.middle.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.middle.service.FanBoardServiceImpl;
import kr.or.ddit.middle.service.IFanBoardService;
import kr.or.ddit.middle.vo.FanBoardVO;


@WebServlet("/board/fanboardUpdateView.do")
public class FanboardUpdateView extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		int b_no = Integer.parseInt(request.getParameter("fanboard_no"));
		String b_title = request.getParameter("fanboard_title");
		String b_content = request.getParameter("fanboard_content");
		FanBoardVO fanVo = new FanBoardVO();
		
		System.out.println(b_no);
		
		fanVo.setB_title(b_title);
		fanVo.setB_content(b_content);
		fanVo.setB_no(b_no);
		
		IFanBoardService service = FanBoardServiceImpl.getInstance();
		
		service.updateFanBoard(fanVo);
		
		response.sendRedirect(request.getContextPath()+"/board/fanboardlist.do");
		
	}

}
