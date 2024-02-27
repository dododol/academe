package ch01.조건문;

import java.util.Scanner;

/*
01. Scanner 클래스를 이용하여 원화를 입력받아 달러로 바꾸어 
	다음 예시와 같이 출력하는 프로그램을 작성하라. $1=1100원으로 가정하고 계산하라.
*/
public class Q01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원)>>");
		int won = scan.nextInt();
		double doller = won/1100;
		
		System.out.println(won + "원은 $" + doller + "입니다.");
	}
}
