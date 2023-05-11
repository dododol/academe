package chapter03.sec01;		//클래스에 올수 있는 선언문은 두가지. package, import인데 순서는 무조건 package가 먼저다

import java.util.Scanner;

public class TrinomialOperator {
	static Scanner sc = new Scanner(System.in);		// 클래스 안쪽, 메소드 바깥쪽에 static으로 Scanner를 생성해두면 어디서든 사용 가능하다.
	public static void main(String[] args) {
		// 삼항연산자 : (조건식) ? 명령문1 : 명령문2
		// - 조건식의 평가 결과 참이면 명령문1을 수행하고,
		//   거짓이면 명령문2를 수행한다.
		// - 명령문 1, 2에는 값이나 연산식을 기술
		// 나이를 입력 받아 성년인지 미성년자인지를 판별하는 프로그램
		
		//method1();
		method2();
	}
	
	//첫번째 메소드
	
	public static void method1() {
		 // 나이를 입력 받아 성년인지 미성년자인지를 판별하는 프로그램
		
		System.out.print("나이입력 : ");
		int age = sc.nextInt();			// sc. 까지 누르면 하위 멤버메소드 목록 나옴
		String str = (age >= 18) ? "성년입니다" : "미성년입니다";
		System.out.println("나이 : " + age + " ==>" + str);
	}
	
	public static void method2() {
		// 키보드로 점수를 입력받아서
		// 100~90 : A, 89~80 : B, 79~70 : C,
		// 69~60 : D, 그 이하이면 F 출력
		System.out.print("점수 입력 : ");
		int score = Integer.parseInt(sc.nextLine());			// Wrapper : int, char 두가지만 이름 다름. 나머지 6가지는 같음
				// 바뀌는 형. 바꾸려는 형		(ex: 문자열 -> 실수형  (Double.parseDouble())
		// String grade = (score>=90 ? "A" : (score >= 80? "B" : (score >= 70? "C" : ( score >= 60? "D" : "F"))));
		String grade = (score>=90) ? "A" : (score >= 80)? "B" : (score >= 70)? "C" : ( score >= 60)? "D" : "F";
		System.out.println(score + "=>" + grade + "학점");
	}
	

}

// Scanner를 모든 메소드에서 사용하고 싶으면 메인 메소드에 입력시켜놓는다.( 단, 주기억장치(메모리)에 로드시켜야한다)

// Static은 프로그램이 적재되어질때 만들어진다. 클래스가 만들어지는 갯수가 많아도 메소드 영역에 하나만 만들어진다. 

// 변수는 세가지가 있다. 선언되어지는 변수 = 지역변수(ex)타입 + 변수명), 전역변수(Static), 멤버변수(클래스 안쪽 메소드 바깥쪽)

// 멤버변수는 클래스와 같은 기간동안 존재한다. 클래스에 객체가 생성될 때마다 멤버변수는 초기화됨

// 클래스 = new연산자로 공간을 만들기 위한 설계도

// * 생성자 메소드(new)이용하여 멤버변수 초기화

// 초기화 방법 직접초기화방법, 초기화블럭 만드는방법(잘안씀)

// static을 불러서 쓰려면 상대도 static이어야 한다