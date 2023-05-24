package chapter07.sec04;

public class ContentSanderExample {

	public static void main(String[] args) {
//		KakaoSender ks = new KakaoSender("회식공지","반장","오늘 19시 구내식당");
//		ks.sendMsg("홍길동");
		
		Letter l1 = new Letter("회식공지","반장","오늘 19시 구내식당");
		l1.sendMsg("홍길동");

	}

}
