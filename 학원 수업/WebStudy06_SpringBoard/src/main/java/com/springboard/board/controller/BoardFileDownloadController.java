package com.springboard.board.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboard.board.service.BoardService;

@Controller
public class BoardFileDownloadController {
	@Inject
	private BoardService service;
	
	@GetMapping("/board/{boNo }/boFile/{attNo }")
	public download(@PathVariable int attNo) {
		
	}
}
