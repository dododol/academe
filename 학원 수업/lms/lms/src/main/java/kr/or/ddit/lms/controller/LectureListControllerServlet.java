package kr.or.ddit.lms.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.validator.internal.metadata.aggregated.rule.VoidMethodsMustNotBeReturnValueConstrained;

import kr.or.ddit.lms.service.StdListService;
import kr.or.ddit.lms.service.StdListServiceImpl;
import kr.or.ddit.mvc.ViewResolverComposite;
import kr.or.ddit.vo.StdListVO;

@WebServlet("/myStudent")
public class LectureListControllerServlet extends HttpServlet{
	private StdListService service = new StdListServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String proCd = "22A01";
		List<StdListVO> list = service.retrieveLecList(proCd);
		req.setAttribute("list", list);
		
		String viewName = "/lms/lecList";
		 new ViewResolverComposite().resolveView(viewName, req, resp);
	
	}

}
