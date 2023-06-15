package kr.or.ddit.dao;

import java.util.Map;

import kr.or.ddit.util.JDBCUtil;

public class LoginDao {
	private static LoginDao instance = null;
	private LoginDao() {}
	public static LoginDao getInstance() {
		if(instance == null) instance = new LoginDao();
		return instance;
	}
	
	// DB로 요청하기 위한 데이터베이스 객체 생성
	JDBCUtil jdbc = JDBCUtil.getInstance();
	
	// 로그인 기능
	// 아이디, 비밀번호와 일치하는 회원정보를 리턴받는다.
	// 리턴 받은 회원정보는 Map안에 매핑되어 전달받는다.
	public Map<String, Object> signIn(String id, String pw){
		String sql = " SELECT MEM_KEY, MEM_ID, MEM_PW, MEM_NAME, " + 
				" MEM_BIR, MEM_GENDER, GRADE FROM MEMBER " + 
				" WHERE MEM_ID = '"+id+"' AND MEM_PW = '"+pw+"' ";
		return jdbc.selectOne(sql);
	}
}

