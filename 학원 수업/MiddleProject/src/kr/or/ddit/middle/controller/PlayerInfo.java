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
import kr.or.ddit.middle.vo.PlayerVO;


@WebServlet("/playerInfo.do")
public class PlayerInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String tusu = (String)request.getParameter("name");
		
		IPlayerService service = PlayerServiceImpl.getInstance();
		
		List<PlayerVO> array =  service.playerInfo(tusu);
		

		request.setAttribute("playerInfo", array);
		
		request.getRequestDispatcher("/html/투수소개.jsp").forward(request, response);
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
