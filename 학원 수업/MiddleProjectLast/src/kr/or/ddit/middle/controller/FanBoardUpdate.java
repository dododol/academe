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


@WebServlet("/board/fanBoardUpdate.do")
public class FanBoardUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		FanBoardVO fanVO = new FanBoardVO();
		
		int bono = Integer.parseInt(request.getParameter("bono"));
		
		IFanBoardService service = FanBoardServiceImpl.getInstance();
		
		fanVO = service.selectFanBoard(bono);
		
		request.setAttribute("UpdateFanVO", fanVO);
		
		request.getRequestDispatcher("/html/board/fanboardUpdate.jsp").forward(request, response);
			
	}
	
}