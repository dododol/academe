package ch01.Ex;

import java.util.Scanner;

/*
03. Scanner 클래스를 이용하여 정수로 된 돈의 액수를 입력받아 
	오만 원권, 만 원권, 천원권, 500원짜리 동전, 100원짜리 동전, 50원짜리 동전, 10원짜리 동전, 1원짜리 동전 
	각 몇 개로 변환되는지 출력하라.
*/
public class Q03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 입력하세요 >>");
		int money = scan.nextInt();
		
		if(money >= 50000) {
			System.out.println("오만원권" + money/50000 + "매");
			money%=50000;
		}
		if(money >= 10000) {
			System.out.println("만원권" + money/10000 + "매");
			money%=10000;
		}
		if(money >= 1000) {
			System.out.println("천원권" + money/1000 + "매");
			money%=1000;
		}
		if(money >= 500) {
			System.out.println("오백원권" + money/500 + "매");
			money%=500;
		}
		if(money >= 100) {
			System.out.println("백원권" + money/100 + "매");
			money%=100;
		}
		if(money >= 50) {
			System.out.println("오십원권" + money/50 + "매");
			money%=50;
		}
		if(money >= 10) {
			System.out.println("십원권" + money/10 + "매");
			money%=10;
		}
		if(money >= 1) {
			System.out.println("일원권" + money/1 + "매");
			money%=1;
		}
	}
}
