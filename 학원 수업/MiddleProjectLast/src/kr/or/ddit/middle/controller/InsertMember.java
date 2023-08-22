package kr.or.ddit.middle.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.middle.service.ILoginService;
import kr.or.ddit.middle.service.LoginServiceImpl;
import kr.or.ddit.middle.vo.LoginVO;


  
@WebServlet("/insertMember.do")
public class InsertMember extends HttpServlet {
	private static final long serialVersionUID = 1L;  
  
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");

		response.setContentType("text/html;charset=UTF-8"); // 응답의 콘텐츠 타입 설정

		String contextPath = request.getContextPath(); // 컨텍스트 경로 가져오기
		
		
		 String mem_id = request.getParameter("userID");
		 String mem_pw = request.getParameter("userPW");
		 String mem_name = request.getParameter("userNAME");
		 String mem_num = request.getParameter("userNUM");
		 String mem_mail = request.getParameter("userMAIL");
		 String mem_tel = request.getParameter("userTEL");
		 int mem_addrnum = Integer.parseInt(request.getParameter("userADDRNUM"));
		 String mem_addr1 = request.getParameter("userADDR1");
		 String mem_addr2 = request.getParameter("userADDR2");

		 System.out.println(mem_id);
		 System.out.println(mem_pw);
		 System.out.println(mem_name);
		 System.out.println(mem_num);
		 System.out.println(mem_mail);
		 System.out.println(mem_tel);
		 System.out.println(mem_addrnum);
		 System.out.println(mem_addr1);
		 System.out.println(mem_addr2);
		 
		 LoginVO vo = new LoginVO();
		 vo.setMem_id(mem_id);
		 vo.setMem_pw(mem_pw);
		 vo.setMem_name(mem_name);
		 vo.setMem_num(mem_num);
		 vo.setMem_mail(mem_mail);
		 vo.setMem_tel(mem_tel);
		 vo.setMem_addrnum(mem_addrnum);
		 vo.setMem_addr1(mem_addr1);
		 vo.setMem_addr2(mem_addr2);
		 
		 ILoginService service = LoginServiceImpl.getInstance();
		 
		 int res = service.insertMemberInfo(vo);
		 
		 HttpSession session = request.getSession();
		 
		 if(res > 0) {
			 session.setAttribute("insertMember", res);

				response.setContentType("text/html; charset=UTF-8");
				
				PrintWriter out = response.getWriter();
				
				out.print("<script>location.href ='" + contextPath + "/html/main.jsp'; alert('회원가입 성공!'); </script>");
				
				out.flush();
				

		 }else {
			 
			    response.setContentType("text/html; charset=UTF-8");
				
				PrintWriter out = response.getWriter();
				
				out.print("<script>location.href ='" + contextPath + "/html/sign.jsp'; alert('회원가입 실패! 다시 입력하세요'); </script>");
				
				out.flush();

		 }
		 
		 

		
		 
		 
		 
		
		 
	}

}
