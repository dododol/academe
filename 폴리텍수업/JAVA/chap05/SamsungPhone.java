package chap05;

public class SamsungPhone implements PhoneInterface{

	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		
	}

	@Override
	public void sendCall() {
		System.out.println("띠리리링~~");
		
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다~~");
	}
	

}
