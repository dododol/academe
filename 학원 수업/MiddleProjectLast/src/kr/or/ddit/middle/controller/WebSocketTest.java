package kr.or.ddit.middle.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import com.google.gson.Gson;


@ServerEndpoint("/liveChat")  // 웹소켓 서비스명 지정
public class WebSocketTest {
	//유저 집합 리스트
	static List<Session> sessionUsers = Collections.synchronizedList(new ArrayList<Session>());
	
	
	/**
	 * 웹 소켓이 접속되면 유저리스트에 세션을 넣는다.
	 * @param userSession 웹 소켓 세션
	 */
	@OnOpen
	public void handleOpen(Session userSession){
		sessionUsers.add(userSession);
		System.out.println(userSession.getId() + "접속\n");
	}
	
	
	/**
	 * 웹 소켓으로부터 메시지가 오면 호출한다.
	 * @param message 메시지
	 * @param userSession
	 * @throws IOException
	 */
	@OnMessage
	public void handleMessage(String message,Session userSession) throws IOException{
		String username = (String)userSession.getUserProperties().get("username");
		
		// 필터링할 단어 설정
	    List<String> filteredWords = Arrays.asList("이건창", "바보", "멍청", "존나", "씨발","개새끼","멍청이","좆","싸가지","재수","니미","뻐큐");
	    boolean filtered = false;
	    
	    // 필터링된 단어가 포함되어 있는지 검사
	    for (String word : filteredWords) {
	        if (message.contains(word)) {
	            // 필터링된 단어가 포함된 메시지는 거부하거나 수정할 수 있음
	            message = message.replace(word, "**");
	            filtered = true;
	            if (filtered) {
	    	    	userSession.getBasicRemote().sendText(buildJsonData("관리자 ","[매너 채팅 부탁드립니다.]")); // 필터링된 단어 다음에 메시지 추가
	    	    }
	            break;
	        }
  
	    }
	    
	    
	    
	    
		
		
		// 세션 프로퍼티에 username이 없으면 username을 선언하고 해당 세션을 메시지를 보낸다.(JSON 형식이다.)
		// 최초 메시지는 username설정
		if(username == null){
			userSession.getUserProperties().put("username", message);
			userSession.getBasicRemote().sendText(buildJsonData("System", "접속 성공 - 접속자이름 : " + message));
			return;
		}
		
		// username이 있으면 전체에게 메시지를 보낸다.
		for(Session session : sessionUsers) {
			session.getBasicRemote().sendText(buildJsonData(username,message));
		}
	}
	
	
	/**
	 * 웹소켓을 닫으면 해당 유저를 유저리스트에서 뺀다.
	 * @param userSession
	 */
	@OnClose
	public void handleClose(Session userSession){
		sessionUsers.remove(userSession);
	}
	
	/**
     * 웹 소켓이 에러가 나면 호출되는 이벤트
     * @param t
     */
    @OnError
    public void handleError(Throwable t){
        t.printStackTrace();
    }
    
	
	/**
	 * json타입의 메시지 만들기
	 * @param username
	 * @param message
	 * @return
	 */
	public String buildJsonData(String username,String message){
		Gson gson = new Gson();
		Map<String, String> jsonMap = new HashMap<String, String>();
		jsonMap.put("message", username+" : "+message);
		String strJson = gson.toJson(jsonMap);
		//System.out.println("strJson = " + strJson);

		return strJson;
	}
}