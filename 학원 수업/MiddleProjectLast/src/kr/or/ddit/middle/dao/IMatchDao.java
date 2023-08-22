package kr.or.ddit.middle.dao;

import java.util.List;

import kr.or.ddit.middle.vo.MatchVO;
import kr.or.ddit.middle.vo.TicketVO;

public interface IMatchDao {

	// 경기일정, 에매 (상대팀 로고)
	public String matchAwayList(String date);

	// 전체 경기일정, 예매
	public List<MatchVO> matchList(String awayTeam);

	// 티켓 예매
	public MatchVO ticketChoice(MatchVO ticketVo);

	// 구간(가격)
	public List<MatchVO> sectionPrice();

	// 경기일정 불러오기
	public List<MatchVO> getMatch();

	// ----------------------------------- ticket mapper

	// 경기 일정
	public List<MatchVO> ticketMatchList();

	// 구간(가격)
	public List<TicketVO> ticketSectionList();

	// 예매
	public List<TicketVO> ticketBookingList();

	// 티켓
	public List<TicketVO> ticketTicketList();

	// 상대팀 구단
	public List<MatchVO> ticketAwayImg();

	// -------------------------------------------------

	// 티켓 구매 1
	public int ticketPurchase1(TicketVO ticketpurchase1);

	// ------------------------------------------------

	// 티켓 확인
	public List<TicketVO> getTicket(String id);

	// 티켓 환불전 환불테이블에 데이터 삽입
	public int insertRefund(String num);

	// 티켓 취소
	public int cancelTicket(String num);

	// -------------------------------------
	// 좌석구간 확인
	public List<TicketVO> ticketList();
	
	// -------------------------------
    // 경기 예매 일정
    public List<MatchVO> matchList2();
}
