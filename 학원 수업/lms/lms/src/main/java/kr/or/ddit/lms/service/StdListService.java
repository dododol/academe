package kr.or.ddit.lms.service;

import java.util.List;

import kr.or.ddit.vo.StdListVO;

public interface StdListService {
	public List<StdListVO> retrieveLecList(String proCd);
	public List<StdListVO> retrievestdList(String lecCd);
}
