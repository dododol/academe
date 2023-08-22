package kr.or.ddit.middle.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.middle.service.ILoginService;
import kr.or.ddit.middle.service.LoginServiceImpl;
import kr.or.ddit.middle.vo.LoginVO;

@WebServlet("/updateMember.do")
public class UpdateMember extends HttpServlet {
   private static final long serialVersionUID = 1L;
   
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
	   
      request.setCharacterEncoding("utf-8");
      response.setCharacterEncoding("utf-8");

      String mem_id = request.getParameter("userID");
      String mem_pw = request.getParameter("userPW");
      String mem_name = request.getParameter("userNAME");
      String mem_num = request.getParameter("userNUM");
      String mem_mail = request.getParameter("userMAIL");
      String mem_tel = request.getParameter("userTEL");
      int mem_addrnum = Integer.parseInt(request.getParameter("userADDRNUM"));
      String mem_addr1 = request.getParameter("userADDR1");
      String mem_addr2 = request.getParameter("userADDR2");

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

      //service객체 얻기
      ILoginService service = LoginServiceImpl.getInstance();
      
      //service메소드 호출하기 - 결과값 받기
      int res = service.updateMemberInfo(vo);
      
      //request에 결과저장
      request.setAttribute("result", res);
      
      //view 페이지로 이동
//      request.getRequestDispatcher("/mypage.do").forward(request, response);
      response.sendRedirect(request.getContextPath()+"/mypage.do");

      
      
      
   }
	

}
