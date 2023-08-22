package kr.or.ddit.middle.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.middle.vo.NoticeVO;
import kr.or.ddit.util.MybatisUtil;

public class NoticeDaoImpl implements INoticeDao {
	
	private static INoticeDao dao;
	
	private NoticeDaoImpl() {}
	
	public static INoticeDao getInstance() {
		if(dao==null) dao= new NoticeDaoImpl();
		
		return dao;
	}
	
	@Override
	public int insertNotice(NoticeVO noticeVO) {
		
		SqlSession session = null;
		int cnt = 0;

		try {
			session = MybatisUtil.getSqlSession();
			cnt = session.insert("Notice.insertNotice", noticeVO);

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
			MaxNo = session.selectOne("Notice.getMaxId");
			
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
	public List<NoticeVO> selectNoticeList() {
		
		SqlSession session = null;
		List<NoticeVO> list = null;
		
		try {
			session = MybatisUtil.getSqlSession();
			list = session.selectList("Notice.selectNoticeList");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}

		return list;
	}

	@Override
	public int updateNotice(NoticeVO noticeVO) {
		
		SqlSession session = null;
		int cnt = 0;

		try {
			session = MybatisUtil.getSqlSession();
			cnt = session.update("Notice.updateNotice", noticeVO);
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
	public int deleteNotice(int n_no) {
		
		SqlSession session = null;
		int cnt = 0;

		try {
			session = MybatisUtil.getSqlSession();
			cnt = session.update("Notice.deleteNotice", n_no);
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
	public NoticeVO selectNotice(int n_no) {
		
		SqlSession session = null;
		NoticeVO noticeVO = null;
		try {
			session = MybatisUtil.getSqlSession();
			noticeVO = session.selectOne("Notice.selectNotice", n_no);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}

		return noticeVO;
	}

	@Override
	public List<NoticeVO> getSearchNotice(String data) {

		SqlSession session = null;
		List<NoticeVO> noticeList =null;
		try {
			session = MybatisUtil.getSqlSession();
			
			noticeList=session.selectList("Notice.getSearchNotice", data);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null) session.close();
		}
		return noticeList;
	}

	@Override
	public int setCountIncrement(int n_no) {

		int cnt =0;
		SqlSession session=null;
		 try {
			session=MybatisUtil.getSqlSession();
			
			cnt=session.update("Notice.setCountIncrement",n_no);
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

		int cnt = 0;
		SqlSession session=null;
		
		try {
			session = MybatisUtil.getSqlSession();
			cnt = session.selectOne("Notice.totalCount",map);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.commit();
			session.close();
		}
		
		return cnt;
	}

	@Override
	public List<NoticeVO> selectByPage(Map<String, Object> map) {

		List<NoticeVO>  list = null;
		SqlSession session=null;
		try {
			
		   session = MybatisUtil.getSqlSession();                
		   list = session.selectList("Notice.selectByPage", map);
		   
		}catch(Exception e){
        e.printStackTrace(); 
        } finally {
        	session.commit();
        	session.close();
		}
		return list;
	}


}
