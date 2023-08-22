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
import kr.or.ddit.middle.vo.LoginVO;
import kr.or.ddit.middle.vo.MatchVO;
import kr.or.ddit.middle.vo.TicketVO;


@WebServlet("/ticket.do")
public class Ticket extends HttpServlet {
   private static final long serialVersionUID = 1L;


   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      request.setCharacterEncoding("utf-8");
      
      String awayName = request.getParameter("ticket");
      
      IMatchService service = MatchServiceImpl.getInstance();
      
      // 경기 예매 버튼 후 전체 일정 출력
      List<MatchVO> ticketMatchList = service.ticketMatchList();
      
      // 경기예매 전체 출력
       LoginVO loginVO = (LoginVO)request.getSession().getAttribute("loginSign");
         String id = loginVO.getMem_id();
         
         
         List<TicketVO> ticketList = service.getTicket(id);
         
         request.setAttribute("getTicket", ticketList);
         
         
         // 경기 예매 (현재날짜 이후 ) 출력
         List<MatchVO> matchList2 = service.matchList2();
         request.setAttribute("matchList2", matchList2);
         
         
         // 좌석구간 확인하려고 하는데.,.
         List<TicketVO> list = service.ticketList();
         
         request.setAttribute("ticketList", list);
         
      
      
      // 좌석 구간 출력
      List<TicketVO> ticketSection = service.ticketSectionList();

      
      request.setAttribute("ticketMatchList", ticketMatchList);
      request.setAttribute("sectionList", ticketSection);

      
      request.getRequestDispatcher("/html/예매상세2.jsp").forward(request, response);
      
      

      
      
   }

   
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
      doGet(request, response);
   }

}