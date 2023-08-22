package kr.or.ddit.middle.controller;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import kr.or.ddit.middle.service.ILiveGameService;
import kr.or.ddit.middle.service.LiveGameServiceImpl;
import kr.or.ddit.middle.vo.LBatterVO;
import kr.or.ddit.middle.vo.LPitcherVO;


@WebServlet("/gameProcess.do")
public class GameProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ILiveGameService service = LiveGameServiceImpl.getInstance();
	List<LBatterVO> blist = service.getBatter();
	List<LPitcherVO> plist = service.getPitcher();
	Random rand;

	
	public int top() {

	    final int SINGLE = 1;
	    final int DOUBLE = 2;
	    final int TRIPLE = 3;
	    final int HOMERUN = 4;
	    final int STRIKE = 6;
	    final int BALL = 7;
	    final int OUT = 8;
	    
	    int result = 0;
	    
	    LPitcherVO targetPitcher = null;
	    for (LPitcherVO pitcher : plist) {
	        if ("오경석".equals(pitcher.getP_name())) {
	            targetPitcher = pitcher;
	            System.out.println(pitcher.getP_name());
	            break;
	        }
	    }

	    if (targetPitcher != null) {
	
		double SOAVG = (3*targetPitcher.getPso())/(10*targetPitcher.getIp()); // 스트라이크 확률
		double BBAVG = (6*targetPitcher.getPbb())/(10*targetPitcher.getIp()); // 볼 확률
		double SingleAVG = targetPitcher.getPhits()/(10*targetPitcher.getIp()); // 1루타 확룰
		double DoubleAVG = targetPitcher.getPhits()/(20*targetPitcher.getIp()); // 2루타 확률
		double TripleAVG = targetPitcher.getPhits()/(80*targetPitcher.getIp()); // 3루타 확률
		double HRAVG = targetPitcher.getPhr()/(10*targetPitcher.getIp()); // 홈런 확룰
					
	   
	
		rand = new Random();
		double gen = rand.nextDouble();
			
		if (gen <= BBAVG)
			result = BALL;
		else if (gen <= BBAVG+SingleAVG)
			result = SINGLE;
		else if (gen <= BBAVG+SingleAVG+DoubleAVG)
			result = DOUBLE;
		else if (gen <= BBAVG+SingleAVG+DoubleAVG+TripleAVG)
			result = TRIPLE;
		else if (gen <= BBAVG+SingleAVG+DoubleAVG+TripleAVG+HRAVG)
			result = HOMERUN;
		else if (gen <= BBAVG+SingleAVG+DoubleAVG+TripleAVG+HRAVG+SOAVG)
			result = STRIKE;
		else
			result = OUT;
		
	    } 
	    return result;	
	}
	
	public int bottom() {

	    final int SINGLE = 1;
	    final int DOUBLE = 2;
	    final int TRIPLE = 3;
	    final int HOMERUN = 4;
	    final int HBP = 5;
	    final int STRIKE = 6;
	    final int BALL = 7;
	    final int OUT = 8;

	    int lineup = 1;
	    int result = 0; // 타격 결과 변수를 메소드 내부에서 선언

	    LBatterVO targetBatter = null;
	    for (LBatterVO batter : blist) {
	        Integer batterLineup = batter.getLineup(); // batter.getLineup()의 값을 변수에 저장
	        if (batterLineup != null && batterLineup >= 1 && batterLineup <= 9) {
	            // batter.getLineup()의 값이 null이 아니고 1에서 9 사이의 값인 경우에만 반복 실행
	            if (lineup == batterLineup) {
	                targetBatter = batter;
	                System.out.println(batter.getP_name());
	                lineup++;
	                if (lineup > 9) {
	                    lineup = 1;
	                }
	                // break 문을 이동하여 모든 선수들의 스탯을 순차적으로 확인하도록 수정
	            }
	    }

	        double SOAVG = (2*targetBatter.getStrikeouts()) / targetBatter.getPa(); // 스트라이크 확률
	        double BBAVG = (2*targetBatter.getBb()) / targetBatter.getPa(); // 볼 확률
	        double HBPAVG = targetBatter.getHbp() / targetBatter.getPa(); // 몸에 맞는 공 확률
	        double SingleAVG = targetBatter.getSingles() / targetBatter.getPa(); // 1루타 확률
	        double DoubleAVG = (2*targetBatter.getDoubles()) / targetBatter.getPa(); // 2루타 확률
	        double TripleAVG = (2*targetBatter.getTriples()) / targetBatter.getPa(); // 3루타 확률
	        double HRAVG = (2*targetBatter.getHr()) / targetBatter.getPa(); // 홈런확률

	        System.out.println(targetBatter.getP_name()+"스트라이크 확률:"+SOAVG);
	        System.out.println(targetBatter.getP_name()+"볼 확률:"+BBAVG);
	        System.out.println(targetBatter.getP_name()+"몸에 맞는 공 확률:"+HBPAVG);
	        System.out.println(targetBatter.getP_name()+"1루타 확률:"+SingleAVG);
	        System.out.println(targetBatter.getP_name()+"2루타 확률:"+DoubleAVG);
	        System.out.println(targetBatter.getP_name()+"3루타 확률:"+TripleAVG);
	        System.out.println(targetBatter.getP_name()+"홈런 확률:"+HRAVG);

	        Random rand = new Random();
	        double gen = rand.nextDouble();
	        System.out.println(gen);
	        if (gen <= BBAVG)
	            result = BALL;
	        else if (gen <= BBAVG + SingleAVG)
	            result = SINGLE;
	        else if (gen <= BBAVG + SingleAVG + DoubleAVG)
	            result = DOUBLE;
	        else if (gen <= BBAVG + SingleAVG + DoubleAVG + TripleAVG)
	            result = TRIPLE;
	        else if (gen <= BBAVG + SingleAVG + DoubleAVG + TripleAVG + HRAVG)
	            result = HOMERUN;
	        else if (gen <= BBAVG + SingleAVG + DoubleAVG + TripleAVG + HRAVG + HBPAVG)
	            result = HBP;
	        else if (gen <= BBAVG + SingleAVG + DoubleAVG + TripleAVG + HRAVG + HBPAVG + SOAVG)
	            result = STRIKE;
	        else
	            result = OUT;

	    }
	    return result;
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		int res1 = top();
		int res2 = bottom();
		
		
		request.setAttribute("Batter", blist);
		request.setAttribute("Pitcher", plist);
		request.setAttribute("Top", res1);
		request.setAttribute("Bottom", res2);
		

		response.setContentType("application/json; charset=utf-8");
		JsonObject jobj = new JsonObject();
		jobj.addProperty("res1", res1);
		jobj.addProperty("res2", res2);
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(new Gson().toJson(jobj));
      
		
		//request.getRequestDispatcher("/livegame/liveGame.jsp").forward(request, response);
		
	}
	
	
}
