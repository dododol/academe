package chapter03.sec01;

import java.util.Scanner;

public class BinaryOperator01 {
	
	static Scanner sc = new Scanner(System.in);			// 멤버변수
	
	public static void main(String[] args) {
		// 이항 연산자 : 대부분의 연산자 (산술, 논리연산, 관계, 비트, 대입, 이동)
		// arithmeticOperator();
		//relationalOperator();
		logicalOperator();
	}
	
	public static void arithmeticOperator() {
		// 산술 연산자 : +, -, /, *, %
		int n1 = 100;
		int n2 = 12;
		System.out.println("n1=" + n1 + "\nn2=" + n2);
		System.out.println("n1+n2 : " + (n1 + n2));
		System.out.println("n1-n2 : " + (n1 - n2));
		System.out.println("n1*n2 : " + (n1 * n2));
		System.out.println("n1/n2 : " + (n1 / n2));
		System.out.println("n1%n2 : " + (n1 % n2));
	}
	
	public static void relationalOperator() {
		// 관계 연산자 : >, <, =, >=, <=, !=(<>)
		
		System.out.print("점수입력 : ");
		int score = Integer.parseInt(sc.nextLine());			// 대문자로 시작하면 클래스
		String grade = "";
		
		if(score >= 90) {
			grade = "A학점";
		}else if(score >= 80) {
			grade = "B학점";
		}else if(score >= 70) {
			grade = "C학점";
		}else if(score >= 60) {
			grade = "D학점";
		}else {
			grade = "F학점";
		}
		System.out.println("점수 : " + score + "\n학점 : " + grade);
	}
	
	public static void logicalOperator() {
		// 윤년 : (4의 배수이면서 100의 배수(and))가 아니거나 (또는 400의 배수가 되는 해(or))
		
		System.out.print("년도 입력 : ");
		int year = sc.nextInt();
		
		if((year % 4 == 0 && year % 100 != 0)||(year % 400 == 0)) {
			System.out.println(year + "년도는 윤년입니다.");
		}else {
			System.out.println(year + "년도는 평년입니다.");
		}
	}

}
