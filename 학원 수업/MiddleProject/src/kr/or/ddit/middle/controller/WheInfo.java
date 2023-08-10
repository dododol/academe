package kr.or.ddit.middle.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.middle.service.IPlayerService;
import kr.or.ddit.middle.service.PlayerServiceImpl;
import kr.or.ddit.middle.vo.PitcherVO;
import kr.or.ddit.middle.vo.PlayerVO;


@WebServlet("/wheInfo.do")
public class WheInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String whe = (String)request.getParameter("id");


		IPlayerService service = PlayerServiceImpl.getInstance();
		
		PlayerVO playerVO = service.playerRecord(Integer.parseInt(whe));
		
		PitcherVO playerPitcher = service.playerPitcher(Integer.parseInt(whe));
		
		request.setAttribute("wheInfo", playerVO);
		request.setAttribute("whePitcher", playerPitcher);
		
		request.getRequestDispatcher("/html/wheprofile.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
