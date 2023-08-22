package kr.or.ddit.middle.service;

import java.util.List;

import kr.or.ddit.middle.vo.LoginVO;

public interface ILoginService {

	// 회원 로그인
	public LoginVO getMemberLogin(LoginVO loginVo); 
	
	// ID 중복검사 
	public String selectById(String memid);
	
	// 회원가입
	public int insertMemberInfo(LoginVO loginVo);
	
	// 고객 조회
	public List<LoginVO> getMemberAll();
	
	// 비밀번호 찾기
	public int updatePass(LoginVO loginVo);
	
	// 비밀번호 전송
	public String passWord(LoginVO memVo);
	
	// 아이디 전송
	public String idSearch(LoginVO memVo);
	
	// 회원정보 수정
	public int updateMemberInfo(LoginVO loginVo);
	   
	// 수정한 정보 다시 가져오기
	public LoginVO selectAllInfo(String memid);
	   
	//비밀번호 확인
	public String selectByPw(String mempw);
	   
	//회원탈퇴
	public int deleteMember(String memid);
	
}
