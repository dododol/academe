package chapter07.sec04;

public class ShapeExample {

	public static void main(String[] args) {
		Triangle t1 = new Triangle("삼각형");
		Circle c1 = new Circle("타원형");
		
		Shape s1 = new Triangle("삼각형");
		Shape s2 = new Circle("타원형");
		
		s1.draw();
		s2.draw();

	}

}
