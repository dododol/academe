package com.springboard.board.controller;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/board")
public class ImageUploadController {
	@Value("#{appInfo.boardImagesUrl}")
	private String boardImagesUrl;
	@Value("#{appInfo.boardImagesUrl}")
	private Resource boardImages;
	
	@PostMapping("image")
	public String imageUpload(MultipartFile upload, Model model, HttpServletRequest req) throws IOException {
		if(!upload.isEmpty()) {
			String saveName = UUID.randomUUID().toString();
			File saveFolder = boardImages.getFile();
			File saveFile = new File(saveFolder, saveName);
			upload.transferTo(saveFile); // upload 완료
			
			String url = req.getContextPath() + boardImagesUrl + "/" + saveName;
			model.addAttribute("uploaded", 1);
			model.addAttribute("fileName", upload.getOriginalFilename());
			model.addAttribute("url", url);
		}else {
			model.addAttribute("uploaded", 0);
			model.addAttribute("error", Collections.singletonMap("message", "업로드된 파일 없음."));
		}
		return "jsonView";
	}
}
















