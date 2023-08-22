package kr.or.ddit.middle.service;

import java.util.List;

import kr.or.ddit.middle.dao.LiveGameDaoImpl;
import kr.or.ddit.middle.vo.AwayVO;
import kr.or.ddit.middle.vo.LBatterVO;
import kr.or.ddit.middle.vo.LPitcherVO;

public class LiveGameServiceImpl implements ILiveGameService {
	
	private LiveGameDaoImpl dao;

	private static LiveGameServiceImpl service;

	// 2번
	//private MemberServiceImpl() {}
	
	// 생성자
	private LiveGameServiceImpl() {
		//dao = new LiveGameDaoImpl(); // DAO객체 생성
		dao = LiveGameDaoImpl.getInstance();
	} 
	
	// 3번
	public static LiveGameServiceImpl getInstance() {
		if(service==null) service = new LiveGameServiceImpl();
		return service;
	}
	

	@Override
	public List<LPitcherVO> getPitcher() {
		// TODO Auto-generated method stub
		return dao.getPitcher();
	}

	@Override
	public List<LBatterVO> getBatter() {
		// TODO Auto-generated method stub
		return dao.getBatter();
	}

	@Override
	public List<AwayVO> getAway(String team) {
		// TODO Auto-generated method stub
		return dao.getAway(team);
	}

}
