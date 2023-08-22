package kr.or.ddit.middle.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.Random;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.middle.service.ILoginService;
import kr.or.ddit.middle.service.LoginServiceImpl;
import kr.or.ddit.middle.vo.LoginVO;


@WebServlet("/mail.do")
public class Mail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		String userID = request.getParameter("userID");
		String userNUM = request.getParameter("userNUM");
		String userNAME = request.getParameter("userNAME");
		
		LoginVO vo = new LoginVO();
		vo.setMem_id(userID);
		vo.setMem_name(userNAME);
		vo.setMem_num(userNUM);
		
		System.out.println("VO : " + vo);
		
		ILoginService service = LoginServiceImpl.getInstance();
		
		String newPass = service.passWord(vo);
		
		System.out.println("newPass : " + newPass);
		
		
		
		
		
		String memberId = request.getParameter("memberId");

		// 먼저 아이디로 회원정보를 받아오고 가져온 데이터에서 email값을 비교하여 존재하지 않으면 인증메일 보내지 못함
		/*
		 * Member m = new MemberService().memberLogin(memberId); if(m==null ||
		 * !m.getEmail().equals(email)) { req.setAttribute("msg",
		 * "아이디나 이메일 정보가 맞지 않습니다"); req.setAttribute("loc", "/member/searchPw");
		 * req.getRequestDispatcher("/views/common/msg.jsp").forward(req, resp); return;
		 * }
		 */
		// mail server 설정
		String host = "smtp.naver.com";
		String user = "oks2329@naver.com"; // 자신의 네이버 계정
		String password = "(dhrudtjr100)";// 자신의 네이버 패스워드

		// 메일 받을 주소
		/* String to_email = m.getEmail(); */
		String to_email = "oks2329@naver.com";

		// SMTP 서버 정보를 설정한다.
		Properties props = new Properties();
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", 465);
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.ssl.enable", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.debug", "true");

		// 인증 번호 생성기
		StringBuffer temp = new StringBuffer();
		Random rnd = new Random();
		for (int i = 0; i < 10; i++) {
			int rIndex = rnd.nextInt(3);
			switch (rIndex) {
			case 0:
				// a-z
				temp.append((char) ((int) (rnd.nextInt(26)) + 97));
				break;
			case 1:
				// A-Z
				temp.append((char) ((int) (rnd.nextInt(26)) + 65));
				break;
			case 2:
				// 0-9
				temp.append((rnd.nextInt(10)));
				break;
			}
		}
		String AuthenticationKey = temp.toString();
		System.out.println(AuthenticationKey);

		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user, password);
			}
		});

		
		// email 전송
		try {
			MimeMessage msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(user, "관리자"));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to_email));

			if(newPass != null) {
			// 메일 제목
			msg.setSubject("안녕하세요  비밀번호 메일입니다.");
			// 메일 내용
			msg.setText("비밀 번호는 :" + newPass);

			Transport.send(msg);
			System.out.println("이메일 전송");
			}else {
				System.out.println("실패");
			}

		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}
		if(newPass != null) {
			
			System.out.println("성공 : " + newPass);
		HttpSession saveKey = request.getSession();
		saveKey.setAttribute("AuthenticationKey", newPass);
		
		response.setContentType("text/html; charset=UTF-8");
		out.print("<script> alert('메일로 비밀번호가 전송되었습니다'); window.close();</script>");
	
		out.flush();
		
		response.sendRedirect(request.getContextPath()+"/html/main.jsp");
		}else {
			System.out.println("실패 : " + newPass);
	//		response.sendRedirect(request.getContextPath()+"/html/sign.jsp");
			
			response.setContentType("text/html; charset=UTF-8");
			out.print("<script> alert('회원고객님의 입력하신 정보가 틀립니다. 다시 입력해주세요.'); location.href='http://localhost/MiddleProject/html/searchloginpass.jsp';</script>");
			out.flush();
		}
		// 패스워드 바꿀때 뭘 바꿀지 조건에 들어가는 id
		/*
		 * req.setAttribute("id", memberId);
		 * req.getRequestDispatcher("/views/login_myPage/searchPasswordEnd.jsp").forward
		 * (req, resp);
		 */
		
	
		
		
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
