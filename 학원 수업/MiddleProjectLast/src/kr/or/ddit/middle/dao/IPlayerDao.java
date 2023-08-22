package kr.or.ddit.middle.dao;

import java.util.List;

import kr.or.ddit.middle.vo.BatterVO;
import kr.or.ddit.middle.vo.PitcherVO;
import kr.or.ddit.middle.vo.PlayerVO;

public interface IPlayerDao {

	// Player 정보
	public List<PlayerVO> playerInfo(String p_position);

	//P_NO에 해당되는 선수를 RETURN
	public PlayerVO playerRecord(int p_no);
	
	//P_NO에 해당되는 PITCHER 값
	public PitcherVO playerPitcher(int p_no);
	
	//P_NO에 해당되는 BATTER 값
	public BatterVO playerBatterVO(int p_no);
	
}
