package kr.or.ddit.middle.dao;



import java.util.List;

import kr.or.ddit.middle.vo.AwayVO;
import kr.or.ddit.middle.vo.LBatterVO;
import kr.or.ddit.middle.vo.LPitcherVO;



public interface ILiveGameDao {

	public List<LPitcherVO> getPitcher();
	public List<LBatterVO> getBatter();
	public List<AwayVO> getAway(String team);
}
