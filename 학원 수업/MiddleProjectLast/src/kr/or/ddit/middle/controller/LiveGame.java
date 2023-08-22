package kr.or.ddit.middle.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.middle.service.ILiveGameService;
import kr.or.ddit.middle.service.LiveGameServiceImpl;
import kr.or.ddit.middle.vo.AwayVO;
import kr.or.ddit.middle.vo.LBatterVO;
import kr.or.ddit.middle.vo.LPitcherVO;




@WebServlet("/liveGame.do")
public class LiveGame extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		ILiveGameService service = LiveGameServiceImpl.getInstance();
		System.out.println("컨트롤러");
		
		String selectedTeam = request.getParameter("selectedTeam");
		
		List<LPitcherVO> plist = service.getPitcher();
		
		request.setAttribute("Pitcher", plist);
		
		List<LBatterVO> blist = service.getBatter();
		
		request.setAttribute("Batter", blist);
		
		List<AwayVO> alist = service.getAway(selectedTeam);
		
		request.setAttribute("Away", alist);
		
		request.getRequestDispatcher("/html/liveGame/liveGame.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
