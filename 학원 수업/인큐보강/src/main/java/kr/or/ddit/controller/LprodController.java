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
	
	/*
	 요청URI : /lprod/list
	 요청방식 : get
	 */
	@GetMapping("/list")
	public String list() {
		//forwarding : jsp
		return "lprod/list";
	}
	
	/*
	요청URI : /lprod/list2?gubun=lprodNm&keyword=개똥이
	요청파라미터 : gubun=&keyword=
	요청방식 : get
	 */
	@GetMapping("/list2")
	public String list2(String keyword, String gubun) {
		log.info("list2->keyword : " + keyword);
		log.info("list2->gubun : " + gubun);
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("keyword", keyword);
		map.put("gubun", gubun);
		// map : {keyword=개똥이, gubun=lprodNm}
		log.info("map : " + map);
		
		//forwarding : jsp
		return "lprod/list";
	}

	/*
	   요청URI : /lprod/list3?gubun=lprodGu&keyword=P101
	   요청파라미터 : gubun=lprodGu&keyword=P101
	   요청방식 : get
    */
   @GetMapping("/list3")
   public String list3(String keyword, String gubun) {
      log.info("list3->keyword : " + keyword);
      log.info("list3->gubun : " + gubun);
      
      Map<String, String> map = new HashMap<String, String>();
      map.put("keyword", keyword);
      map.put("gubun", gubun);
      // map : {keyword=P101, gubun=lprodGu}
      log.info("map : " + map);
    
      List<LprodVO> data = this.lprodservice.list(map);
      log.info("list3->data : " + data);
      
      //forwarding : jsp
      return "lprod/list";
   }
   
   /* 상품분류명
	   요청URI : /lprod/list4?gubun=lprodNm&keyword=컴퓨터
	   요청파라미터 : gubun=lprodNm&keyword=컴퓨터
	   요청방식 : get
    */
   @GetMapping("/list4")
   public String list4(String keyword, String gubun, Model model) {
	   log.info("list4->keyword : " + keyword);
	   log.info("list4->gubun : " + gubun);
	   
	   Map<String, String> map = new HashMap<String, String>();
	   map.put("keyword", keyword);
	   map.put("gubun", gubun);
	   // map : {keyword=컴퓨터, gubun=lprodNm}
	   log.info("map : " + map);
	   
	   List<LprodVO> data = this.lprodservice.list(map);
	   log.info("list4->data : " + data);
	   //[LprodVO(lprodId=3, lprodGu=P201, lprodNm=여성캐주얼), LprodVO(lprodId=4, lprodGu=P202, lprodNm=남성캐주얼)]
	   model.addAttribute("data", data);
	   
	   //forwarding : jsp
	   return "lprod/list";
   }

}






















