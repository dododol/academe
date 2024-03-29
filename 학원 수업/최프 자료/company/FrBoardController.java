package kr.or.ddit.users.controller;

import java.security.Principal;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import kr.or.ddit.paging.BootstrapPaginationRenderer;
import kr.or.ddit.paging.vo.PaginationInfo;
import kr.or.ddit.paging.vo.SearchVO;
import kr.or.ddit.users.service.FrBoardService;
import kr.or.ddit.users.vo.FrBoardVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/frBoardList")
public class FrBoardController {
	@Inject
	private FrBoardService service;
	
	@GetMapping
	public String frBoardList(
		Model model
		, @ModelAttribute("simpleCondition") SearchVO simpleCondition
		, @RequestParam(value="page", required = false, defaultValue = "1") int currentPage
		, @SessionAttribute("authId") String usersId
			) {
		log.info("아이디 : " + usersId);
		PaginationInfo<FrBoardVO> paging = new PaginationInfo<>();
		paging.setSimpleCondition(simpleCondition); // 키워드 검색 조건
		paging.setCurrentPage(currentPage);
		
		service.retrieveFrBoardList(paging);
		
		paging.setRenderer(new BootstrapPaginationRenderer());
		model.addAttribute("paging", paging);
		
		return "users/board/boardList";
		
	}
	
	//자유게시판 글작성 폼(1)
	/*
	 요청URI : /frBoardList/create
	 파라미터 : 
	 요청방식 : get
	 */
	@GetMapping("/create")
	public String create() {
		//forwarding : jsp
		return "users/board/boardForm";
	}
	
	//자유게시판 글작성 실행(1)
	/*
	 요청URI : /frBoardList/createPost
	 파라미터 : {frbTitle=제목2,frbWrite=내용23}
	 요청방식 : post
	 */
	@PostMapping("/createPost")
	public String createPost(FrBoardVO frBoardVO, Principal principal) {
		//FrBoardVO(rnum=0, frbNo=null, usersId=null, frbTitle=제목22, frbWrite=ㅁㄴㄹㅇ, frbDate=null, 
		//frbLno=null, frbRep=null, uploadFile=[org.springframework.web.multipart.support.StandardMultipartHttpS...]
		//, comment=null, frBoardAttatchVOList=null)
		//로그인 아이디
		frBoardVO.setUsersId("kf001");
		log.info("frBoardVO : " + frBoardVO);
		
		int result = this.service.createPost(frBoardVO);
		log.info("result : " + result);
		
		//redirect : URI
		return "redirect:/frBoardList/detail?frbNo="+frBoardVO.getFrbNo();
	}
	
	//자유게시판 글수정 폼
	/*
	 요청URI : /frBoardList/detail?frbNo=FRB0061
	 파라미터 : frbNo=FRB0061
	 요청방식 : get
	 */
	@GetMapping("/detail")
	public String detail(FrBoardVO frBoardVO, Model model) {
		//FrBoardVO(rnum=0, frbNo=FRB0086, usersId=null, frbTitle=null, frbWrite=null, frbDate=null, frbLno=null, frbRep=null, uploadFile=null, comment=null, frBoardAttatchVOList=null)
		log.info("detail->frBoardVO : " + frBoardVO);
		
		frBoardVO = this.service.detail(frBoardVO);
		log.info("frBoardVO : " + frBoardVO);
		
		model.addAttribute("frBoardVO", frBoardVO);
		
		//forwarding
		return "users/board/boardDetail";
	}
	
	//자유게시판 글수정 실행
	/*
	 요청URI : /frBoardList/detailPost
	 파라미터 : 
	 요청방식 : post
	 */

	//자유게시판 글삭제 실행
	/*
	 요청URI : /frBoardList/deletePost
	 파라미터 : 
	 요청방식 : post
	 */
	
//	@PostMapping("/deletePost")
//	public String deletePost(FrBoardVO frBoardVO) {
//		
//		int result = this.service.deletePost(frBoardVO);
//		
//	return "redirect:users/board/boardList";
//	}
	
	//탈퇴
	// /frBoardList/exitPost
	@PostMapping("/exitPost")
	public String exitPost(String memId) {
		/*
		UPDATE MEMBER
		SET    MEM_DELETE = 'Y'
		WHERE  MEM_ID = 'test02'
		 */
		log.info("exitPost->memId : " + memId);
		
		return "redirect:/";
	}

}



