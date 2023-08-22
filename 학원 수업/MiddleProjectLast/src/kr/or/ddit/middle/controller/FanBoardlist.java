package kr.or.ddit.middle.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.middle.service.FanBoardServiceImpl;
import kr.or.ddit.middle.service.IFanBoardService;
import kr.or.ddit.middle.vo.FanBoardVO;


@WebServlet("/board/fanboardlist.do")
public class FanBoardlist extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IFanBoardService service = FanBoardServiceImpl.getInstance();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		IFanBoardService service = FanBoardServiceImpl.getInstance();
		
		List<FanBoardVO> fanList = service.selectFanBoardList();
		
		request.setAttribute("List", fanList);
		
		request.getRequestDispatcher("/html/board/fanboardlist.jsp").forward(request, response);
		
	}

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

	}
}

//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		System.out.println("서블릿");
//		response.setCharacterEncoding("UTF-8");
//		request.setCharacterEncoding("UTF-8");
//		
//		IFanBoardService service = FanBoardServiceImpl.getInstance();
//		
//		//---------------------------------------------------------------------
//		
//		
//		int page = Integer.parseInt(request.getParameter("page"));
//	
//		String stype = request.getParameter("stype");
//		String sword = request.getParameter("s");
//		
//		PageVO pvo = service.pageInfo(page, stype, sword);
//
//		Map<String, Object> pageMap = new HashMap<String, Object>();
//		pageMap.put("start", pvo.getStart());
//		pageMap.put("end", pvo.getEnd());
//		pageMap.put("stype", stype);
//		pageMap.put("sword", sword);
//		
//		List<FanBoardVO> fanList = service.selectByPage(pageMap);
//		request.setAttribute("List", fanList);
//		
//		request.setAttribute("startpage", pvo.getStartPage());
//		request.setAttribute("endpage", pvo.getEndPage());
//		request.setAttribute("totalpage", pvo.getTotalPage());
//		
//		request.getRequestDispatcher("/html/board/fanboardlist.jsp").forward(request, response);
	
