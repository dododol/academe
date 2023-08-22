package kr.or.ddit.middle.service;

import java.util.List;

import kr.or.ddit.middle.dao.ILoginDao;
import kr.or.ddit.middle.dao.LoginDaoImpl;
import kr.or.ddit.middle.vo.LoginVO;


public class LoginServiceImpl implements ILoginService {

	private ILoginDao dao;
	
	private static LoginServiceImpl service;
	
	private LoginServiceImpl() {
		dao = LoginDaoImpl.getInstance();
	}
	
	public static LoginServiceImpl getInstance() {
		if(service == null) service = new LoginServiceImpl();
		return service;
	}
	@Override
	public LoginVO getMemberLogin(LoginVO loginVo) {
		// TODO Auto-generated method stub
		return dao.getMemberLogin(loginVo);
	}

	@Override
	public String selectById(String memid) {
		// TODO Auto-generated method stub
		return dao.selectById(memid);
	}

	@Override
	public int insertMemberInfo(LoginVO loginVo) {
		// TODO Auto-generated method stub
		return dao.insertMemberInfo(loginVo);
	}

	@Override
	public List<LoginVO> getMemberAll() {
		// TODO Auto-generated method stub
		return dao.getMemberAll();
	}
	
	@Override
	public int updatePass(LoginVO loginVo) {
		// TODO Auto-generated method stub
		return dao.updatePass(loginVo);
	}

	@Override
	public String passWord(LoginVO memVo) {
		// TODO Auto-generated method stub
		return dao.passWord(memVo);
	}

	@Override
	public String idSearch(LoginVO memVo) {
		// TODO Auto-generated method stub
		return dao.idSearch(memVo);
	}

	@Override
	   public int updateMemberInfo(LoginVO loginVo) {
	      return dao.updateMemberInfo(loginVo);
	   }

	   @Override
	   public LoginVO selectAllInfo(String memid) {
	      return dao.selectAllInfo(memid);
	   }

	   @Override
	   public String selectByPw(String mempw) {
	      return dao.selectByPw(mempw);
	   }

	   @Override
	   public int deleteMember(String memid) {
	      return dao.deleteMember(memid);
	      
	   }
	



}
