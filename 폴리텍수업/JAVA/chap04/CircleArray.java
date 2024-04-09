package chap04;

// 객체 배열 만들기
public class CircleArray {

	public static void main(String[] args) {
		Circle[] c = new Circle[5];
		
		for(int i=0; i<c.length; i++) {
			c[i] = new Circle(i);
		}
		
		for(int i = 0; i<c.length; i++)
			System.out.println(c[i].getArea());
			
		// todo : for-each 문으로 출력하려면?
		for( Circle cc: c )
			System.out.println(cc.getArea());
	}
}
