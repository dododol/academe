package chapter07.sec05;

public abstract class Unit {	

	int x;
	int y;
	String nm;
	
	Unit(String nm){	// 생성자메소드 = 멤버변수 초기화
		this.nm = nm;
	}
	
	public void stop(String nm, int x, int y) {
		System.out.println(nm + "이 (" + x + "," + y + ")에 멈춥니다");
		
	}
	
	public abstract void move(int x, int y);
}

class Marine extends Unit {
	Marine() {
		super("해병");			// 부모클래스를 부를 때 super 사용
	}
	
	@Override
	public void move(int x, int y) {
		System.out.println(nm + "이 (" + x + "," + y + ") 위치로 이동합니다.");
	}
	
	public void stimPack() {
		System.out.println("공격모드 : 스팀팩 장전");
	}
}

class Tank extends Unit{
	Tank() {
		super("탱크");
	}

	@Override
	public void move(int x, int y) {
		System.out.println(nm + "가 (" + x + "," + y + ") 위치로 이동합니다.");
	}
	
	public void sizeMode() {
		System.out.println("공격모드 : 시즈모드로 전환");
	}
}