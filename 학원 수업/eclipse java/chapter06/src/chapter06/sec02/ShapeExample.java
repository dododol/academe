package chapter06.sec02;

public class ShapeExample {

	public static void main(String[] args) {
		Shape s1 = new Shape("삼각형",100);
		s1.weight=500;			// ->생성자메소드로 덮어쓴 후에도 값은 이와같이 변경할 수 있음.
		System.out.println(s1);

		Shape s2 = new Shape("사각형",10);
		s2.weight=1500;
		System.out.println(s2);
		
		
	}

}
