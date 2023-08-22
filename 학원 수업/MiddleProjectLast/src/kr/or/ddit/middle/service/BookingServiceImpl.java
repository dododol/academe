package kr.or.ddit.middle.service;

import java.util.List;

import kr.or.ddit.middle.dao.BookingDaoImpl;
import kr.or.ddit.middle.dao.IBookingDao;
import kr.or.ddit.middle.dao.IPlayerDao;
import kr.or.ddit.middle.dao.PlayerDaoImpl;
import kr.or.ddit.middle.vo.BookingVO;
import kr.or.ddit.middle.vo.RefundVO;

public class BookingServiceImpl implements IBookingService {

private IBookingDao dao;
	
	private static BookingServiceImpl service; 
	
	private BookingServiceImpl() {
		dao = BookingDaoImpl.getInstance();
	}
	
	public static BookingServiceImpl getInstance() {
		if(service == null) service = new BookingServiceImpl();
		return service;
	}

	@Override
	public List<BookingVO> allPrice6() {

		return dao.allPrice6();
	}
	
	@Override
	public List<BookingVO> allPrice7() {
		
		return dao.allPrice7();
	}

	@Override
	public List<BookingVO> allPrice8() {
		return dao.allPrice8();
	}

	@Override
	public List<BookingVO> allPrice9() {
		return dao.allPrice9();
	}

	@Override
	public List<RefundVO> refundList() {
		return dao.refundList();
	}

	@Override
	public List<RefundVO> refundPrice6() {
		return dao.refundPrice6();
	}

	@Override
	public List<RefundVO> refundPrice7() {
		return dao.refundPrice7();
	}

	@Override
	public List<RefundVO> refundPrice8() {
		return dao.refundPrice8();
	}

	@Override
	public List<RefundVO> refundPrice9() {
		return dao.refundPrice9();
	}
	
	@Override
	   public List<BookingVO> allTicket() {
	      return dao.allTicket();
	   }

	   @Override
	   public int insertRefundA(String num) {
	      return dao.insertRefundA(num);
	   }

	   @Override
	   public int cancelTicketA(String num) {
	      return dao.cancelTicketA(num);
	   }

	   @Override
	   public List<BookingVO> refundTicketList() {
	      return dao.refundTicketList();
	   }
	

}
