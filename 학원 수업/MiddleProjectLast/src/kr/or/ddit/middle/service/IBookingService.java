package kr.or.ddit.middle.service;

import java.util.List;

import kr.or.ddit.middle.vo.BookingVO;
import kr.or.ddit.middle.vo.RefundVO;

public interface IBookingService {
	
	
	
	public List<BookingVO> allPrice6();
	
	public List<BookingVO> allPrice7();
	
	public List<BookingVO> allPrice8();
	
	public List<BookingVO> allPrice9();
	
	public List<RefundVO> refundList();
	
	public List<RefundVO> refundPrice6();
	
	public List<RefundVO> refundPrice7();
	
	public List<RefundVO> refundPrice8();
	
	public List<RefundVO> refundPrice9();
	
	//전체 티켓확인
    public List<BookingVO> allTicket();
    
    // 티켓 환불전 환불테이블에 데이터 삽입
    public int insertRefundA(String num);
    
    // 티켓 취소
    public int cancelTicketA(String num);
    
    //환불 티켓확인
    public List<BookingVO> refundTicketList();
}
