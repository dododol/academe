package kr.or.ddit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.ddit.vo.ProductsVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/products")
@Controller
public class ProductsController {
	
	/*
 	   요청URI : /products/create
	   요청방식 : get
	 */
	@GetMapping("/create")
	public String create() {
		// forwarding : jsp
		return "products/create";
	}

	/*
 	   요청URI : /products/createPost
	   요청파라미터 : {prodId=P10101,lprodGu=P101,lprodNm=모니터20인치}
	   요청방식 : post
	 */
	@PostMapping("/createPost")
	public String createPost(ProductsVO productsVO) {
		//productsVO=(P10101,lprodGu=P101,lprodNm=모니터20인치)
		log.info("createPost->productsVO : " + productsVO);
		//redirect : URI재요청
		return "redirect:/products/detail";
	}
	
}
