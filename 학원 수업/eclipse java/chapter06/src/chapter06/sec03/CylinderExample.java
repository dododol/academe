package chapter06.sec03;

public class CylinderExample {

	public static void main(String[] args) {
		Cylinder c1 = new Cylinder(32.5,new Circle(10));
		
		System.out.println("원통의 부피 : " + c1.getVolumn());

	}

}
