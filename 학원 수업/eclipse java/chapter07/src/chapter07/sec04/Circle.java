package chapter07.sec04;

public class Circle extends Shape{
	Circle(String kind) {
		super(kind);
		
	}

	@Override
	public void draw() {
		System.out.println(kind + "을 그립니다");
		
	}
}
