package kr.or.ddit.middle.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.middle.vo.QnaVO;
import kr.or.ddit.middle.vo.ReplyVO;
import kr.or.ddit.util.MybatisUtil;

public class QnaDaoImpl implements IQnaDao {
	
	private static IQnaDao dao;
	
	private QnaDaoImpl() {}
	
	public static IQnaDao getInstance() {
		if(dao==null) dao= new QnaDaoImpl();
		return dao;
	}
	
	@Override
	public int insertQna(QnaVO qVO) {
		
		SqlSession session = null;
		int cnt = 0;

		try {
			session = MybatisUtil.getSqlSession();
			cnt = session.insert("qna.insertQna", qVO);
			
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
			MaxNo = session.selectOne("qna.getMaxId");
			
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
	public List<QnaVO> selectQnaList() {
		
		SqlSession session = null;
		List<QnaVO> list = null;
		
		try {
			session = MybatisUtil.getSqlSession();
			list = session.selectList("qna.selectQnaList");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}

		return list;
	}

	@Override
	public int updateQna(QnaVO qVO) {
		
		SqlSession session = null;
		int cnt = 0;

		try {
			session = MybatisUtil.getSqlSession();
			cnt = session.update("qna.updateQna", qVO);
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
	public int deleteQna(int q_no) {
		SqlSession session = null;
		int cnt = 0;

		try {
			session = MybatisUtil.getSqlSession();
			cnt = session.update("qna.deleteQna", q_no);
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
	public QnaVO selectQna(int q_no) {
		SqlSession session = null;
		QnaVO qnaVO = null;
		try {
			session = MybatisUtil.getSqlSession();
			qnaVO = session.selectOne("qna.selectQna", q_no);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}

		return qnaVO;

	}

	@Override
	public List<QnaVO> getSearchQna(String data) {
		SqlSession session = null;
		List<QnaVO> qnaList =null;
		try {
			session = MybatisUtil.getSqlSession();
			
			qnaList=session.selectList("qna.getSearchQna", data);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null) session.close();
		}
		return qnaList;
	}

	@Override
	public int setCountIncrement(int q_no) {
		int cnt =0;
		SqlSession session=null;
		 try {
			session=MybatisUtil.getSqlSession();
			
			cnt=session.update("qna.setCountIncrement",q_no);
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
			cnt = session.selectOne("qna.totalCount",map);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.commit();
			session.close();
		}
		
		return cnt;
	}

	@Override
	public List<QnaVO> selectByPage(Map<String, Object> map) {
		List<QnaVO>  list = null;
		SqlSession session=null;
		try {
			
		   session = MybatisUtil.getSqlSession();                
		   list = session.selectList("qna.selectByPage", map);
		   
		}catch(Exception e){
        e.printStackTrace(); 
        } finally {
        	session.commit();
        	session.close();
		}
		return list;
	}
	
	
	
	@Override
	public int insertReply(ReplyVO vo) {
		SqlSession session= null;
		int res = 0;
		
		try {
			session = MybatisUtil.getSqlSession();
			res = session.update("qna.insertReply",vo);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.commit();
			session.close();
		}
		
		return res;
	}

	@Override
	public int deleteReply(int re_no) {
		SqlSession session= null;
		int res = 0;
		
		try {
			session = MybatisUtil.getSqlSession();
			res = session.delete("qna.deleteReply",re_no);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.commit();
			session.close();
		}
		
		return res;
	}

	@Override
	public int updateReply(ReplyVO vo) {
		SqlSession session= null;
		int res = 0;
		
		try {
			session = MybatisUtil.getSqlSession();
			res = session.update("qna.updateReply",vo);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.commit();
			session.close();
		}
		
		return res;
	}

	@Override
	public List<ReplyVO> selectReplyList(int qnano) {
		SqlSession session= null;
		List<ReplyVO>   list = null;
		
		try {
			session = MybatisUtil.getSqlSession();
			list = session.selectList("qna.selectReplyList",qnano);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.commit();
			session.close();
		}
		
		return list;
	}

}
