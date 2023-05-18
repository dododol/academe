 package chapter06.sec03;

public class Cylinder {
	private double height;
	Circle circle;
	
	Cylinder() {}
	Cylinder(double height, Circle circle) {
		this.height = height;
		this.circle = circle;
	}
	
	public double getVolumn() {
		return height * circle.getArea();
	}

}
