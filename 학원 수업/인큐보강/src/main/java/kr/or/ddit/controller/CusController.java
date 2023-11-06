package kr.or.ddit.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.or.ddit.service.CusService;
import kr.or.ddit.vo.CusVO;
import kr.or.ddit.vo.LprodVO;
import kr.or.ddit.vo.MembersVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/cus")
@Controller
public class CusController {
	
	@Autowired
	CusService cusService;
	
	/*
	 요청URI : /cus/create
	 요청방식 : get
	 */
	@GetMapping("/create") 
	public String create() {
		return "cus/create";
	}
	
	/*
	   요청URI : /cus/createPost
	   요청파라미터 : {"cusNo":"a001","cusNm":"홍홍홍","addr":"대전 유성구","hp":"010-1212-1212"}
	   요청방식 : post
	 */
	@PostMapping("/createPost")
	public String createPost(CusVO cusVO) {
		log.info("createPost->cusVO : " + cusVO);
		
		int result = this.cusService.createPost(cusVO);
		log.info("result : " + result);
		
		return "redirect:/cus/detail";
	}
	
	/*
	   요청URI : /cus/detail?cusNo=a001
	   요청파라미터 : cusNo=a001
	   요청방식 : get
	 */
	@GetMapping("/detail")
	public String detail(CusVO cusVO, Model model) {
		log.info("detail->cusVO : " + cusVO);
		
		cusVO = this.cusService.detail(cusVO);
		log.info("detail->cusVO(결과) : " + cusVO);
		
		model.addAttribute("cusVO", cusVO);
		
		return "cus/detail";
	}
	/*
	 요청URI : /cus/updatePost
	요청파라미터 : {"cusNo":"a001","cusNm":"홍홍홍","addr":"대전 유성구","hp":"010-1212-1212"}
	요청방식 : post
	 */
	@PostMapping("/updatePost")
	public String updatePost(CusVO cusVO) {
		log.info("updatePost-> cusVO : " + cusVO);
		
		int result = this.cusService.updatePost(cusVO);
		log.info("result : " + result);
		
		return "redirect:/cus/detail?cusNo" + cusVO.getCusNo();
	}
	
	/*
	    요청URI : /cus/deletePost
	   요청파라미터 : {"cusNo":"a001","cusNm":"홍홍홍","addr":"대전 유성구","hp":"010-1212-1212"}
	   요청방식 : post
	*/
	@PostMapping("/deletePost")
	public String deletePost(CusVO cusVO) {

	log.info("deletePost->cusVO : " + cusVO);
	
	int result = this.cusService.deletePost(cusVO);
	log.info("deletePost->result : " + result);
	
	//redirect : URI 재요청
	return "redirect:/cus/list";
	}
	
	@GetMapping("/list")
	public String list(
			@RequestParam(value =  "keyword", required=false) String keyword,
			@RequestParam(value =  "currentPage", required=false, defaultValue="1") int currentPage,
			Model model) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("keyword", keyword);
		map.put("currentPage", currentPage);
		
		List<MembersVO> data = this.cusService.list(map);
		log.info("list->data : " + data);
		
		model.addAttribute("data", data);
		
		// forwarding : jsp
		return "cus/list";
	}
	
}





























