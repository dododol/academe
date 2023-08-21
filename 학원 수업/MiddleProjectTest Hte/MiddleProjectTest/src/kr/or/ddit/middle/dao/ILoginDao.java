package kr.or.ddit.middle.dao;

import kr.or.ddit.middle.vo.LoginVO;

public interface ILoginDao {

	// 회원 로그인
	public LoginVO getMemberLogin(LoginVO loginVo); 
	
	// ID 중복검사
	public String selectById(String memid);
	
	// 회원가입
	public int insertMemberInfo(LoginVO loginVo);
}
