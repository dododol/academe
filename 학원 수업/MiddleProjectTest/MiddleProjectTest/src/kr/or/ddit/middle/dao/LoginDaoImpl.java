package kr.or.ddit.middle.dao;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.middle.vo.LoginVO;
import kr.or.ddit.util.MybatisUtil;

public class LoginDaoImpl implements ILoginDao {

	private static LoginDaoImpl dao;
	
	private LoginDaoImpl() {}
	
	public static LoginDaoImpl getInstance() {
		if(dao == null) dao = new LoginDaoImpl();
		return dao;
	}
	
	
	@Override
	public LoginVO getMemberLogin(LoginVO loginVo) {
		SqlSession session = null;
		LoginVO loginMemVo = null;
		
		try {
			session = MybatisUtil.getSqlSession();
			loginMemVo = session.selectOne("login.getMemberLogin", loginVo);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(session != null) session.close();
		}
		return loginMemVo;
	}

	@Override
	public String selectById(String memid) {
		 SqlSession session =null;
	      String userId="";
	      
	      try {
	         session = MybatisUtil.getSqlSession();
	         userId = session.selectOne("login.selectById", memid);
	         
	         if(userId !=null) {
	            session.commit();
	         }else {
	            System.out.println("쿼리문 실행 실패!");
	         }
	         
	      } catch (Exception e) {
	         e.printStackTrace();
	      }finally {
	         if(session!=null)try {session.close();}catch(Exception e) {}
	      }
	      return userId;
	}

	@Override
	public int insertMemberInfo(LoginVO loginVo) {
		SqlSession session = null;
		int cnt=0;
		
		try {
			session = MybatisUtil.getSqlSession();
			cnt = session.insert("login.insertMemberInfo", loginVo);
			
			if(cnt>0) {
				session.commit();
			}else {
				System.out.println("실패!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			 if(session!=null)try {session.close();}catch(Exception e) {}
		}
		
		return cnt;
	}



}
