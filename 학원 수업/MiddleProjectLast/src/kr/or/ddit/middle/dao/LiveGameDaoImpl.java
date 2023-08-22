package kr.or.ddit.middle.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.middle.vo.AwayVO;
import kr.or.ddit.middle.vo.LBatterVO;
import kr.or.ddit.middle.vo.LPitcherVO;
import kr.or.ddit.util.MybatisUtil;


public class LiveGameDaoImpl implements ILiveGameDao {
	

	private static  LiveGameDaoImpl dao;

	private LiveGameDaoImpl() {}

	public static LiveGameDaoImpl getInstance() {
		if(dao==null) dao = new LiveGameDaoImpl();
		return dao;
	}
	
	SqlSession session = null;
	


	@Override
	public List<LPitcherVO> getPitcher() {
		List<LPitcherVO> pitcherList = null;
		try {
			session = MybatisUtil.getSqlSession();
			pitcherList = session.selectList("player.getPitcher");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null)session.close();
		}
		return pitcherList;
	}

	@Override
	public List<LBatterVO> getBatter() {
		List<LBatterVO> batterList = null;
		try {
			session = MybatisUtil.getSqlSession();
			batterList = session.selectList("player.getBatter");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(session!=null)session.close();
		}
		return batterList;
	}

	@Override
	public List<AwayVO> getAway(String team) {
		List<AwayVO> AwayList = null;
		try {
			session = MybatisUtil.getSqlSession();
			AwayList = session.selectList("player.getAway", team);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(session!=null)session.close();
		}
		return AwayList;
	}


}
