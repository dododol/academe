package chap05;

// 인터페이스
// 상수 : public static final 정의 가능
// 메소드 : abstract 정의 가능, 단 default, static, private 은 가능
public interface PhoneInterface {
	//상수필드 : 기본 public static final
	final int timeout = 10000;
	//추상메소드 : 기본 public abstract
	void sendCall();
	void receiveCall();
	//default메소드 : 구현된 메소드, 기본 public 
	default void printLogo() {
		System.out.println("**Phone **");
	}
	
}
