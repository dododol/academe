package kr.or.ddit.middle.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.middle.service.BookingServiceImpl;
import kr.or.ddit.middle.service.IBookingService;

@WebServlet("/adminTicketCancel.do")
public class AdminTicketCancel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		String b_no = request.getParameter("b_no");
		
		
		IBookingService bookservice = BookingServiceImpl.getInstance();
		
		int inres = bookservice.insertRefundA(b_no);
		
		int cares = bookservice.cancelTicketA(b_no);
		
		request.getRequestDispatcher("/adminManager.do").forward(request, response);
		
	}


}
