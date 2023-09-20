package kr.or.ddit.servlet06.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import kr.or.ddit.db.ConnectionFactory;
import kr.or.ddit.vo.DataBasePropertyVO;

//POJO(Plain Old Java Ibject)
public class DataBasePropertyDAO {
	public List<DataBasePropertyVO> selectDBPropertyList(){
		List<DataBasePropertyVO> list = new ArrayList<>();
		try(
			Connection conn = ConnectionFactory.getConnection();
			Statement stmt = conn.createStatement();
		){
			StringBuffer sql = new StringBuffer();
			sql.append("	SELECT PROPERTY_NAME, PROPERTY_VALUE, DESCRIPTION	");
			sql.append("	FROM DATABASE_PROPERTIES                         	");
			ResultSet rs = stmt.executeQuery(sql.toString());
		
			while(rs.next()) {
				DataBasePropertyVO vo = new DataBasePropertyVO();
				list.add(vo);
				vo.setPropertyName(rs.getString("PROPERTY_NAME"));
				vo.setPropertyValue(rs.getString("PROPERTY_VALUE"));
				vo.setDescription(rs.getString("DESCRIPTION"));
			}
			return list;	
	} catch(SQLException e) {
			throw new RuntimeException(e);
		} 
	}
}