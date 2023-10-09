package kr.or.ddit.lms.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.or.ddit.db.CustomSqlSessionFactoryBuilder;
import kr.or.ddit.vo.StdListVO;

public class StdListDAOImpl implements StdListDAO{
	private SqlSessionFactory sqlSessionFactory =
			CustomSqlSessionFactoryBuilder.getSqlSessionFactory();

	@Override
	public List<StdListVO> selectLecList(String proCd) {
		try(
			SqlSession sqlSession = sqlSessionFactory.openSession();	
		){
			StdListDAO mapperProxy = sqlSession.getMapper(StdListDAO.class);
			return mapperProxy.selectLecList(proCd);
		}
	}

	@Override
	public List<StdListVO> selectstdList(String lecCd) {
		try(
			SqlSession sqlSession = sqlSessionFactory.openSession();	
		){
			StdListDAO mapperProxy = sqlSession.getMapper(StdListDAO.class);
			return mapperProxy.selectstdList(lecCd);
		}
	}
}
