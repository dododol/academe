package Study;

import java.util.Scanner;

public class Study01 {

	public static void main(String[] args) {
		/*
		 * 1. 조건문
		 * - 조건식의 겨로가에 따라 블록 실행 여부가 결정
		 * 
		 * > 조건문의 종류로는 if문, switch문이 있습니다.
		 * > if문은 조건식의 결과가 true/false냐에 따라 실행문이 결정됩니다.
		 * > switch문은 변수의 값에 따라 각 case의 값과 일치하는 실행문이 결정됩니다.
		 */
		// ~일때, 어떤 조건에 대한 식에 대한 문제를 만났을때 조건문 if셋트가 생각나도록
		// 공부한다!
		/*if() {
			
		}else if() {
			
		}else {
			
		}	*/
		
		// 조건문 if 연습해보기
		// 조건문 중, 가장 단골 문제인 짝수/홀수 문제
		
		Scanner sc = new Scanner(System.in);	// 입력을 위한 Scanner 객체 생성
	
		/*
		System.out.println("숫자를 입력해주세요 : ");
		// 입력받은 문자열의 값을 int로 형변환 해줌
		int numValue = Integer.parseInt(sc.nextLine());
		String result = "";
		
		if(numValue % 2 == 0) {	// 짝수
			result = numValue + " : 짝수입니다";
		}else {					// if와 반대이므로 홀수
			result = numValue + " : 홀수입니다";
		}
		
		System.out.println(result);
		*/
		// on,off로 켤 수 있는 전등 스위치를 만들어보자
		// 문제1)
		// - 문자열 click이라는 변수를 null로 선언 및 초기화 해주세요.
		// - 1 또는 2를 입력 받아서 입력 받은 값에 따라서 아래 내용을 출력해주세요.
		// > click의 값이 1일때, '전등 스위치가 on됩니다'를 출력해주세요.
		// > click의 값이 2일때, '전등 스위치가 off됩니다'를 출력해주세요.

	/*	내가 푼 문제
	 * String click = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1과 2중 입력해주세요: ");
		int num = Integer.parseInt(sc.nextLine());
		
		
		
		if(num == 1) {
			System.out.println("전등 스위치가 on됩니다.");
		}else {
			System.out.println("전등 스위치가 off됩니다.");
		}
	}
				내가 푼 문제 */

	
		/*
	String click = null;
	click = sc.nextLine();
//	if(click == "1") {	// 주소비교
//	}
	if(click.equals("1")) {	// 값비교
		System.out.println("전들 스위치가 on됩니다.");
	}else if(click.equals("2")) {
		System.out.println("전등 스위치가 off됩니다.");
	}else {
		System.out.println("무슨 스위치를 누른거?");
		}
	*/
	
	/* 성적 프로그램을 만들어보자
	 * 문제2)
	 * [성적 출력 조건]
	 * 90점 이상은 A,
	 * 80점 이상, 90점 미만 B
	 * 70점 이상, 80점 미만 c
	 * 60점 이상, 70점 미만 D
	 * 60점 미만은 f
	 * - 점수를 콘솔창에 입력 받고, 성적 출력 조건에 따라 결과를 출력해주세요.
	 * 사용할 변수명은 자유롭게!
	 */
/*	
	int num;
	num = sc.nextInt();
	
	if (num>=90) {
		System.out.println("A");
	}else if(num>=80) {
		System.out.println("B");
	}else if(num>=70) {
		System.out.println("C");
	}else if(num>=60) {
		System.out.println("D");
	}else {
		System.out.println("F");
	}
	*/

		
	//선생님 풀이
	System.out.println("점수를 입력해주세요 : ");
	String in = sc.nextLine();
	int num1 = Integer.parseInt(in);
	String grade = "";
	if(num1 >= 90) {
		grade = "A";
	}else if(num1 >= 80 && num1 < 90) {
		grade = "B";
	}else if(num1 >= 70 && num1 < 80) {
		grade = "C";
	}else if(num1 >= 60 && num1 < 70) {
		grade = "D";
	}else {
		grade = "F";
	}
	
	
	
		
	}
}
