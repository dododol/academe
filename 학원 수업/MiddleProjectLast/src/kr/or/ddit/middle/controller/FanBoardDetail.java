package kr.or.ddit.middle.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.middle.service.FanBoardServiceImpl;
import kr.or.ddit.middle.service.FileInfoServiceImpl;
import kr.or.ddit.middle.service.IFanBoardService;
import kr.or.ddit.middle.service.IFileInfoService;
import kr.or.ddit.middle.vo.FanBoardVO;
import kr.or.ddit.middle.vo.FileInfoVO;

@WebServlet("/board/fanBoardDetail.do")
public class FanBoardDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		int b_no= Integer.parseInt(request.getParameter("bono"));
		String memid=request.getParameter("boid");
		IFanBoardService fanBoardservice = FanBoardServiceImpl.getInstance();
		IFileInfoService fileservice = FileInfoServiceImpl.getInstance();
		FanBoardVO fvo = fanBoardservice.selectFanBoard(b_no);
		
		List<FileInfoVO> fileList = fileservice.getFileInfo(memid);
		request.setAttribute("detail", fvo);
		request.setAttribute("fileList", fileList);
		
		request.getRequestDispatcher("/html/board/fanboarddetail.jsp").forward(request, response);
		
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
