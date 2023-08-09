package kr.or.ddit.middle.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.middle.vo.PitcherVO;
import kr.or.ddit.middle.vo.PlayerVO;
import kr.or.ddit.util.MybatisUtil;

public class PlayerDaoImpl implements IPlayerDao {
	
	private static PlayerDaoImpl dao; 
	 
	private PlayerDaoImpl() {}
	
	public static PlayerDaoImpl getInstance() {
		if(dao == null) dao = new PlayerDaoImpl();
		return dao;
	}

	@Override
	public List<PlayerVO> playerInfo(String p_position) {
		SqlSession session = null;
		List<PlayerVO> list = null;
		
		try {
			session = MybatisUtil.getSqlSession();
			list = session.selectList("player.playerInfo", p_position);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session != null) session.close();
		}
		return list;
	}

	//P_NO에 해당되는 선수를 RETURN
	@Override
	public PlayerVO playerRecord(int p_no) {
		SqlSession session = null;
		PlayerVO playerVO = null;
		
		try {
			session = MybatisUtil.getSqlSession();
			playerVO = session.selectOne("player.playerRecord", p_no);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session != null) session.close();
		}
		return playerVO;
	}

	@Override
	public PitcherVO playerPitcher(int p_no) {
		SqlSession session = null;
		PitcherVO PitcherVO = null;
		
		try {
			session = MybatisUtil.getSqlSession();
			PitcherVO = session.selectOne("player.playerPitcher", p_no);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session != null) session.close();
		}
		return PitcherVO;
	}
	


}
