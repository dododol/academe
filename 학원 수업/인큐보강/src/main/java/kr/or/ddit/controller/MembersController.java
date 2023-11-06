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

import kr.or.ddit.service.MembersService;
import kr.or.ddit.vo.MembersVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/members")
@Controller
public class MembersController {

	//DI(의존성 주입)
	@Autowired
	MembersService membersService; 
	
	/*
	 요청URI : /members/create
	 요청방식 : get
	 */
	@GetMapping("/create")
	public String create() {
		// forwarding : jsp
		return "members/create";
	}
	
	/*
 	   요청URI : /members/createPost
	   요청파라미터 : {memId=aaaaa,memName=김태형,memHp=123123123}
	   요청방식 : post
	 */
	@PostMapping("/createPost")
	public String createPost(MembersVO membersVO) {
		//membersVO = [memId=aaaaa,memName=김태형,memHp=123123123]
		log.info("createPost->membersVO : " + membersVO);
		
		int result = this.membersService.createPost(membersVO);
		log.info("result  :" + result);
		
		//redirect : URI 재요청
		return "redirect:/members/detail";
	}
	
	/*
	   요청URI : /members/detail?memId=a001
	   요청파라미터 : memId=a001
	   요청방식 : get
	   */
	@GetMapping("/detail")
	public String detail(MembersVO membersVO, Model model) {
		//MembersVO(memId=a011, memName=null, memHp=null)
		log.info("detail->membersVO : " + membersVO);
		
		membersVO = this.membersService.detail(membersVO);
		//MembersVO(memId=a011, memName=김김김, memHp=010-1111-2222)
		log.info("detail->membersVO(결과) : " + membersVO);
		
		model.addAttribute("membersVO", membersVO);
		
		//forwarding : jsp
		return "members/detail";
	}
	
	/*
	   요청URI : /members/updatePost
	   요청파라미터 : {memId=a001, memName=김은대, memHp=010-111-2222}
	   요청방식 : post
	   */
	@PostMapping("/updatePost")
	public String updatePost(MembersVO membersVO) {
		log.info("updatePost->membersVO : " + membersVO);
		
		int result = this.membersService.updatePost(membersVO);
		log.info("result : " + result);
		
		return "redirect:/members/detail?memId=" + membersVO.getMemId();
	}
	
	/*
	   요청URI : /members/deletePost
	   요청파라미터 : {memId=a011, memName=김초롱, memHp=010-3333-3333}
	   요청방식 : post
	  */
	@PostMapping("/deletePost")
	public String deletePost(MembersVO membersVO) {
		log.info("deletePost->memberVO : " + membersVO);
		
		int result = this.membersService.deletePost(membersVO);
		log.info("deletePost->result : " + result);
		
		//redirect : URI 재요청
		return "redirect:/members/list";
	}
	
	/*
	   요청URI : /members/list
	   요청파라미터 : {keyword=, currentPage=}
	   요청방식 : get
	   required=false : 필수가 아니라는 뜻
	   defaultValue="1" : 값이 없다면 "1"을 기본 세팅
	  */
	@GetMapping("/list")
	public String list(
			@RequestParam(value =  "keyword", required=false) String keyword,
			@RequestParam(value =  "currentPage", required=false, defaultValue="1") int currentPage,
			Model model) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("keyword", keyword);
		map.put("currentPage", currentPage);
		
		List<MembersVO> data = this.membersService.list(map);
		log.info("list->data : " + data);
		
		model.addAttribute("data", data);
		
		// forwarding : jsp
		return "members/list";
	}
}

































