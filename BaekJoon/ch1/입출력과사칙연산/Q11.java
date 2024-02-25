package ch1.입출력과사칙연산;

import java.util.Scanner;

/*
11. 꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 
	이제 A + B + C를 계산할 차례이다!
*/
public class Q11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long A = scan.nextLong();
		long B = scan.nextLong();
		long C = scan.nextLong();
		
		System.out.println(A+B+C);
	}
}
