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
import kr.or.ddit.middle.vo.PitcherVO;
import kr.or.ddit.middle.vo.PlayerVO;


@WebServlet("/tusuInfo.do")
public class TusuInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tusu = (String)request.getParameter("id");

		System.out.println("tusu : " + tusu);

		IPlayerService service = PlayerServiceImpl.getInstance();
		
		PlayerVO playerVO = service.playerRecord(Integer.parseInt(tusu));
		System.out.println("playerVO : " + playerVO);
		
		PitcherVO playerPitcher = service.playerPitcher(Integer.parseInt(tusu));
		System.out.println("playerPitcher : " + playerVO);
		
		request.setAttribute("tusuInfo", playerVO);
		request.setAttribute("tusuPitcher", playerPitcher);
		
		request.getRequestDispatcher("/html/profile.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
