package chap05;

public class ShapeEx1 {

	public static void main(String[] args) {
		Shape2 s = new Shape2();
		s.paint();
		s = new Circle2();
		s.paint();
	}
}

class Shape2{
	protected String name;
	public void paint() {
		draw();
	}
	public void draw() {
		System.out.println("Shape");
	}
	
}

class Circle2 extends Shape2{
	public void draw() {
		System.out.println("Circle2");
	}
}