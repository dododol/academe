package com.springboard.board.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboard.board.service.BoardService;
import com.springboard.board.vo.FreeBoardVO;
import com.springboard.paging.BootstrapPaginationRenderer;
import com.springboard.paging.vo.PaginationInfo;
import com.springboard.paging.vo.SearchVO;

/**
 * 	C : /board/boardInsert.do
 * 	  GET(POST) /board/new 	
 *  R : /board/boardList.do?page=2, /board/boardView.do?what=23
 *    GET /board?page=2,  /board/23
 *  U : /board/boardUpdate.do
 *    GET /board/23/edit,  PUT /board/23/edit
 *  D : /board/boardDelete.do
 *    DELETE /board/23
 *
 */
@Controller
@RequestMapping("/board")
public class BoardRetrieveController {
	@Inject
	private BoardService service;
	
	@GetMapping
	public String boardList(
		Model model
		, @ModelAttribute("simpleCondition") SearchVO simpleCondition
		, @RequestParam(value="page", required = false, defaultValue = "1") int currentPage
	){
		
		PaginationInfo<FreeBoardVO> paging = new PaginationInfo<>();
		paging.setSimpleCondition(simpleCondition); // 키워드 검색 조건
		paging.setCurrentPage(currentPage);
		
		service.retrieveBoardList(paging);
		
		paging.setRenderer(new BootstrapPaginationRenderer());
		model.addAttribute("paging", paging);
		
		return "board/boardList";
	}
	
	@GetMapping("{boNo}")
	public String boardView(@PathVariable int boNo, Model model) {
		FreeBoardVO board = service.retrieveBoard(boNo);
		model.addAttribute("board", board);
		return "board/boardView";
	}
}
















