package com.springboard.board.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springboard.board.service.BoardService;
import com.springboard.board.vo.FreeBoardVO;
import com.springboard.validate.grouphint.InsertGroup;

@Controller
@RequestMapping("/board/new")
@SessionAttributes(names = "newBoard")
public class BoardInsertController {
	@Inject
	private BoardService service;
	
	@ModelAttribute("newBoard")
	public FreeBoardVO board() {
		return new FreeBoardVO();
	}
	
	@GetMapping
	public String boardForm() {
		return "board/boardForm";
	}
	
	@PostMapping
	public String boardInsert(
		@Validated(InsertGroup.class) @ModelAttribute("newBoard") FreeBoardVO board
		, BindingResult errors
		,RedirectAttributes redirectAttributes
		, SessionStatus sessionStatus
	) {
		String viewName = null;
		if(!errors.hasErrors()) {
			service.createBoard(board);
			sessionStatus.setComplete();
			viewName = "redirect:/board/"+board.getBoNo();
		}else {
			String attName = BindingResult.MODEL_KEY_PREFIX+"newBoard";
			redirectAttributes.addFlashAttribute(attName, errors);
			viewName = "redirect:/board/new"; // redirect 후 get 요청
		}
		return viewName;
	}
}














