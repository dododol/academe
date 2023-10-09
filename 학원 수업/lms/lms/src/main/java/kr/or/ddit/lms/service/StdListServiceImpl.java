package kr.or.ddit.lms.service;

import java.util.List;

import kr.or.ddit.lms.dao.StdListDAO;
import kr.or.ddit.lms.dao.StdListDAOImpl;
import kr.or.ddit.vo.StdListVO;

public class StdListServiceImpl implements StdListService{
	private StdListDAO dao = new StdListDAOImpl();
	
	@Override
	public List<StdListVO> retrieveLecList(String proCd) {
		return dao.selectLecList(proCd);
	}

	@Override
	public List<StdListVO> retrievestdList(String lecCd) {
		return dao.selectstdList(lecCd);
	}

}
