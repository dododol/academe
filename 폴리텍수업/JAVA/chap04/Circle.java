package chap04;

public class Circle {

	//1. 필드
	public int radius;
	public String name;
	
	//2. 메소드
	//2.1 생성자 메소드 (오버로딩가능, return type 없음, 클래스명과 동일)
	Circle() {}
	
	Circle(int radius) {
		this.radius = radius;
	}
	
	Circle(int radius, String name) {
		this.radius = radius;
		this.name = name;
	}

	//2.2 일반 메소드
	double getArea() {
		return radius*radius*3.14;
	}
	
	//2.3 main 메소드를 통해 실행
	public static void main(String[] args) {
		//3. 인스턴스 생성
		Circle c1 = new Circle();
		c1.radius = 3;
		double area = c1.getArea();
		System.out.println("반지름 : " +  c1.radius + "면적 : " + area);
		
		Circle c2 = new Circle();
		c2.radius = 5;
		area = c2.getArea();
		System.out.println("반지름 : " +  c2.radius + "면적 : " + area);

		Circle c3 = new Circle(10);
		area = c3.getArea();
		System.out.println("반지름 : " +  c3.radius + "면적 : " + area);
		
		Circle pizza = new Circle(24, "pizza hut");
		area = pizza.getArea();
		System.out.println("반지름 : " +  pizza.radius + "면적 : " + area + " 이름 : " + pizza.name);
		
		Circle donut = new Circle(15, "dunkin donut");
		area = donut.getArea();
		System.out.println("반지름 : " +  donut.radius + "면적 : " + area + " 이름 : " + donut.name);
	}
	
}















