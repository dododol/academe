package kr.or.ddit.middle.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.middle.service.FanBoardServiceImpl;
import kr.or.ddit.middle.service.IFanBoardService;
import kr.or.ddit.middle.vo.FanBoardVO;


@WebServlet("/board/fanboardTitleSearch.do")
public class FanboardTitleSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String data = request.getParameter("sword");
		
		IFanBoardService service = FanBoardServiceImpl.getInstance();
		
		List<FanBoardVO> searchList = service.getSearchFanBoard(data);
		
		request.setAttribute("search", searchList);
		
		request.getRequestDispatcher("/html/board/fanboardsearchlist.jsp").forward(request, response);
		
	}

}
