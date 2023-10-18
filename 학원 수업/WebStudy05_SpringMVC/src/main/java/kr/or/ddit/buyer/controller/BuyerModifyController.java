package kr.or.ddit.buyer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.ddit.vo.BuyerVO;
import lombok.extern.slf4j.Slf4j;

// /buyer/P10101
@Slf4j
@Controller
@RequestMapping("/buyer")
public class BuyerModifyController {
	@GetMapping("{buyerId}/form")
	public String buyerUpdateForm(@PathVariable String buyerId) {
		return "buyer/buyerEdit";
	}
	
	@PutMapping("{buyerId}")
	public String buyerUpdate(BuyerVO buyer) {
		log.info("====================buyer update put request=====================");
		return "redirect:/buyer/{buyerId}";
	}
}









