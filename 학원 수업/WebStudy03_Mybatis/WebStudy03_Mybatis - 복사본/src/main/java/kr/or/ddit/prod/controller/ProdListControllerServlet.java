package kr.or.ddit.prod.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

import kr.or.ddit.mvc.ViewResolverComposite;
import kr.or.ddit.paging.BootstrapPaginationRenderer;
import kr.or.ddit.prod.service.ProdService;
import kr.or.ddit.prod.service.ProdServiceImpl;
import kr.or.ddit.utils.PopulateUtils;
import kr.or.ddit.vo.PaginationInfo;
import kr.or.ddit.vo.ProdVO;
import kr.or.ddit.vo.SearchVO;

@WebServlet("/prod/prodList.do")
public class ProdListControllerServlet extends HttpServlet{
	private ProdService service = new ProdServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		
		ProdVO detailCondition = new ProdVO();
		PopulateUtils.populate(detailCondition, req.getParameterMap());
		
		req.getParameter("prodLgu");
		req.getParameter("prodBuyer");
		req.getParameter("prodName");
		
		String pageParam = req.getParameter("page");
		int currentPage = 1;
		if(StringUtils.isNumeric(pageParam)) {
			currentPage = Integer.parseInt(pageParam);
		}
		PaginationInfo<ProdVO> paging = new PaginationInfo<>(5,2);
		paging.setCurrentPage(currentPage);
		paging.setDetailCondition(detailCondition);
		
		service.retrieveProdList(paging);
		
		paging.setRenderer(new BootstrapPaginationRenderer());
		
		req.setAttribute("paging", paging);
		
		String viewName = "prod/prodList";
		new ViewResolverComposite().resolveView(viewName, req, resp);
	}
}
