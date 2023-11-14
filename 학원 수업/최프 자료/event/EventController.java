package kr.or.ddit.users.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.or.ddit.paging.BootstrapPaginationRenderer;
import kr.or.ddit.paging.vo.PaginationInfo;
import kr.or.ddit.paging.vo.SearchVO;
import kr.or.ddit.users.service.EventService;
import kr.or.ddit.users.vo.EventVO;

@Controller
@RequestMapping("/event")
public class EventController {
	@Inject
	private EventService service;
	
	@GetMapping
	public String evnetList(
		Model model
		, @ModelAttribute("simpleCondition") SearchVO simpleCondition
		, @RequestParam(value="page", required = false, defaultValue = "1") int currentPage
	){
		
		PaginationInfo<EventVO> paging = new PaginationInfo<>();
		paging.setSimpleCondition(simpleCondition); // 키워드 검색 조건
		paging.setCurrentPage(currentPage);
		
		service.retrieveEventList(paging);;
		
		paging.setRenderer(new BootstrapPaginationRenderer());
		model.addAttribute("paging", paging);
		
		return "users/event/eventIng";
	}
}
