package kr.or.ddit.middle.service;

import kr.or.ddit.middle.dao.AddLoginDaoImpl;
import kr.or.ddit.middle.dao.IAddLoginDao;

import kr.or.ddit.middle.vo.AddLoginVO;

public class AddLoginServiceImpl implements IAddLoginService {

private IAddLoginDao dao;
	
	private static AddLoginServiceImpl service;
	
	private AddLoginServiceImpl() {
		dao = AddLoginDaoImpl.getInstance();
	}
	
	public static AddLoginServiceImpl getInstance() {
		if(service == null) service = new AddLoginServiceImpl();
		return service;
	}
	
	@Override
	public AddLoginVO getAddLogin(AddLoginVO addLoginVo) {
		// TODO Auto-generated method stub
		return dao.getAddLogin(addLoginVo);
	}

}
