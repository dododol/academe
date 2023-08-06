package kr.or.ddit.middle.service;

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





}
