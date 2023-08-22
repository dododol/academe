package kr.or.ddit.middle.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.middle.vo.BookingVO;
import kr.or.ddit.middle.vo.RefundVO;
import kr.or.ddit.util.MybatisUtil;

public class BookingDaoImpl implements IBookingDao {
	private static BookingDaoImpl dao; 
	 
	private BookingDaoImpl() {}
	
	public static BookingDaoImpl getInstance() {
		if(dao == null) dao = new BookingDaoImpl();
		return dao;
	}

	@Override
	public List<BookingVO> allPrice6() {
		
		SqlSession session = null;
		List<BookingVO> price6List= null;
		
		try {
			session=MybatisUtil.getSqlSession();
			price6List=session.selectList("Booking.allPrice6");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null)session.close();
		}
		
		
		return price6List;
	}

	@Override
	public List<BookingVO> allPrice7() {
		SqlSession session = null;
		List<BookingVO> price7List= null;
		
		try {
			session=MybatisUtil.getSqlSession();
			price7List=session.selectList("Booking.allPrice7");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null)session.close();
		}
		
		
		return price7List;
	}

	@Override
	public List<BookingVO> allPrice8() {
		SqlSession session = null;
		List<BookingVO> price8List= null;
		
		try {
			session=MybatisUtil.getSqlSession();
			price8List=session.selectList("Booking.allPrice8");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null)session.close();
		}
		
		
		return price8List;
	}

	@Override
	public List<BookingVO> allPrice9() {
		SqlSession session = null;
		List<BookingVO> price9List= null;
		
		try {
			session=MybatisUtil.getSqlSession();
			price9List=session.selectList("Booking.allPrice9");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null)session.close();
		}
		
		
		return price9List;
	}

	@Override
	public List<RefundVO> refundList() {
		SqlSession session = null;
		List<RefundVO> refundList= null;
		
		try {
			session=MybatisUtil.getSqlSession();
			refundList=session.selectList("Booking.refundList");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null)session.close();
		}
		
		
		return refundList;
	}

	@Override
	public List<RefundVO> refundPrice6() {
		SqlSession session = null;
		List<RefundVO> refund6List= null;
		
		try {
			session=MybatisUtil.getSqlSession();
			refund6List=session.selectList("Booking.refundPrice6");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null)session.close();
		}
		
		
		return refund6List;
	}

	@Override
	public List<RefundVO> refundPrice7() {
		SqlSession session = null;
		List<RefundVO> refund7List= null;
		
		try {
			session=MybatisUtil.getSqlSession();
			refund7List=session.selectList("Booking.refundPrice7");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null)session.close();
		}
		
		
		return refund7List;
	}
	

	@Override
	public List<RefundVO> refundPrice8() {
		SqlSession session = null;
		List<RefundVO> refund8List= null;
		
		try {
			session=MybatisUtil.getSqlSession();
			refund8List=session.selectList("Booking.refundPrice8");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null)session.close();
		}
		
		
		return refund8List;
	}
	

	@Override
	public List<RefundVO> refundPrice9() {
		SqlSession session = null;
		List<RefundVO> refund9List= null;
		
		try {
			session=MybatisUtil.getSqlSession();
			refund9List=session.selectList("Booking.refundPrice9");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null)session.close();
		}
		
		
		return refund9List;
	}
	
	@Override
	   public List<BookingVO> allTicket() {
	      SqlSession session = null;
	      List<BookingVO> bookingList = null;
	      
	      try {
	         session = MybatisUtil.getSqlSession();
	         bookingList=session.selectList("Booking.allTicket");
	         session.commit();
	      } catch (Exception e) {
	         e.printStackTrace();
	      }finally {
	         if(session != null) session.close();
	      }
	      return bookingList;
	      
	   }

	   @Override
	   public int insertRefundA(String num) {
	       SqlSession session = null;
	         int cnt = 0;
	         
	         try {
	               session = MybatisUtil.getSqlSession();
	               cnt = session.update("Booking.insertRefundA",num);
	               
	               if(cnt>0) {
	                  session.commit();
	               }else {
	                  System.out.println("실패!");
	               }
	               
	            } catch (Exception e) {
	               e.printStackTrace();
	            }finally{
	               if(session != null) session.close();
	            }
	            return cnt;
	   }

	   @Override
	   public int cancelTicketA(String num) {
	       SqlSession session = null;
	         int cnt = 0;
	         
	         try {
	               session = MybatisUtil.getSqlSession();
	               cnt = session.update("Booking.cancelTicketA",num);
	               
	               if(cnt>0) {
	                  session.commit();
	               }else {
	                  System.out.println("실패!");
	               }
	               
	            } catch (Exception e) {
	               e.printStackTrace();
	            }finally{
	               if(session != null) session.close();
	            }
	            return cnt;
	         }

	   @Override
	   public List<BookingVO> refundTicketList() {
	      SqlSession session = null;
	      List<BookingVO> refundList = null;
	      
	      try {
	         session = MybatisUtil.getSqlSession();
	         refundList=session.selectList("Booking.refundTicketList");
	      } catch (Exception e) {
	         e.printStackTrace();
	      }finally {
	         if(session != null) session.close();
	      }
	      return refundList;
	      
	   }
	


}
