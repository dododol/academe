package chap04.sec01;

import java.util.Scanner;

public class SwichStatementExample {
	public static void main(String[] args) {		// 메인메소드의 클래스에만 public 붙힌다.
		SwitchStatement sw = new SwitchStatement();		// new -> 힙에 메모리 생성
		// sw.method1();
		// sw.method2();
		// sw.method3();
		sw.method4();
	}

}

class SwitchStatement {						// 다른 파일로 만들때는 public 붙힐 수 있음 // 멤버변수 초기화 안 해도 됨(Java에서 해줌), 지역변수 초기화 해야함
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		// protected(같은 패키지 | 자식클래스 안에서 자유롭게) default(같은 패키지 안에서만) private (가장 보수적.외부에서 사용 x)  public(외부에서도 자유롭게) 4가지 접근제한자
		// void를 사용하면 되돌려줄 값이 없다(반환타입 x)
		System.out.print("회원 등급 입력(1-3) : ");
		int grade = Integer.parseInt(sc.nextLine());
		
		switch (grade) {
		case 1 :
			System.out.println("VIP 회원입니다.");
			break;
		case 2 :
			System.out.println("우수 회원입니다.");
			break;
		case 3 :
			System.out.println("일반 회원입니다.");
		default :
			System.out.println(grade + "는 잘못된 등급코드입니다.");
		}
	}
	
	public void method2() {
		System.out.print("월 입력(1-12) : ");
		int month = Integer.parseInt(sc.nextLine());		// nextInt 사용해도 되지만 space bar만 눌러도 출력 실행되기 때문에 안정성을 위하여 nextLine으로 실행하고 파싱하여 Int타입으로 변환.
															// 이렇게 nextLine을 int로 파싱하여 사용하면 enter를 눌러야 출력 실행됨(ex : 주소를 입력할 때 스페이스바를 이용)
		switch (month) {
//			case 1 :	case 3 :	case 5 :	case 7 : 				// or(||) 연산자로 연결되어진 형태
//			case 8 : 	case 10 :	case 12 :
			// if (month == 1 || month == 3 || ... month == 12 ||)		// if로 사용할 대
			case 1 :
			case 3 :
			case 5 :													// or(||) 연산자로 연결되어진 형태 : 공통된 명령을 수행할 경우에 사용. if보다 훨씬 유용하게 사용
			case 7 : 
			case 8 : 
			case 10 :
			case 12 :
				System.out.println(month + "월은 끝나는 날짜가 31일까지 있는 달입니다.");		
				break;
			case 4 : case 6 : case 9 : case 11:
				System.out.println(month + "월은 끝나는 날짜가 30일까지 있는 달입니다.");
				break;
			default :
				System.out.println("끝날자가 28일인 2월 입니다");
		}
	}
	
	public void method3() {
		System.out.print("국가 코드를 입력하세요(kr, jp, ch) : ");
		String con = sc.nextLine();
		
		switch (con) {
		case "kr" :
			System.out.print("대한민국");
			break;
		case "jp" :
			System.out.print("일본");
			break;
		case "ch" :
			System.out.print("중국");
			break;
		}
		System.out.println("");
	}
	
	public void method4() {
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		String grade="";
		
		switch (score/10) {
		case 10 :
			grade ="A+";
			break;
		case 9 : 
			grade="A";
			switch(score%10) {
			case 0 : case 1 : case 2 :
				grade = grade +"-";
				break;
			case 3 : case 4 : case 5 : case 6 :
				grade = grade +"0";
				break;
			case 7 : case 8 : case 9 : 
				grade = grade + "+";
			}
			break;
		case 8 : 
			
			break;
			default :
				grade = "fail";
			
		}
		System.out.println("점수 " + score + "는 " + grade + "학점입니다.");
	}

}


/*Break : 반복문(for , while, do while), 자기가 속한 case에서 벗어날 때만 사용(한 단계의 괄호만 벗어날 수 있음)

[switch]
  예1] 회원의 등급코드(1-3)를 일력 받아
	1등급 회원이면 “VIP회원입니다”를
	2등급 회원이면 “우수회원 입니다”를
	3등급 회원이면 “일반 회원입니다”를
	그 이외의 값이면 “잘못된 등급코드 입니다”를 출력하는 프로그램

 예2] 1-12월 사이의 월을 입력 받아
	31일까지 존재하면 “끝 날자가 31일인 달입니다.”를
	30일까지 존재하면 “끝 날자가 30일인 달입니다.”를
	2월이면 “끝 날자가 28일인 2월 입니다.” 를 출력하시오

문제1] 국가명을 영문 코드(kr, jp, ch)를 입력받아 한글로 국가명을 출력

문제2]  점수를 입력 받아
	90 ~ 92 : A-
	93 ~ 96 : A0
	97 ~ 99 : A+
	
	80 ~ 82 : B-
	83 ~ 86 : B0
	87 ~ 89 : B+
	
	그 이하는 “fall” 출력 */

























