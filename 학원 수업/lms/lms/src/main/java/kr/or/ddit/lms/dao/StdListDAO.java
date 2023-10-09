package kr.or.ddit.lms.dao;

import java.util.List;

import kr.or.ddit.vo.StdListVO;

public interface StdListDAO {
	public List<StdListVO> selectLecList(String proCd);
	public List<StdListVO> selectstdList(String lecCd);

}
