package kr.or.ddit.middle.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.middle.service.IMatchService;
import kr.or.ddit.middle.service.MatchServiceImpl;
import kr.or.ddit.middle.vo.MatchVO;

@WebServlet("/matchInfo.do")
public class MatchInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		MatchVO match = new MatchVO();
		
		//service객체 얻기
		IMatchService service = MatchServiceImpl.getInstance();
		
		//service메소드 호출하기 - 결과값 받기
		List<MatchVO> matchList = service.getMatch();
		
		//System.out.println("matchList"+matchList);
		
		//request에 결과저장
		request.setAttribute("list", matchList);
		
		//view 페이지로 이동
		request.getRequestDispatcher("/html/경기일정.jsp").forward(request, response);
		
	}

}
