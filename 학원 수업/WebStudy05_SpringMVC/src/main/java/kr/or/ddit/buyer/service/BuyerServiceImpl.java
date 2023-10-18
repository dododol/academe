package kr.or.ddit.buyer.service;

import org.springframework.stereotype.Service;

import kr.or.ddit.buyer.dao.BuyerDAO;
import kr.or.ddit.common.enumpkg.ServiceResult;
import kr.or.ddit.vo.BuyerVO;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BuyerServiceImpl implements BuyerService {

	private final BuyerDAO buyerDAO;
	
	@Override
	public BuyerVO retrieveBuyer(String buyerId) {
		return buyerDAO.selectBuyer(buyerId);
	}

	@Override
	public ServiceResult createBuyer(BuyerVO buyer) {
		return buyerDAO.insertBuyer(buyer) > 0 ? ServiceResult.OK : ServiceResult.FAIL;
	}
}
