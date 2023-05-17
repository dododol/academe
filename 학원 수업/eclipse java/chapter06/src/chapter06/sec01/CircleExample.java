package chapter06.sec01;

public class CircleExample {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.radius = 10.2;
		circle.x = 300;
		circle.y = 500;
		
		circle.getPoint();
		double res = circle.getArea();
		System.out.println("원의 넓이 : " +circle.getArea());
		
		circle.getCircumference();
	}

}

/*

 예제 1] 원점(좌표점)과 반지름을 보유한 원(Circle)클래스를 생성하시오.

또 너비와 반지름을 구하는 메소드도 포함하시오.

예제 2] 학번(long타입 정수), 이름(문자열)을 갖고 있는 학생클래스를 설계하시오
기능은 학생 정보를 출력하는 메소드로 구성

예제 3] 사원번호(int 타입의 정수), 사원명, 전화번호를 보유한 사원클래스(Employees)
를 작성하시오. 기능은 사원정보 출력 기능

예제 4] 제품번호, 제품명, 제조회사, 가격 정보를 가지고 있고 제품 정보를 출력할 수 있는
제품 클래스(Products)를 생성하시오.

*/