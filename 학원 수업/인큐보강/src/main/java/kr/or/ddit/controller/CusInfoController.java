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

import kr.or.ddit.mapper.CusInfoMapper;
import kr.or.ddit.service.CusInfoService;
import kr.or.ddit.vo.CusInfoVO;
import kr.or.ddit.vo.CusVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/cusInfo")
@Controller
public class CusInfoController {

	@Autowired
	CusInfoService cusInfoService;
	
	@Autowired
	CusInfoMapper cusInfoMapper;

	/*
    요청URI : /cusInfo/create
    요청방식 : get
    */
	@GetMapping("/create")
	public String create() {
		return "cusInfo/create";
	}
	
	/*
	   요청URI : /cusInfo/createPost
	   요청파라미터 : {"cusNo":"a001","cusNm":"홍홍홍","addr":"대전 유성구","hp":"010-1212-1212"}
	   요청방식 : post
	 */
	@PostMapping("/createPost")
	public String createPost(CusInfoVO cusInfoVO) {
		log.info("createPost->cusInfoVO : " + cusInfoVO);
		
		int result = this.cusInfoService.createPost(cusInfoVO);
		log.info("result : " + result);
		
		return "redirect:/cusInfo/detail?cusNo="+cusInfoVO.getCusNo();
	}
	
	/*
	   요청URI : /cusInfo/detail?cusNo=a001
	   요청파라미터 : cusNo=a001
	   요청방식 : get
	 */
	@GetMapping("/detail")
	public String detail(CusInfoVO cusInfoVO, Model model) {
		log.info("detail->cusVO : " + cusInfoVO);
		
		cusInfoVO = this.cusInfoService.detail(cusInfoVO);
		log.info("detail->cusVO(결과) : " + cusInfoVO);
		
		CusInfoVO data = this.cusInfoService.detail(cusInfoVO);
		log.info("data : " + data);
		
		model.addAttribute("cusInfoVO", data);
		
		return "cusInfo/detail";
	}
	
	/*
	 요청URI : /cusInfo/updatePost
	요청파라미터 : {"cusNo":"a001","cusNm":"홍홍홍","addr":"대전 유성구","hp":"010-1212-1212"}
	요청방식 : post
	 */
	@PostMapping("/updatePost")
	public String updatePost(CusInfoVO cusInfoVO) {
		log.info("updatePost-> cusInfoVO : " + cusInfoVO);
		
		int result = this.cusInfoService.updatePost(cusInfoVO);
		log.info("result : " + result);
		
		return "redirect:/cusInfo/detail?cusNo=" + cusInfoVO.getCusNo();
	}
	
	/*
	    요청URI : /cusInfo/deletePost
	   요청파라미터 : {"cusNo":"a001","cusNm":"홍홍홍","addr":"대전 유성구","hp":"010-1212-1212"}
	   요청방식 : post
	*/
	@PostMapping("/deletePost")
	public String deletePost(CusInfoVO cusInfoVO) {
	
	log.info("deletePost->cusInfoVO : " + cusInfoVO);
	
	int result = this.cusInfoService.deletePost(cusInfoVO);
	log.info("deletePost->result : " + result);
	
	//redirect : URI 재요청
	return "redirect:/cusInfo/list";
	}
	
	@GetMapping("/list")
	public String list(
			@RequestParam(value =  "keyword", required=false) String keyword,
			@RequestParam(value =  "currentPage", required=false, defaultValue="1") int currentPage,
			Model model) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("keyword", keyword);
		map.put("currentPage", currentPage);
		
		List<CusInfoVO> data = this.cusInfoService.list(map);
		log.info("list->data : " + data);
		
		model.addAttribute("data", data);
		
		// forwarding : jsp
		return "cusInfo/list";
	}
	
	// 요청URI : /cusInfo/paramTest1?id=3
	// 요청파라미터 : id=3
	@GetMapping("/paramTest1")
	public String paramTest1(String id) {
		log.info("id : " + id);
		
		return "cusInfo/detail";
	}
	
	// 요청URI : /cusInfo/paramTest2?memid=a001
	// 요청파라미터 : memid=a001
	@GetMapping("/paramTest2")
	public String paramTest2(String memid) {
		log.info("memid : " + memid);
		
		return "cusInfo/detail";
	}
	
	// 요청URI : /cusInfo/paramTest3?code=cd01&val=123
	// 요청파라미터 : code=cd01&val=123
	@GetMapping("/paramTest3")
	public String paramTest3(String code, String val) {
		log.info("code : " + code);
		log.info("val : " + val);
		
		return "cusInfo/detail";
	}
	
	// 요청URI : /cusInfo/paramTest4?username=t01&password=java&age=3
	// 요청파라미터 : username=t01&password=java&age=3
	@GetMapping("/paramTest4")
	public String paramTest4(String username, String password, int age) {
		log.info("username : " + username);
		log.info("password : " + password);
		log.info("age : " + age);
		
		return "cusInfo/detail";
	}
	
	// 요청URI : /cusInfo/paramTest5?cusNo=a003&cusNm=개똥이&addr=대전&hp=010-111-2222
	// 요청파라미터 : username=t01&password=java&age=3
	@GetMapping("/paramTest5")
	public String paramTest5(String cusNo, String cusNm, String addr, String hp) {
		log.info("cusNo : " + cusNo);
		log.info("cusNm : " + cusNm);
		log.info("addr : " + addr);
		log.info("hp : " + hp);
		
		return "cusInfo/detail";
	}
	
	// 요청URI : /cusInfo/paramTest6?cusNo=a003&cusNm=개똥이&addr=대전&hp=010-111-2222
	// 요청파라미터 : username=t01&password=java&age=3
	@GetMapping("/paramTest6")
	public String paramTest6(CusInfoVO cusInfoVO) {
		log.info("cusNo : " + cusInfoVO.getCusNo());
		log.info("cusNm : " + cusInfoVO.getCusNm());
		log.info("addr : " + cusInfoVO.getAddr());
		log.info("hp : " + cusInfoVO.getHp());
		
		return "cusInfo/detail";
	}
	
	// 요청URI : /cusInfo/paramTest7?cusNo=a003&cusNm=&addr=&hp=
	// 요청파라미터 : username=t01&password=java&age=3
	@GetMapping("/paramTest7")
	public String paramTest7(CusInfoVO cusInfoVO) {
		log.info("cusNo : " + cusInfoVO.getCusNo());
		log.info("cusNm : " + cusInfoVO.getCusNm());
		log.info("addr : " + cusInfoVO.getAddr());
		log.info("hp : " + cusInfoVO.getHp());
		
		return "cusInfo/detail";
	}
	
	
	// 요청URI : /cusInfo/paramTest8?cusNo=a003&cusNm=홍길동&addr=서울&hp=010-777-7777
	// 요청파라미터 : cusNo=a003&cusNm=홍길동&addr=대전&hp=010-111-2222
	@GetMapping("/paramTest8")
	public String paramTest8(String cusNo, String cusNm, String addr, String hp) {
		log.info("cusNo : " + cusNo); //a003
		log.info("cusNm : " + cusNm); //홍길동
		log.info("addr : " + addr); //서울
		log.info("hp : " + hp); //010-777-7777
		
		//{cusNo=a003&cusNm=&addr=서울&hp=010-777-7777}
		CusInfoVO cusInfoVO = new CusInfoVO();
		cusInfoVO.setCusNo(cusNo); // a003
		cusInfoVO.setCusNm(cusNm); // 개똥이
		cusInfoVO.setAddr(addr); // 서울
		cusInfoVO.setHp(hp); // 010-777-7777
		
		int result = this.cusInfoMapper.updatePost(cusInfoVO);
		log.info("result : " + result);
		
		return "cusInfo/detail";
	}
	
	// 요청URI : /cusInfo/paramTest9?cusNo=a003&cusNm=태형이&addr=뉴욕&hp=010-999-8888
	// 요청파라미터 : cusNo=a003&cusNm=태형이&addr=뉴욕&hp=010-999-8888
	@GetMapping("/paramTest9")
	public String paramTest9(CusInfoVO cusInfoVO) {
		log.info("cusInfoVO : " + cusInfoVO); 
		
		int result = this.cusInfoMapper.updatePost(cusInfoVO);
		log.info("result : " + result);
		
		return "cusInfo/detail";
	}
	
	// 요청URI : /cusInfo/paramTest10
	// 요청파라미터 : cusNo=a003&cusNm=수빈이&addr=맨해튼&hp=010-111-2222
	// 요청방식 : post
	@PostMapping("/paramTest10")
	public String paramTest10(CusInfoVO cusInfoVO) {
		// {cusNo=a003&cusNm=수빈이&addr=맨해튼&hp=010-111-2222}
		log.info("cusInfoVO : " + cusInfoVO); 
		
		int result = this.cusInfoMapper.updatePost(cusInfoVO);
		log.info("result : " + result);
		//경로 /cusInfo/detail?cusNo=a003
		return "redirect:/cusInfo/detail?cusNo=" + cusInfoVO.getCusNo();
	}

}




































