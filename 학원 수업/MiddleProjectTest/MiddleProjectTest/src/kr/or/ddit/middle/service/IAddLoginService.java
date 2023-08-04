package kr.or.ddit.middle.service;

import kr.or.ddit.middle.vo.AddLoginVO;

public interface IAddLoginService {

	// 관리자 로그인
		public AddLoginVO getAddLogin(AddLoginVO addLoginVo);
	
}
