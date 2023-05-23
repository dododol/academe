package Study;

import java.util.Scanner;

public class Study02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 조건문 switch 연습해보기
		// 조건문 중, 가장 단골인 짝수/홀수 구하기
/*		System.out.println("숫자를 입력해주세요 : ");
		String input = sc.nextLine();
		
		switch (Integer.parseInt(input) % 2) {	// 괄호 안에는 변수가 될 수도, 어떠한 조건식의 값이 될수도 있음. 여기 사용한 식을 사용하면 0과 1 두가지만 나옴
		case 0:		// case 뒤에는 값이 들어옴
			System.out.println(input + ":짝수");
			break;	// 여기에 break가 없으면 case1이 실행됨.
			
		case 1:
			System.out.println(input + ":홀수");
			break;
			
		default:
			System.out.println("무슨 숫자죠?");
			break;
		}

	*/

	/* 가위바위보 게임을 만들어보자
	 * 문제1)
	 * A사람과 B사람이 가위바위보 게임을 합니다.
	 * A사람이 낸 가위바위보 B 사람이 낸 가위바위보에 따라 결과를 출력해주세요.
	 * - 왼쪽 사람을 기준으로 결과를 출력해봅시다
	 * > 가위 가위, 바위 바위, 보 보 : 비겼습니다.
	 * > 가위 바위, 바위 보, 보 가위 : 졌습니다.
	 * > 바위 가위, 보 바위, 가위 보 : 이겼습니다.
	 * switch case문을 이용해서...!
	 */
	
		
		
	
	System.out.println("A사람 :");
	String strA = sc.nextLine();
	
	System.out.println("B사람 :");
	String strB = sc.nextLine();

	switch (strA) {
	case "가위" :
		
		switch (strB) {
		case "가위" :
			System.out.println("비겼습니다.");
			break;
		case "바위" :
			System.out.println("졌습니다.");
			break;
		case "보" :
			System.out.println("이겼습니다.");
			break;
		default:
			System.out.println("사람B가 엉뚱한 걸 냈습니다");
			break;
		}
		
		break;
	case "바위":
		
		switch (strB) {
		case "가위" :
			System.out.println("이겼습니다.");
			break;
		case "바위" :
			System.out.println("비겼습니다.");
			break;
		case "보" :
			System.out.println("졌습니다.");
			break;
		default:
			System.out.println("사람B가 엉뚱한 걸 냈습니다");
			break;
		}
		
		break;
	case "보":
		
		switch (strB) {
		case "가위" :
			System.out.println("졌습니다.");
			break;
		case "바위" :
			System.out.println("이겼습니다.");
			break;
		case "보" :
			System.out.println("비겼습니다.");
			break;
		default:
			System.out.println("사람B가 엉뚱한 걸 냈습니다");
			break;
		}
		
		break;
		default:
			System.out.println("사람A가 엉뚱한 걸 냈습니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	}
	
	
}
