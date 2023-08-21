package kr.or.ddit.middle.dao;

import kr.or.ddit.middle.vo.AddLoginVO;

public interface IAddLoginDao {

	// 관리자 로그인
	public AddLoginVO getAddLogin(AddLoginVO addLoginVo);
	
}
