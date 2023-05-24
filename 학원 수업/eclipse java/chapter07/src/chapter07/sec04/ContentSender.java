package chapter07.sec04;

public abstract class ContentSender {

	String title;
	String senderName;
	
	ContentSender() {}
	ContentSender(String title, String senderName) {
		this.title = title;
		this.senderName = senderName;
	}
	
	public abstract void sendMsg(String content);
}
