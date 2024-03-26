package chap03;

import java.util.Scanner;

public class Continue_Break_Ex {

	public static void main(String[] args) {
		// 1. continue 예제
		// 음수를 제외하고 5회동안 반복시켜 합산결과 구하기
		
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		
		for(int i=1; i<=5; i++) {
			System.out.print("정수 입력 : ");
			int num = scan.nextInt();
			if(num<=0) {i--;continue;}
			sum += num;
		}
		System.out.println("합산결과 : " + sum);
		
	}

}
