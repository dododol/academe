package kr.or.ddit.middle.dao;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.middle.vo.AddLoginVO;
import kr.or.ddit.util.MybatisUtil;

public class AddLoginDaoImpl implements IAddLoginDao {

	private static AddLoginDaoImpl dao;
	
	private AddLoginDaoImpl() {}
	
	public static AddLoginDaoImpl getInstance() {
		if(dao == null) dao = new AddLoginDaoImpl();
		return dao;
	}
	
	
	@Override
	public AddLoginVO getAddLogin(AddLoginVO addLoginVo) {

		SqlSession session = null;
		AddLoginVO loginAddVo = null;
		
		try {
			session = MybatisUtil.getSqlSession();
			loginAddVo = session.selectOne("login.getAddLogin", addLoginVo);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(session != null) session.close();
		}
		
		return loginAddVo;
	}

}
