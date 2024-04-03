package egovframework.let.temp.service.impl;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.EgovAbstractMapper;
import org.egovframe.rte.psl.dataaccess.util.EgovMap;
import org.springframework.stereotype.Repository;

import egovframework.let.temp.service.TempVO;

@Repository("tempDAO")
public class TempDAO extends EgovAbstractMapper{

	//임시데이터 가져오기
	public TempVO selectTemp(TempVO vo) throws Exception {
		return selectOne("tempDAO.selectTemp",vo);
	}
	
	//임시데이터 목록 가져오기
	public List<EgovMap> selectTempList(TempVO vo) throws Exception {
		return selectList("tempDAO.selectTempList",vo);
	}
	
}
