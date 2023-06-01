package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import utill.JDBCUtill;

public class LoginDAO {
	
	private static LoginDAO instance = null;
	private LoginDAO() {}
	
	public static LoginDAO getInstance() {
		if(instance == null) instance = new LoginDAO();
		return instance;
	}
	
	JDBCUtill jdbc = JDBCUtill.getInstance();
	
	public Map<String, Object> login(String id, String pass) {
		String sql="SELECT * FROM TBL_MEMBER WHERE MEM_ID = ? ";
		sql = sql + " AND MEM_PASS = ? ";
		List<Object> param = new ArrayList<Object>();
		param.add(id);
		param.add(pass);
		
		return jdbc.selectOne(sql, param);
	}
}
