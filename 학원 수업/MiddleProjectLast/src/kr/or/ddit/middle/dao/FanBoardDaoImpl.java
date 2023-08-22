package kr.or.ddit.middle.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.middle.vo.FanBoardVO;
import kr.or.ddit.util.MybatisUtil;

public class FanBoardDaoImpl implements IFanBoardDao {

	private static IFanBoardDao dao;

	private FanBoardDaoImpl() {
	}

	public static IFanBoardDao getInstance() {
		if (dao == null)
			dao = new FanBoardDaoImpl();
		return dao;
	}

	@Override
	public int insertFanBoard(FanBoardVO fanVO) {

		SqlSession session = null;
		int cnt = 0;

		try {
			session = MybatisUtil.getSqlSession();
			cnt = session.insert("fanBoard.insertFanBoard", fanVO);

			if (cnt > 0)
				session.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}

		return cnt;
	}

	@Override
	public int getMaxId() {

		SqlSession session = null;
		int MaxNo = 0;
		try {
			session = MybatisUtil.getSqlSession();
			MaxNo = session.selectOne("fanBoard.getMaxId");
			
			if (MaxNo > 0)
				session.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}

		return MaxNo;
	}

	@Override
	public List<FanBoardVO> selectFanBoardList() {

		SqlSession session = null;
		List<FanBoardVO> list = null;
		
		try {
			session = MybatisUtil.getSqlSession();
			list = session.selectList("fanBoard.selectFanBoardList");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}

		return list;
		
	}

	@Override
	public int updateFanBoard(FanBoardVO fanVO) {

		SqlSession session = null;
		int cnt = 0;

		try {
			session = MybatisUtil.getSqlSession();
			cnt = session.update("fanBoard.updateFanBoard", fanVO);
			if (cnt > 0) {
				session.commit();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}

		return cnt;
	}

	@Override
	public int deleteFanBoard(int b_no) {

		SqlSession session = null;
		int cnt = 0;

		try {
			session = MybatisUtil.getSqlSession();
			cnt = session.update("fanBoard.deleteFanBoard", b_no);
			if (cnt > 0) {
				session.commit();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}

		return cnt;
	}

	@Override
	public FanBoardVO selectFanBoard(int b_no) {

		SqlSession session = null;
		FanBoardVO fanVO = null;
		try {
			session = MybatisUtil.getSqlSession();
			fanVO = session.selectOne("fanBoard.selectFanBoard", b_no);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}

		return fanVO;
	}

	@Override
	public List<FanBoardVO> getSearchFanBoard(String data) {
		
		SqlSession session = null;
		List<FanBoardVO> boardList =null;
		try {
			session = MybatisUtil.getSqlSession();
			
			boardList=session.selectList("fanBoard.getSearchFanBoard", data);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null) session.close();
		}
		return boardList;
	}
	
	
	@Override
	public int setCountIncrement(int b_no) {
		
		int cnt =0;
		SqlSession session=null;
		 try {
			session=MybatisUtil.getSqlSession();
			
			cnt=session.update("fanBoard.setCountIncrement",b_no);
			if(cnt>0) {
				session.commit();
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null) session.close();
		}
		
		return cnt;
	}

	@Override
	public int totalCount(Map<String, Object> map) {
		int res = 0;
		SqlSession session=null;
		
		try {
			session = MybatisUtil.getSqlSession();
			res = session.selectOne("board.totalCount",map);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.commit();
			session.close();
		}
		
		return res;
	}
	
	@Override
	public List<FanBoardVO> selectByPage(Map<String, Object> map) {
		List<FanBoardVO>  list = null;
		SqlSession session=null;
		try {
			
		   session = MybatisUtil.getSqlSession();                
		   list = session.selectList("board.selectByPage", map);
		   
		}catch(Exception e){
        e.printStackTrace(); 
        } finally {
        	session.commit();
        	session.close();
		}
		return list;
	}

}
