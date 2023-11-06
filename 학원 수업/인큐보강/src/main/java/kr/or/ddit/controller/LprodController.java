package kr.or.ddit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.ddit.service.LprodService;
import kr.or.ddit.vo.LprodVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/lprod")
@Controller
public class LprodController {
	//DI(의존성 주입)
	@Autowired
	LprodService lprodservice;
	
	/*
	    요청URI : /lprod/create
	    요청방식 : get
    */
	@GetMapping("/create")
	public String create(Model model) {
		//forwarding : jsp
		return "lprod/create";
	}
	
	/*
 	   요청URI : /lprod/createPost
	   요청파라미터 : {lprodGu=P701,lprodNm=호스팅}
	   요청방식 : post
	 */
	@PostMapping("/createPost")
	public String createPost(Model model, LprodVO lprodVO) {
		//lproddVO[lprodId=0,lprodGu=P701,lprodNm=호스팅]
		log.info("createPost->lprodVO : " + lprodVO);
		
		int result = this.lprodservice.createPost(lprodVO);
		log.info("result : " + result);
		
		// redirect : URL을 재요청
		return "redirect:/lprod/detail";
	}
	
	/*
	    요청URI : /lprod/detail?lprodGu=P502
	   요청파라미터 : prodGu=P502
	   요청방식 : get
    */
	@GetMapping("/detail")
	public String detail(LprodVO lprodVO, Model model) {
		//lprodVO[lprodId=0,lprodGu=P502,lprodNm=null]
		log.info("lprodVO : " + lprodVO);
		
		lprodVO = this.lprodservice.detail(lprodVO);
		//lprodVO[lprodId=10,lprodGu=P502,lprodNm=해조류]		
		
		model.addAttribute("data", lprodVO);
		
		//forwarding : jsp
		return "lprod/detail";
	}
	
	/*
	 요청URI : /lprod/updatePost
	요청파라미터 : {"lprodGu":"P501","lprodId":"11","lprodNm":"가구류"}
	요청방식 : post
	 */
	@PostMapping("/updatePost")
	public String updatePost(LprodVO lprodVO) {
		log.info("updatePost -> lprodVO : " + lprodVO);
		
		int result = this.lprodservice.updatePost(lprodVO);
		log.info("result : " + result);
		
		return "redirect:/lprod/detail?lprodGu="+lprodVO.getLprodGu();
	}
	
	/*
	    요청URI : /lprod/deletePost
	   요청파라미터 : {"lprodGu":"P501","lprodId":"11","lprodNm":"가구류"}
	   요청방식 : post
    */
	@PostMapping("/deletePost")
	public String deletePost(LprodVO lprodVO) {
		//LprodVO(lprodId=10, lprodGu=P502, lprodNm=해조류2)
		log.info("deletePost->lprodVO : " + lprodVO);
		
		int result = this.lprodservice.deletePost(lprodVO);
		log.info("deletePost->result : " + result);
		
		//redirect : URI 재요청
		return "redirect:/lprod/list";
	}
}






















