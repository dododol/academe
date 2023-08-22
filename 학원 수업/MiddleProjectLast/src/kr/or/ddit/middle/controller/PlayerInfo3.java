package kr.or.ddit.middle.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.middle.service.IPlayerService;
import kr.or.ddit.middle.service.PlayerServiceImpl;
import kr.or.ddit.middle.vo.BatterVO;
import kr.or.ddit.middle.vo.PlayerVO;


@WebServlet("/playerInfo3.do")
public class PlayerInfo3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String player3 = (String)request.getParameter("name");
		IPlayerService service = PlayerServiceImpl.getInstance();
		
		
		List<PlayerVO> array =  service.playerInfo(player3);
		
		request.setAttribute("playerInfo3", array);
		
		
		request.getRequestDispatcher("/html/whe.jsp").forward(request, response);
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
