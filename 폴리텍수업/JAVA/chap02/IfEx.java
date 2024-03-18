package chap02;

import java.util.Scanner;	//자동import : Ctrl + shift + O

public class IfEx {

	public static void main(String[] args) {
		
		//1. 단일 if 문
		//총점이 90점 이상인 경우 "잘했어"출력하라
		/*
		System.out.print("두 개의 정수 입력 : ");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int total = a + b;
		
		if(total >= 90) {	//단일문은 중괄호 생략 가능
			System.out.println("잘했어!");	
		}
		*/
		
		//2. if - else 문
		//총점이 90점 이상인 경우 "잘했어"출력, 아니면 "분발해" 출력
//		System.out.print("두 개의 정수 입력 : ");
//		Scanner scan = new Scanner(System.in);
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		int total = a + b;
//		
//		if(total >= 90) {	
//			System.out.println("점수 : " + total + "점이야, 잘했어!");	
//		}else {
//			System.out.println("점수 : " + total + "점이야, 분발해!");
//		}
		
		
		
		//3. if - else if 문 (분기적 if)
		//총점이 90점 이상 : "A", 80점 이상 : "B", 70점 이상 : "C" 그 외 : "F"
//		System.out.print("두 개의 정수 입력 : ");
//		Scanner scan = new Scanner(System.in);
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		int total = a + b;
//		
//		if(total >= 90) {
//			System.out.println("A학점!");
//		}else if(total >= 80) {
//			System.out.println("B학점!");
//		}else if(total >= 70) {
//			System.out.println("C학점!");
//		}else {
//			System.out.println("F!");			
//		}
		
		
		// 4. 중첩 if 문 ex) if() {if}
		/*
		 Q. 놀이동산 매표가격 문제
		 시간 : 주간권(16:00이하), 야간권(16:00초과)
		 나이 : 대인(소인과 노인 외), 소인과 노인(소인 7살이하, 노인 65세 이상)
		 가격 : 주간&대인 20000, 주간&노소인 10000 야간&대인 15000 야간&노소인 5000
		 */
		
		System.out.println("시간(0~24)과 나이(3~100) 입력 : ");
		Scanner scan = new Scanner(System.in);
		
		int time = scan.nextInt();
		int age = scan.nextInt();
		int price = 0;
		
		//교수님 풀이
		if(time <= 16) 	{
			if(age <= 7 || age >= 65)	price = 10000;	//소인 및 노인
			else		 				price = 20000;	//대인
			
		}else {
			if(age <= 7 || age >= 65) 	price = 5000;	//소인 및 노인
			else 						price = 15000;	//대인
			
		}
		System.out.println("가격 : " + price + "원");

		// 기존의 내 풀이
//		if(time <= 16) 	{
//			if(age <= 7 || age >= 65) {
//				price = 10000;	//소인 및 노인
//			}else {
//				price = 20000;	//대인
//			}
//		}else {
//			if(age <= 7 || age >= 65) {
//				price = 5000;	//소인 및 노인
//			}else {
//				price = 15000;	//대인
//			}
//		}
//		System.out.println("가격 : " + price + "원");
		
		
	}

}















