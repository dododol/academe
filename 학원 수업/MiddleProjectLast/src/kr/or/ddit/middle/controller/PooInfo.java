package kr.or.ddit.middle.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.middle.service.IPlayerService;
import kr.or.ddit.middle.service.PlayerServiceImpl;
import kr.or.ddit.middle.vo.BatterVO;
import kr.or.ddit.middle.vo.PlayerVO;


@WebServlet("/pooInfo.do")
public class PooInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String poo = (String)request.getParameter("id");

		IPlayerService service = PlayerServiceImpl.getInstance();
		
		PlayerVO playerVO = service.playerRecord(Integer.parseInt(poo));
		
		BatterVO playerBatter = service.playerBatterVO(Integer.parseInt(poo));
		request.setAttribute("pooInfo", playerVO);
		request.setAttribute("pooBatter", playerBatter);
		
		System.out.println("playerVO : " + playerVO);
		System.out.println("playerBatter : " + playerBatter);
		
		
		request.getRequestDispatcher("/html/pooprofile.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
