package kr.or.ddit.middle.service;

import java.util.List;

import kr.or.ddit.middle.dao.IPlayerDao;
import kr.or.ddit.middle.dao.PlayerDaoImpl;
import kr.or.ddit.middle.vo.BatterVO;
import kr.or.ddit.middle.vo.PitcherVO;
import kr.or.ddit.middle.vo.PlayerVO;

public class PlayerServiceImpl implements IPlayerService {

	private IPlayerDao dao;
	
	private static PlayerServiceImpl service; 
	
	private PlayerServiceImpl() {
		dao = PlayerDaoImpl.getInstance();
	}
	
	public static PlayerServiceImpl getInstance() {
		if(service == null) service = new PlayerServiceImpl();
		return service;
	}

	@Override
	public List<PlayerVO> playerInfo(String p_position) {
		// TODO Auto-generated method stub
		return dao.playerInfo(p_position);
	}

	//P_NO에 해당되는 선수를 RETURN
	@Override
	public PlayerVO playerRecord(int p_no) {
		return dao.playerRecord(p_no);
	}
	
	//P_NO에 해당되는 선수 Pitcher
	@Override
	public PitcherVO playerPitcher(int p_no) {
		// TODO Auto-generated method stub
		return dao.playerPitcher(p_no);
	}
	
	@Override
	public BatterVO playerBatterVO(int p_no) {
		return dao.playerBatterVO(p_no);
	}


	
	
	
	


}
