package kr.or.ddit.lms.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.lms.service.StdListService;
import kr.or.ddit.lms.service.StdListServiceImpl;
import kr.or.ddit.mvc.ViewResolverComposite;
import kr.or.ddit.vo.StdListVO;

@WebServlet("/stuList")
public class StuListControllerServlet extends HttpServlet{
	private StdListService service = new StdListServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String lecCd = req.getParameter("lecCd");
		System.out.println("lecCd : " + lecCd);
		System.out.println("lecCd : " + lecCd);
		
		List<StdListVO> list = service.retrievestdList(lecCd);
		
		req.setAttribute("list", list);
		
		String viewName = "lms/stuList";
		new ViewResolverComposite().resolveView(viewName, req, resp);
	
	}
}
