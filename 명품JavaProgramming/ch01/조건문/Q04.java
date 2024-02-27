package ch01.조건문;

import java.util.Scanner;

/*
04. Scanner 클래스로 정수 3개를 입력받고 3개의 숫자 중 중간 크기의 수를 출력하라.
	평균값을 구하는 것이 아님에 주의하라.
*/
public class Q04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 3개를 입력하시오>>");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		int middleNum;

		if(num1<=num2 && num1>=num3 || num1<=num3 && num1>=num2) {
			middleNum=num1;
		}else if(num2 <= num1 && num2 >= num3 || num2 <= num3 && num2 >= num1) {
			middleNum=num2;
		}else {
			middleNum=num3;
		}
		System.out.println("중간 값은 " + middleNum);
	}
}
