package homeWork;

import java.util.Scanner;

public class Home2 {


	
	public static void main(String[] args) {
		// 문제 1, 반복문을 이용하여 숫자 1-10까지 출력해주세요.
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " ");

		}
		System.out.println();
		System.out.println("-----------------------------------------------");
		System.out.println();
		
		// 문제 2, 반복문을 이용하여 숫자 100-200까지 출력해주세요.
		
		for(int i = 100; i <= 200; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("-----------------------------------------------");
		System.out.println();
		
		// 문제 3, 반복문을 이용하여 숫자 10-25까지 출력해주세요.
		
		for(int i = 10; i <=25; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("-----------------------------------------------");
		System.out.println();
		
		// 문제 4, 반복문을 이용하여 숫자 28-34까지 출력해주세요.
		
		for(int i = 28; i <= 34; i++) {
			System.out.println(i + " ");
		}
		
		System.out.println();
		System.out.println("-----------------------------------------------");
		System.out.println();
		
		// 문제 5, 반복문을 이용하여 숫자 506-608까지 출력해주세요.
		
		for(int i = 506; i <= 608; i++) {
			System.out.println(i + " ");
		}
		
		System.out.println();
		System.out.println("-----------------------------------------------");
		System.out.println();
		
		// 문제 6, 반복문을 이용하여 숫자 1-10범위안에서 짝수만 출력해주세요.
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
				
			}
		}
		
		System.out.println();
		System.out.println("-----------------------------------------------");
		System.out.println();
		
		// 문제 7, 반복문을 이용하여 숫자 1-10범위안에서 홀수만 출력해주세요.
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 != 0) {
				System.out.print(i + " ");
				
			}
		}
		
		System.out.println();
		System.out.println("-----------------------------------------------");
		System.out.println();
		
		// 문제 8, 반복문을 이용하여 숫자 100-200 범위안에서 10의 배수만 출력해주세요.
		
		for(int i = 100; i <= 200; i++) {
			if(i % 10 == 0) {
				System.out.print(i + " ");
				
			}
		}
		
		System.out.println();
		System.out.println("-----------------------------------------------");
		System.out.println();
		
		// 문제 9, 반복문을 이용하여 숫자 10-25 범위 안에서 5의 배수만 출력해주세요.
		
		for(int i = 10; i <= 25; i++) {
			if(i % 5 == 0) {
				System.out.print(i + " ");
				
			}
		}
		
		System.out.println();
		System.out.println("-----------------------------------------------");
		System.out.println();

		// 문제 10, 반복문을 이용하여 숫자 28-34 범위 안에서 2의 배수가 아닌것만 출력해주세요.
		
		for(int i = 28; i <= 34; i++) {
			if(i % 2 != 0) {
				System.out.println(i + " ");
			}
		}
		
		System.out.println();
		System.out.println("-----------------------------------------------");
		System.out.println();
		
		// 문제 11, 반복문을 이용하여 숫자 506-608 범위 안에서 50의 배수 인것만 출력하고, 50의 배수인 숫자가 총 몇개인지 카운트도 출력해주세요.
		
		int count = 0;
		
		for(int i = 506; i <= 608; i++) {
			if(i % 50 == 0) {
				System.out.println(i + " ");
				count++;
			}
		}
		System.out.println("50의 배수인 수의 개수 : " + count);
		
		System.out.println();
		System.out.println("-----------------------------------------------");
		System.out.println();
		
		// 문제 12, 반복문을 이용하여 숫자 1-10까지의 숫자를 모두 더한 결과를 출력해주세요.
		
		int sum = 0;
		
		for(int i = 1; i <=10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		System.out.println();
		System.out.println("-----------------------------------------------");
		System.out.println();

		// 문제 13, 반복문을 이용하여 숫자 1-10 범위안에서 홀수들끼리만 모두 더한 결과를 출력해주세요.
		
		sum = 0;
		
		for(int i = 1; i <=10; i++) {
			if(i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		System.out.println();
		System.out.println("-----------------------------------------------");
		System.out.println();
		
		// 문제 14, 반복문을 이용하여 숫자 100-200 범위안에서 5의 배수에 해당하는 숫자들만 모두 더한 결과를 출력해주세요.
		
		sum = 0;
		
		for(int i = 100; i <= 200; i++) {
			if(i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		System.out.println();
		System.out.println("-----------------------------------------------");
		System.out.println();
		
		// 문제 15, 반복문을 이용하여 숫자 0-100 범위안에서 아래 조건일때 문장을 출력해주세요.
		// 0점일때 빵쩜!
		// 50점일때 중간은 했구나!
		// 70점일때 조금더 분발하자!
		// 90점일때 까비 조금더!
		// 100점일때 아주 잘했어요!
		
		for(int i = 0; i <= 100; i++) {
			if(i == 0) {
				System.out.println("빵점");
			}else if(i > 0 && i <= 50) {
				System.out.println("중간은 했구나!");
			}else if(i > 50 && i <= 70) {
				System.out.println("조금 더 분발하자!");
			}else if(i > 70 && i <= 99) {
				System.out.println("까비 조금더!");
			}else if(i == 100) {
				System.out.println("아주 잘했어요!");
			}
		}
		
		System.out.println();
		System.out.println("-----------------------------------------------");
		System.out.println();
		
		// 문제 16, 정수형 변수 a = 0을 선언 및 초기화하고, 반복문 while을 이용하여 변수 a가 1씩 증가하고 a가 10보다 클때까지 a를 출력해주세요.
		// 단, a가 10보다 클때 반복문을 종료해주세요.
		
		int a = 0;
		
		while(true) {
			a++;
			if(a > 10) {
				break;
			}
			System.out.println(a);
			
		}
		
		System.out.println();
		System.out.println("-----------------------------------------------");
		System.out.println();
		
		// 문제 17, 정수형 변수 b = 10을 선언 및 초기화하고, 반복문 while을 이용하여 변수 b가 1씩 증가하고 b가 20보다 클때까지 b를 출력해주세요.
		// 단, b가 짝수일때 '짝수(숫자) : 짝수입니다'를 출력해주세요. 
		// b가 20보다 클때 반복문을 종료해주세요.
		
		int b = 10;
		
		while(true) {
			b++;
			if(b > 20) {
				break;
			}
				
			if(b % 2 == 0) {
				System.out.println("짝수(" + b + ") : 짝수 입니다.");
			} else {
			
			System.out.println(b);
		}
		}
	
		System.out.println();
		System.out.println("-----------------------------------------------");
		System.out.println();
		
		// 문제 18, 정수형 변수 c = 0을 선언 및 초기화하고, 반복문 while을 이용하여 변수 c가 10씩 증가하고 c가 100보다 클때까지 c를 출력해주세요.
		// 단, c가 100일때 '100%입니다'를 출력해주시고 반복문을 종료해주세요. 
		
		int c = 0;
		
		while(true) {
			c += 10;
			if(c > 100) {
				break;
			}
			
			if( c == 100 ) {
				System.out.println("100%입니다");
			}
			
		}
		
		System.out.println();
		System.out.println("-----------------------------------------------");
		System.out.println();
		
		// 문제 19, 반복문 while을 이용하여 숫자를 무한반복으로 입력받아주세요.
		// 숫자 1을 입력받게되면 '로그인'이라는 문자를 출력해주세요.
		// 숫자 2를 입력받게되면 '로그아웃'이라는 문자를 출력해주세요.
		// 숫자 3을 입력받게되면 '종료'라는 문자를 출력해주시고, 반복문을 종료해주세요.
		
		Scanner sc = new Scanner(System.in);
		
		boolean ac = true;
		
		while(ac==true) {
			
			switch (sc.nextLine()) {
			
			case "1":
				System.out.print("로그인");
				break;
				
			case "2":
				System.out.print("로그아웃");
				break;
				
			case "3":
				System.out.print("종료");
				ac = false;
				break;
				
			}
		
		}
		
		System.out.println();
		System.out.println("-----------------------------------------------");
		System.out.println();
		
		// 문제 20, 반복문 while을 이용하여 문자를 무한반복으로 입력받아주세요.
		// 문자 '로그인'을 입력하면, '로그인 버튼을 클릭하였습니다'를 출력하고
		// 문자 '로그아웃'을 입력하면, '로그아웃 버튼을 클릭하였습니다'를 출력하고
		// 문자 '종료'를 입력하면, '시스템을 종료합니다'를 출력하고 종료를 입력한 경우 반복문을 종료해주세요.
		
		boolean ab = true;
		
		while(ab == true) {
			
			switch (sc.nextLine()) {
			
			case "로그인":
				System.out.println("로그인 버튼을 클릭하였습니다");
				break;

			case "로그아웃":
				System.out.println("로그아웃 버튼을 클릭하였습니다");
				break;
				
			case "종료":
				System.out.println("시스템을 종료합니다");
				ab = false;
				break;

			default:
				break;
			}
			
		}
		
	}
}






























