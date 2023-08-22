package kr.or.ddit.middle.dao;

import java.util.List;

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
	
	// 로그인
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
	
	// 아이디 중복 검사
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

	// 회원가입
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

	// 고객 전체 조회
	@Override
	public List<LoginVO> getMemberAll() {
		SqlSession session = null;
		List<LoginVO> list = null;
		
		try {
			session = MybatisUtil.getSqlSession();
			list = session.selectList("login.getMemberAll");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null)try {session.close();}catch(Exception e) {}
		}
		return list;
	}
	
	@Override
	public int updatePass(LoginVO loginVo) {
		SqlSession session = null;
		int cnt = 0;
		
		try {
			session = MybatisUtil.getSqlSession();
			cnt = session.update("login.updatePass", loginVo);
			
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

	// 패스워드 찾기
	@Override
	public String passWord(LoginVO memVo) {
		SqlSession session = null;
		String pass = null;
		
		try {
			session = MybatisUtil.getSqlSession();
			pass = session.selectOne("login.passWord", memVo);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			 if(session!=null)try {session.close();}catch(Exception e) {}
		}
		return pass;
	}

	// ID 찾기
	@Override
	public String idSearch(LoginVO memVo) {
		SqlSession session = null;
		String id = null;
		
		try {
			session = MybatisUtil.getSqlSession();
			id = session.selectOne("login.idSearch", memVo);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			 if(session!=null)try {session.close();}catch(Exception e) {}
		}
		return id;
	}
	
	@Override
	   public int updateMemberInfo(LoginVO loginVo) {
	      
	      SqlSession session = null;
	      int cnt=0;
	      
	      try {
	         session = MybatisUtil.getSqlSession();
	         cnt = session.insert("login.updateMemberInfo", loginVo);
	         
	         if(cnt>0) {
	            session.commit();
	         }else {
	            System.out.println("업데이트 실패~~~");
	         }
	         
	      } catch (Exception e) {
	         e.printStackTrace();
	      }finally {
	          if(session!=null)try {session.close();}catch(Exception e) {}
	      }
	      
	      return cnt;
	   }

	   @Override
	   public LoginVO selectAllInfo(String memid) {
	      SqlSession session = null;
	      LoginVO loginMemVo = null;
	      
	      try {
	         session = MybatisUtil.getSqlSession();
	         loginMemVo = session.selectOne("login.selectAllInfo", memid);
	         
	      } catch (Exception e) {
	         e.printStackTrace();
	      }finally{
	         if(session != null) session.close();
	      }
	      return loginMemVo;
	   }

	   @Override
	   public String selectByPw(String mempw) {
	      SqlSession session = null;
	      String pw = null;
	      
	      try {
	         session = MybatisUtil.getSqlSession();
	         pw = session.selectOne("login.selectByPw", mempw);
	      } catch (Exception e) {
	         e.printStackTrace();
	      } finally {
	         if(session!=null) session.close();
	      }
	      return pw;
	   }

	   @Override
	   public int deleteMember(String memid) {
	      SqlSession session = null;
	      int cnt = 0;
	      
	      try {
	         session = MybatisUtil.getSqlSession();
	         cnt = session.delete("login.deleteMember", memid);
	         
	         if(cnt>0) {
	            session.commit();
	         }else {
	            System.out.println("실패!");
	         }
	         
	      } catch (Exception e) {
	         e.printStackTrace();
	      }finally {
	         if(session!=null) session.close();
	      }
	      return cnt;
	   }
	


}
