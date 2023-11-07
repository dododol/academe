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

import kr.or.ddit.service.UsersService;
import kr.or.ddit.vo.CusVO;
import kr.or.ddit.vo.MembersVO;
import kr.or.ddit.vo.UsersVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/users")
@Controller
public class UsersController {
	
	@Autowired
	UsersService usersService;
	
	/*
	 요청URI : /users/create
	 요청방식 : get
	 */
	@GetMapping("/create")
	public String create() {
		// forwarding : jsp
		return "users/create";
	}
	
	/*
	   요청URI : /users/createPost
	   요청파라미터 : {username=a001,password=java,enabled=1}
	   요청방식 : post
	 */
	@PostMapping("/createPost")
	public String createPost(UsersVO usersVO) {
		//usersVO = [username=a001,password=java,enabled=1]
		log.info("createPost->usersVO : " + usersVO);
		
		int result = this.usersService.createPost(usersVO);
		log.info("result  :" + result);
		
		//redirect : URI 재요청
		return "redirect:/users/detail";
	}
	
	/*
	   요청URI : /users/detail?username=a011
	   요청파라미터 : username=a011
	   요청방식 : get
	   */
	@GetMapping("/detail")
	public String detail(UsersVO usersVO, Model model) {
		//usersVO = [username=a001,password=java,enabled=1]
		log.info("detail->usersVO : " + usersVO);
		
		usersVO = this.usersService.detail(usersVO);
		//usersVO = [username=a001,password=java,enabled=1]
		log.info("detail->usersVO(결과) : " + usersVO);
		
		model.addAttribute("usersVO", usersVO);
		
		//forwarding : jsp
		return "users/detail";
	}
	
	/*
	   요청URI : /users/updatePost
	   요청파라미터 : [username=a001,password=java,enabled=1]
	   요청방식 : post
	   */
	@PostMapping("/updatePost")
	public String updatePost(UsersVO usersVO) {
		log.info("updatePost->usersVO : " + usersVO);
		
		int result = this.usersService.updatePost(usersVO);
		log.info("result : " + result);
		
		return "redirect:/users/detail?username=" + usersVO.getUsername();
	}
	
	/*
    요청URI : /users/deletePost
   요청파라미터 : [username=a001,password=java,enabled=1]
   요청방식 : post
	*/
	@PostMapping("/deletePost")
	public String deletePost(UsersVO usersVO) {
	
	log.info("deletePost->usersVO : " + usersVO);
	
	int result = this.usersService.deletePost(usersVO);
	log.info("deletePost->result : " + result);
	
	//redirect : URI 재요청
	return "redirect:/users/list";
	}
	
	@GetMapping("/list")
	public String list(
			@RequestParam(value =  "keyword", required=false) String keyword,
			@RequestParam(value =  "currentPage", required=false, defaultValue="1") int currentPage,
			Model model) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("keyword", keyword);
		map.put("currentPage", currentPage);
		
		List<UsersVO> data = this.usersService.list(map);
		log.info("list->data : " + data);
		
		model.addAttribute("data", data);
		
		// forwarding : jsp
		return "users/list";
	}
}




























