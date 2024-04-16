package chap05;

public class ShapeEx2 {

	public static void main(String[] args) {
		Shape3 s = new Circle3();
	}
}

class Shape3 {
	protected String name;	// 슈퍼클래스의 name : super.name
	public void paint() {
		draw();
	}
	public void draw() {
		System.out.println(name);
	}
}

class Circle3 extends Shape3{
	protected String name;	// 서브클래스의 name : this.name
	@Override
	public void draw() {
		this.name = "Circle";
		super.name = "Shape";
		super.draw();	//정적바인딩
		System.out.println(name);
	}
}