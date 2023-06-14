package sec03.exam02;

public abstract class Animal {

	public String kind;
	
	public void Breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();
}
