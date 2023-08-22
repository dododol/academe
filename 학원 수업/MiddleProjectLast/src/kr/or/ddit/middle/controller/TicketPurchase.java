package kr.or.ddit.middle.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.middle.service.IMatchService;
import kr.or.ddit.middle.service.MatchServiceImpl;
import kr.or.ddit.middle.vo.LoginVO;
import kr.or.ddit.middle.vo.TicketVO;


@WebServlet("/ticketPurchase.do")
public class TicketPurchase extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// MEM_ID 회원아이디
		LoginVO loginId = (LoginVO)request.getSession().getAttribute("loginSign");
		String memId = loginId.getMem_id();
	
		// M_DATE 경기일자
		String matchDate = request.getParameter("mDate");
		System.out.println("matchDate : "+matchDate);
		
		// S_SECTION 좌석구간
		String matchSection = request.getParameter("siteted");
		System.out.println("matchSection : "+ matchSection);
		
		// B_SEAT 좌석번호 12 , 10 , 9 ,
		String charnumtd = request.getParameter("charnumtd").replaceAll(" ", "");
		
		System.out.println("charnumtd===========================" + charnumtd);
		String[] seatList = null; 
		if(charnumtd.contains(",")) {
			// 1,2,10
			seatList = charnumtd.split(",");
			// seatList[0] = 1
			// seatList[1] = 2
			// seatList[3] = 10
		}
		ArrayList<Integer> seatForRegList = new ArrayList<Integer>();
		if(seatList!=null) {
			for(int i = 0 ; i < seatList.length ; i++) {
				seatForRegList.add(Integer.parseInt(seatList[i])); 
				System.out.println("seatForRegList======i if =====" + seatForRegList.get(i) );
			}
		}
		
		// B_COUNTTTICKET 티켓 장수
		int matchTicketNumber = Integer.parseInt(request.getParameter("tiketsutd"));
		System.out.println("matchTicketNumber : "+ matchTicketNumber);
		
		// B_PRICE 티켓 가격
		String ticketPrice = request.getParameter("moneytd").replaceAll(",", "");
		int price = Integer.parseInt(ticketPrice);
		System.out.println(price);

		// B_TOTALPRICE 티켓 총 가격
		String matchTotalPrice = request.getParameter("allmoneytd").replaceAll(",", "");
		int totalPrice = Integer.parseInt(matchTotalPrice);
		
		// A_NAME 이름
		String awayTeam = request.getParameter("awayTeam");
		
		
		
		int insertTicket = 0;
		IMatchService service = MatchServiceImpl.getInstance();
		
		for(int i=0; i<seatForRegList.size(); i++) {
			
		
			System.out.println("get==seat =========" +  seatForRegList.get(i));
			TicketVO vo1 = new TicketVO();
			
			vo1.setM_date(matchDate);
			vo1.setS_section(matchSection);
			vo1.setB_counttticket(matchTicketNumber);
			vo1.setB_price(price);
			vo1.setB_totalprice(totalPrice);
			vo1.setMem_id(memId);
			vo1.setA_name(awayTeam);
			
			vo1.setB_seat(seatForRegList.get(i));
			
			
			insertTicket += service.ticketPurchase1(vo1);
			
			
			
		}
		
		
	
		if(insertTicket > 0) {
			System.out.println("성공");
			request.setAttribute("ticketPurcahse", insertTicket);
			request.getRequestDispatcher("/html/예매내역.jsp").forward(request, response);
		}else {
			System.out.println("실패");
			request.getRequestDispatcher("/html/예매상세2.jsp").forward(request, response);
		}
	
		
		
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		      request.setCharacterEncoding("UTF-8");
		      // MEM_ID 회원아이디
		            LoginVO loginId = (LoginVO)request.getSession().getAttribute("loginSign");
		            String memId = loginId.getMem_id();
		         
		            // M_DATE 경기일자
		            String matchDate = request.getParameter("mDate");
		            
		            
		            // S_SECTION 좌석구간
		            String matchSection = request.getParameter("siteted");
		            
		            
		            // B_SEAT 좌석번호 12 , 10 , 9 ,
		            String charnumtd = request.getParameter("charnumtd").replaceAll(" ", "");
		            
		            System.out.println("charnumtd===========================" + charnumtd);
		            String[] seatList = null; 
		            if(charnumtd.contains(",")) {
		               // 1,2,10
		               seatList = charnumtd.split(",");
		               // seatList[0] = 1
		               // seatList[1] = 2
		               // seatList[3] = 10
		            }else {
		            	seatList = new String[1];
		            	seatList[0] = charnumtd;
		            }
		            ArrayList<Integer> seatForRegList = new ArrayList<Integer>();
		            if(seatList!=null) {
		               for(int i = 0 ; i < seatList.length ; i++) {
		                  seatForRegList.add(Integer.parseInt(seatList[i])); 
		                  System.out.println("seatForRegList======i if =====" + seatForRegList.get(i) );
		               }
		            }
		            
		            // B_COUNTTTICKET 티켓 장수
		            int matchTicketNumber = Integer.parseInt(request.getParameter("tiketsutd"));
		            System.out.println("matchTicketNumber : "+ matchTicketNumber);
		            
		            // B_PRICE 티켓 가격
		            String ticketPrice = request.getParameter("moneytd").replaceAll(",", "");
		            int price = Integer.parseInt(ticketPrice);
		         

		            // B_TOTALPRICE 티켓 총 가격
		            String matchTotalPrice = request.getParameter("allmoneytd").replaceAll(",", "");
		            int totalPrice = Integer.parseInt(matchTotalPrice);
		            
		            // A_NAME 이름
		            String awayTeam = request.getParameter("awayTeam");
		            
		            
		            
		            int insertTicket = 0;
		            IMatchService service = MatchServiceImpl.getInstance();
		            
		            for(int i=0; i<seatForRegList.size(); i++) {
		               
		            
		               System.out.println("get==seat =========" +  seatForRegList.get(i));
		               TicketVO vo1 = new TicketVO();
		               
		               vo1.setM_date(matchDate);
		               vo1.setS_section(matchSection);
		               vo1.setB_counttticket(matchTicketNumber);
		               vo1.setB_price(price);
		               vo1.setB_totalprice(totalPrice);
		               vo1.setMem_id(memId);
		               vo1.setA_name(awayTeam);
		               
		               vo1.setB_seat(seatForRegList.get(i));
		               
		               
		               insertTicket += service.ticketPurchase1(vo1);
		               
		               
		               
		            }
		            
		            System.out.println("memId : " + memId);
		            System.out.println("matchDate : "+matchDate);
		            System.out.println("matchSection : "+ matchSection);
		            System.out.println("seatForRegList : " + seatForRegList);
		            System.out.println("matchTicketNumber : " + matchTicketNumber);
		            System.out.println("price : " + price);
		            System.out.println("totalPrice : " + totalPrice);
		            System.out.println("awayTeam : " + awayTeam);
		            System.out.println("insertTicket : " + insertTicket);
		            
		         
		            if(insertTicket > 0) {
		               System.out.println("성공");
		       //        request.setAttribute("ticketPurcahse", insertTicket);
		               request.getRequestDispatcher("/ticketCheck.do").forward(request, response);
		               //response.sendRedirect(request.getContextPath()+"/ticketCheck.do");
		               
		            }else {
		               System.out.println("실패");
		               request.getRequestDispatcher("/html/예매상세2.jsp").forward(request, response);
		            }
		   }
	}


