package kr.or.ddit.middle.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.middle.vo.MatchVO;
import kr.or.ddit.middle.vo.TicketVO;
import kr.or.ddit.util.MybatisUtil;

public class MatchDaoImpl implements IMatchDao {

	private static MatchDaoImpl dao;
	
	private MatchDaoImpl() {}
	
	public static MatchDaoImpl getInstance() {
		if(dao == null) dao = new MatchDaoImpl();
		return dao;
	}
	
	@Override
	public String matchAwayList(String date) {
		SqlSession session = null;
		String awayImg = null;
		
		try {
			session = MybatisUtil.getSqlSession();
			awayImg = session.selectOne("match.matchAwayList", date);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(session != null) session.close();
		}
		
		return awayImg;
	}


	@Override
	public MatchVO ticketChoice(MatchVO ticketVo) {
		SqlSession session = null;
		MatchVO vo = null;
		try {
			session = MybatisUtil.getSqlSession();
			vo = session.selectOne("match.ticketChoice", ticketVo);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(session != null) session.close();
		}
		
		return vo;
	}

	@Override
	public List<MatchVO> sectionPrice() {
		SqlSession session = null;
		List<MatchVO> list = null;
		
		try {
			session = MybatisUtil.getSqlSession();
			list = session.selectList("match.sectionPrice");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(session != null) session.close();
		}
		return list;
	}

	@Override
	public List<MatchVO> matchList(String awayTeam) {
		SqlSession session = null;
		List<MatchVO> list = null;
		
		try {
			session = MybatisUtil.getSqlSession();
			list = session.selectList("match.matchList", awayTeam);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(session != null) session.close();
		}
		
		return list;
	}

	@Override
	public List<MatchVO> ticketMatchList() {
		SqlSession session = null;
		List<MatchVO> list = null;
		try {
			session = MybatisUtil.getSqlSession();
			list = session.selectList("match.matchList");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(session != null) session.close();
		}
		
		return list;
	}

	@Override
	public List<TicketVO> ticketSectionList() {
		SqlSession session = null;
		List<TicketVO> list = null;
		try {
			session = MybatisUtil.getSqlSession();
			list = session.selectList("ticket.ticketSectionList");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(session != null) session.close();
		}
		
		return list;
	}

	@Override
	public List<TicketVO> ticketBookingList() {
		SqlSession session = null;
		List<TicketVO> list = null;
		try {
			session = MybatisUtil.getSqlSession();
			list = session.selectList("ticket.ticketBookingList");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(session != null) session.close();
		}
		
		return list;
	}

	@Override
	public List<TicketVO> ticketTicketList() {
		SqlSession session = null;
		List<TicketVO> list = null;
		try {
			session = MybatisUtil.getSqlSession();
			list = session.selectList("ticket.ticketTicketList");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(session != null) session.close();
		}
		
		return list;
	}

	@Override
	public List<MatchVO> ticketAwayImg() {
		SqlSession session = null;
		List<MatchVO> list = null;
		try {
			session = MybatisUtil.getSqlSession();
			list = session.selectList("ticket.ticketAwayImg");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(session != null) session.close();
		}
		
		return list;
	}
	
	@Override
	   public List<MatchVO> getMatch() {
	      
	      SqlSession session = null;
	      List<MatchVO> matchList = null;
	      
	      try {
	         session = MybatisUtil.getSqlSession();
	         matchList = session.selectList("match.getMatch");
	         
	      } catch (Exception e) {
	         e.printStackTrace();
	      }finally{
	         if(session != null) session.close();
	      }
	      return matchList;
	   }
	
	// 티켓 구매
	   @Override
	   public synchronized int ticketPurchase1(TicketVO ticketpurchase1) {
	      SqlSession session = null;
	      int cnt = 0;
	      
	      try {
	         session = MybatisUtil.getSqlSession();
	         cnt = session.insert("ticket.ticketPurchase1", ticketpurchase1);
	         
	         if(cnt>0) {
	            System.out.println("성공!");
	         }else {
	            System.out.println("실패!");
	         }
	      } catch (Exception e) {
	         e.printStackTrace();
	      }finally{
	         if(session != null) session.commit();
	         if(session != null) session.close();
	      }
	      
	      return cnt;
	   }

	   @Override
	      public List<TicketVO> getTicket(String id) {
	         
	         SqlSession session = null;
	         List<TicketVO> ticketList = null;
	         
	         try {
	               session = MybatisUtil.getSqlSession();
	               ticketList = session.selectList("ticket.getTicket",id);
	               
	            } catch (Exception e) {
	               e.printStackTrace();
	            }finally{
	               if(session != null) session.close();
	            }
	            return ticketList;
	         }
	      
	      @Override
	      public int insertRefund(String num) {
	         
	         SqlSession session = null;
	         int cnt = 0;
	         
	         try {
	               session = MybatisUtil.getSqlSession();
	               cnt = session.update("ticket.insertRefund",num);
	               
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
	      public int cancelTicket(String num) {
	         
	         SqlSession session = null;
	         int cnt = 0;
	         
	         try {
	               session = MybatisUtil.getSqlSession();
	               cnt = session.update("ticket.cancelTicket",num);
	               
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
	   public List<TicketVO> ticketList() {
	      SqlSession session = null;
	      List<TicketVO> list = null;
	      
	      try {
	         session = MybatisUtil.getSqlSession();
	         list = session.selectList("ticket.ticketList");
	         
	      } catch (Exception e) {
	         e.printStackTrace();
	      }finally{
	            if(session != null) session.close();
	         }
	      
	      return list;
	   }
	
	   
	   // 경기 일정 예매
	   @Override
	   public List<MatchVO> matchList2() {
	      SqlSession session = null;
	      List<MatchVO> matchList2 = null;
	      
	      try {
	         session = MybatisUtil.getSqlSession();
	         matchList2 = session.selectList("match.matchList2");
	         
	      } catch (Exception e) {
	         e.printStackTrace();
	      }finally{
	            if(session != null) session.close();
	         }
	      
	      return matchList2;
	   }

}
