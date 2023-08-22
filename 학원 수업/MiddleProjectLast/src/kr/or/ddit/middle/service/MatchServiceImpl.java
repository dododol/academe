package kr.or.ddit.middle.service;

import java.util.List;

import kr.or.ddit.middle.dao.IMatchDao;
import kr.or.ddit.middle.dao.MatchDaoImpl;
import kr.or.ddit.middle.vo.MatchVO;
import kr.or.ddit.middle.vo.TicketVO;

public class MatchServiceImpl implements IMatchService {

	private IMatchDao dao;

	private static MatchServiceImpl service;

	private MatchServiceImpl() {
		dao = MatchDaoImpl.getInstance();
	}

	public static MatchServiceImpl getInstance() {
		if (service == null)
			service = new MatchServiceImpl();
		return service;
	}

	@Override
	public String matchAwayList(String date) {
		// TODO Auto-generated method stub
		return dao.matchAwayList(date);
	}

	@Override
	public MatchVO ticketChoice(MatchVO ticketVo) {
		// TODO Auto-generated method stub
		return dao.ticketChoice(ticketVo);
	}

	@Override
	public List<MatchVO> sectionPrice() {
		// TODO Auto-generated method stub
		return dao.sectionPrice();
	}

	@Override
	public List<MatchVO> matchList(String awayTeam) {
		// TODO Auto-generated method stub
		return dao.matchList(awayTeam);
	}

	@Override
	public List<MatchVO> ticketMatchList() {
		// TODO Auto-generated method stub
		return dao.ticketMatchList();
	}

	@Override
	public List<TicketVO> ticketSectionList() {
		// TODO Auto-generated method stub
		return dao.ticketSectionList();
	}

	@Override
	public List<TicketVO> ticketBookingList() {
		// TODO Auto-generated method stub
		return dao.ticketBookingList();
	}

	@Override
	public List<TicketVO> ticketTicketList() {
		// TODO Auto-generated method stub
		return dao.ticketTicketList();
	}

	@Override
	public List<MatchVO> ticketAwayImg() {
		// TODO Auto-generated method stub
		return dao.ticketAwayImg();
	}

	@Override
	public List<MatchVO> getMatch() {
		return dao.getMatch();
	}

	// --------------------------
	@Override
	public synchronized int ticketPurchase1(TicketVO ticketpurchase1) {
		// TODO Auto-generated method stub
		return dao.ticketPurchase1(ticketpurchase1);
	}

	@Override
	public List<TicketVO> getTicket(String id) {
		return dao.getTicket(id);
	}

	@Override
	public int insertRefund(String num) {
		return dao.insertRefund(num);
	}

	@Override
	public int cancelTicket(String num) {
		return dao.cancelTicket(num);
	}

	@Override
	public List<TicketVO> ticketList() {
		// TODO Auto-generated method stub
		return dao.ticketList();
	}
	
	// ------------------ 경기 일정
	   
	@Override
	public List<MatchVO> matchList2() {
		// TODO Auto-generated method stub
	    return dao.matchList2();
	   }

}
