package kr.or.ddit.case1.dao;

import org.springframework.stereotype.Repository;


public class Case1SampleDAOImpl_Mysql implements Case1SampleDAO {

	@Override
	public String selectSample(String pk) {
		return String.format("Mysql 에서 %s로 조회한 raw data", pk);
	}

}
