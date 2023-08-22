package kr.or.ddit.middle.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.middle.service.BookingServiceImpl;
import kr.or.ddit.middle.service.IBookingService;
import kr.or.ddit.middle.service.ILoginService;
import kr.or.ddit.middle.service.LoginServiceImpl;
import kr.or.ddit.middle.vo.BookingVO;
import kr.or.ddit.middle.vo.LoginVO;
import kr.or.ddit.middle.vo.RefundVO;


@WebServlet("/adminManager.do")
public class AdminManager extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		
		ILoginService Loginservice = LoginServiceImpl.getInstance();
		List<LoginVO> list = Loginservice.getMemberAll();
		
		
		IBookingService Bookservice = BookingServiceImpl.getInstance();
		ILoginService service = LoginServiceImpl.getInstance();
		IBookingService bookservice = BookingServiceImpl.getInstance();

			List<BookingVO> price6List = Bookservice.allPrice6();
			List<BookingVO> price7List = Bookservice.allPrice7();
			List<BookingVO> price8List = Bookservice.allPrice8();
			List<BookingVO> price9List = Bookservice.allPrice9();
			List<RefundVO> refund6List = Bookservice.refundPrice6();
			List<RefundVO> refund7List = Bookservice.refundPrice7();
			List<RefundVO> refund8List = Bookservice.refundPrice8();
			List<RefundVO> refund9List = Bookservice.refundPrice9();
			
			List<LoginVO> memList = service.getMemberAll();
		    List<BookingVO> ticketList = bookservice.allTicket();
		    List<BookingVO> refundList = bookservice.refundTicketList();
			
			request.setAttribute("refund6List", refund6List);
			request.setAttribute("refund7List", refund7List);
			request.setAttribute("refund8List", refund8List);
			request.setAttribute("refund9List", refund9List);
			
			request.setAttribute("price6List", price6List);
			request.setAttribute("price7List", price7List);
			request.setAttribute("price8List", price8List);
			request.setAttribute("price9List", price9List);
			
			      
			request.setAttribute("allTicket", ticketList);
			request.setAttribute("memberInfoList", memList);
			request.setAttribute("refundTicketList", refundList);

			
		request.getRequestDispatcher("/html/AdminPage.jsp").forward(request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
