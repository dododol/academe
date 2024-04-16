package chap05;

public class ShapeEx {

	public static void main(String[] args) {
		Shape shape = new Line();
		shape.draw();// 오버라이딩은 동적바인딩이 됩니다. 부모님 메소드는 무시
	}
}

class Shape{
	public void draw() {
		System.out.println("Shape!");
	}
}

class Line extends Shape{
	public void draw() {
		System.out.println("Line!");

	}
}

class Rext extends Shape{
	public void draw() {
		System.out.println("Rext!");
	
	}
}

class Circle extends Shape{
	public void draw() {
		System.out.println("Circle!");
	
	}
}
	
