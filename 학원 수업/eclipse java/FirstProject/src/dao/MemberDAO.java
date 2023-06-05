package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import util.JDBCUtil;

public class MemberDAO {
	private static MemberDAO instance=null;
	private MemberDAO() {}
	public static MemberDAO getInstance() {
		if(instance==null)instance=new MemberDAO();
		return instance;
	}
	
	JDBCUtil jdbc=JDBCUtil.getInstance();
	
	public int update(String sql){
		return jdbc.update(sql);
	}
}
