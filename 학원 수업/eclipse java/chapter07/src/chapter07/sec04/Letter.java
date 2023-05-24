package chapter07.sec04;

public class Letter extends ContentSender{
	String content;
	
	Letter(String title, String senderName, String content) {
		super(title,senderName);
		this.content = content;
	}
	
	@Override
	public void sendMsg(String recipient) {
		System.out.println("내용 : " + content);
		System.out.println("수신자 : " + recipient);
	}

}
