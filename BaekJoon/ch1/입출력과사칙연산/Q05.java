package ch1.입출력과사칙연산;

import java.util.Scanner;

/*
5. 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
*/
public class Q05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double A = scan.nextDouble();
		double B = scan.nextDouble();
		
		System.out.println(A/B);
	}
}
