package chap03;

import java.util.Scanner;

/*
 * 1~10까지의 합산 결과 출력하기 프로그램
 */
public class Sum_loop {

	public static void main(String[] args) {
		// 1. while 문 작성
//		int num = 1, sum = 0;
//		
//		while(num<=10) {
//			sum += num;	// sum = num+sum
//			num ++;		// num = num+1
//		}
//		System.out.println("합산결과 : " + sum);
		
		// 2. for 문 작성
//		int sum = 0;
//		for(int num = 1; num <= 10; num++) {
//			sum += num;
//		}
//		System.out.println("합산결과 : " + sum);

		// 3. for 문 : 1~100 사이를 합산하다가, sum >= 1000 을 넘어서는 순간의 sum 을 출력해주세요
//		int sum = 0;
//		for (int num = 1; num <= 100; num++) {
//			if(sum>=1000) break;
//			sum += num;
//		}
//		System.out.println("sum : " + sum);

		// 4. for 문 : 1~100사이을 합산하는데, 3의 배수는 제외하고 합산하라.
//		int sum = 0;
//		for (int num = 1; num <= 100; num++) {
//			if(num%3==0) continue;
//			sum += num;
//		}
//		System.out.println("sum : " + sum);
		
		// 5. do-while 문 : 1~100사이을 합산하는데, 3의 배수는 제외하고 합산하라.
//		int sum = 0;
//		int num = 0;
//		do {
//			num++;
//			if(num%3==0) continue;
//			sum += num;
//
//		}while(num<=100);
//		
//		System.out.println("sum : " + sum);
		
		// 6. 사용자에게 정수를 입력받되, -1을 입력할 때까지 합산하여 결과를 출력해주세요.
			// 6-1. 1회성 코드를 짜라.
			// 6-2. 무한루프를 활용하여, 탈출조건이 만족할 때 탈출시켜라!

		Scanner scan = new Scanner(System.in);
		int sum = 0;
		
		// 1회성 코드 작성 >> 반복문 입히기 >> 탈출구 만들기
		
		while(true) {
			System.out.println("정수 입력 : ");			
			int num = scan.nextInt();
			if(num == -1) break;
			sum = sum+num;
		}
		System.out.println("합계 : " + sum);
	}
}





















