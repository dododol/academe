package chapter06.sec03;

public class Circle {
	private double radius;
	private final double PI = 3.1415926;
	
	Circle(){}
	Circle(double radius){
		this.radius = radius;
	}
	
	public double getArea() {
		return radius * radius * PI;
	}
}
