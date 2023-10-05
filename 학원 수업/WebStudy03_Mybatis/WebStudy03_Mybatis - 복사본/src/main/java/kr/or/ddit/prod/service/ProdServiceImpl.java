package kr.or.ddit.prod.service;

import java.util.List;

import kr.or.ddit.member.UserNotFoundException;
import kr.or.ddit.prod.dao.ProdDAO;
import kr.or.ddit.prod.dao.ProdDAOImpl;
import kr.or.ddit.vo.PaginationInfo;
import kr.or.ddit.vo.ProdVO;

public class ProdServiceImpl implements ProdService {
	private ProdDAO dao = new ProdDAOImpl();

	@Override
	public ProdVO retrieveProd(String prodId) {
		ProdVO prod = dao.selectProd(prodId);
		if(prod==null)
			throw new UserNotFoundException(prodId);
		return prod;
	}

	@Override
	public void retrieveProdList(PaginationInfo<ProdVO> paging) {
		int totalRecord = dao.selectTotalRecord(paging);
		paging.setTotalRecord(totalRecord);
		List<ProdVO> dataList = dao.selectProdList(paging);
		paging.setDataList(dataList);
	}

}
