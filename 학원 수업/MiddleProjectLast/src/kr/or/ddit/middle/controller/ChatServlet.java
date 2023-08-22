package kr.or.ddit.middle.controller;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/chatServlet.do")
public class ChatServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    
            throws ServletException, IOException {
       request.setCharacterEncoding("utf-8");
       response.setCharacterEncoding("utf-8");
        String userInput = request.getParameter("userInput");
        String chatbotResponse = getChatbotResponse(userInput);
        request.setAttribute("chatbotResponse", chatbotResponse);
        request.getRequestDispatcher("/html/index.jsp").forward(request, response);
    }


    private String getChatbotResponse(String userInput) {
        String response;

        if (userInput.contains("안녕")) {
            response = "안녕하세요 반갑습니다! DDIT UDERDOGS를 방문해 주셔서 감사합니다.";
        } else if (userInput.contains("회원정보")) {
            response = "네. 회원정보를 열람 , 수정 , 탈퇴를 원하실때는 로그인 후 우측 상단 마이페이지를 클릭하시면 이용 가능합니다.";
            
        } else if (userInput.contains("회원가입")) {
            response = "회원가입은 우측상단에 위치한 로그인/회원가입에서 가능합니다.";
            
        } else if (userInput.contains("비밀번호")) {
            response = "비밀번호를  잊어버리셨다면 비밀번호 찾기를 해보세요. 로그인 페이지에서 가능합니다.";
            
        } else if (userInput.contains("아이디")) {
            response = "아이디를 잊어버리셨다면 아이디 찾기를 해보세요. 로그인 페이지에서 가능합니다.";
            
        } else if (userInput.contains("티켓")) {
            response = "DDIT UNDERDOGS 홈 경기장에서 열리는 티켓 구매를 원하신다면 상단 TICKET 메뉴를 클릭하여 원하는 경기날짜 , 구간, 좌석 선택을 하시고 결제 하시면 재밌고 신나는 경기를 즐기실 수 있습니다.";
            
        } else if (userInput.contains("선수")) {
            response = "선수 및 스태프 정보확인은 PLAYERS 카테고리에서 확인 가능합니다.";
            
        } else if (userInput.contains("감독")) {
            response = "선수 및 스태프 정보확인은 PLAYERS 카테고리에서 확인 가능합니다.";
            
        } else if (userInput.contains("게임")) {
            response = "네. 저희 DDIT UNDERDOGS 구단 사이트에서는 가상 시뮬레이션게임을 즐기실 수 있습니다. 상단 메뉴 LIVE GAME을 누르시면 원하는 AWAY 팀을 선택하시어 가상경기를 보시면서 팬분들간의 소통이 가능한 채팅을 즐겨 보실수 있습니다.";
            
        } else if (userInput.contains("채팅")) {
            response = "실시간 중계 및 채팅은 LIVE GAME 카테고리에서 가능합니다.";
            
        } else if (userInput.contains("재혁")) {
            response = "이재혁 선수는 도루 성공률 100%로 도루 성공횟수가 37,000번 입니다. DDIT언더독스의 야생마 라는 별명을 가지고 있습니다.";
            
        } else if (userInput.contains("선수")) {
            response = "네. 선수들에 대한 정보는 PLYAERS 메뉴에 포지션 별로 선택하여 보실수 있으며, 개인선수들의 스탯을 보실 수 있습니다.";
                
        } else {
            response = "이해하지 못했습니다. 문의게시판에 작성해주시거나 다른 질문을 해주세요.";
        }

        return response;
    }
}





