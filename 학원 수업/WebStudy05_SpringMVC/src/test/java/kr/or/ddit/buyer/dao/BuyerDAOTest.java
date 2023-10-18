package kr.or.ddit.buyer.dao;

import static org.junit.jupiter.api.Assertions.*;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import kr.or.ddit.AbstractRootContextTest;
import kr.or.ddit.vo.BuyerVO;
import lombok.extern.slf4j.Slf4j;


@Slf4j
class BuyerDAOTest extends AbstractRootContextTest{

	@Inject
	private BuyerDAO dao;
	
	@Test
	void testSelectBuyer() {
		BuyerVO buyer = dao.selectBuyer("P10103");
		assertNotNull(buyer);
		log.info("거래물품 : {}", buyer.getProdList());
	}
	
	@Test
	void testInsertBuyer() {
		BuyerVO buyer = new BuyerVO();
		buyer.setBuyerName("신규");
		buyer.setBuyerLgu("P101");
		buyer.setBuyerComtel("000-000-0000");
		buyer.setBuyerFax("000-000-0000");
		buyer.setBuyerMail("new@naver.com");
		int cnt = dao.insertBuyer(buyer);
		assertEquals(1, cnt);
	}

}
