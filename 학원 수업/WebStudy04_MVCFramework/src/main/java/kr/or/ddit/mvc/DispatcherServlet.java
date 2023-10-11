package kr.or.ddit.mvc;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.jstl.core.Config;

import kr.or.ddit.common.controller.IndexController;
import kr.or.ddit.mvc.annotation.HandlerAdapter;
import kr.or.ddit.mvc.annotation.HandlerMapping;
import kr.or.ddit.mvc.annotation.RequestMappingHandlerAdapter;
import kr.or.ddit.mvc.annotation.RequestMappingHandlerMapping;
import kr.or.ddit.mvc.annotation.RequestMappingInfo;
import kr.or.ddit.prod.controller.ProdListController;
import kr.or.ddit.prod.controller.ProdViewController;
import lombok.extern.slf4j.Slf4j;

/**
 * Front Controller Patter 구조의 front controller
 * command handler 에 대해 사전 작업과 사후 작업을 처리할 수 있는 front
 *
 */
@Slf4j
public class DispatcherServlet extends HttpServlet{
	private ViewResolver viewResolver;
	private HandlerMapping handlerMapping;
	private HandlerAdapter handlerAdapter;
	
	@Override
		public void init(ServletConfig config) throws ServletException {
			super.init(config);
			viewResolver = new ViewResolverComposite();
			String prefix = config.getInitParameter("prefix");
			String suffix = config.getInitParameter("suffix");
			viewResolver.setPrefix(prefix);
			viewResolver.setSuffix(suffix);
			handlerMapping = new RequestMappingHandlerMapping("kr.or.ddit");
			handlerAdapter = new RequestMappingHandlerAdapter();
		}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestMappingInfo mappingInfo = handlerMapping.findCommandHandler(req);
		
		log.info("검색된 핸들러 정보 : {}", mappingInfo);
		
		String viewName = null;
		if(mappingInfo != null) {
			viewName = handlerAdapter.invokeHandler(mappingInfo, req, resp);
		}else {
			resp.sendError(404, "처리할 수 없는 요청임.");
			return;		
		}

		
		if(viewName!=null) {
			viewResolver.resolveView(viewName, req, resp);
		}else {
			if(!resp.isCommitted()) {
				resp.sendError(500, "logical view name 이 결정되지 않았음.");
			}
		}
	}
}

















