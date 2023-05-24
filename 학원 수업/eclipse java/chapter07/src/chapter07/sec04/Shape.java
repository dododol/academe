package chapter07.sec04;

public abstract class Shape {
	String kind;
	
	Shape(String kind) {
		this.kind = kind;
	}
	
	public abstract void draw();
	
	@Override
	public String toString() {
		return kind;
	}
}
