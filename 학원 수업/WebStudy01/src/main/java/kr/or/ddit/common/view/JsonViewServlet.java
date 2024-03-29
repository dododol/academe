package kr.or.ddit.common.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

@WebServlet("/jsonView.view")
public class JsonViewServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		String contentType = "application/json;charset=UTF-8";
		resp.setContentType(contentType);

		Map<String, Object> target = new HashMap<>();
		Enumeration<String> attrNames = request.getAttributeNames();
		while(attrNames.hasMoreElements()){
			String name = attrNames.nextElement();
			Object value = request.getAttribute(name);
			target.put(name, value);
		}
		
//		Object content = new ObjectMapper().writeValueAsString(target);
		
		try(
			PrintWriter out = resp.getWriter();
		){
			new ObjectMapper().writeValue(out, target);
		}
	}
}
