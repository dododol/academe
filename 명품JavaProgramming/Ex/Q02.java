package ch01.Ex;

import java.util.Scanner;

/*
02. Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고, 
	십의 자리와 1의 자리가 같은지 판별하여 출력하는 프로그램을 작성하라.
*/
public class Q02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("10~99사이의 정수를 입력하세요 >>");
		int num = scan.nextInt();
		
		if(num >= 10 && num <= 99) {
			if(num/10 == num%10) {
				System.out.println("10의 자리와 1의 자리가 같습니다.");
			}else {
				System.out.println("10의 자리와 1의 자리가 다릅니다.");
			}
		}else {
			System.out.println("정확한 값을 입력해주세요.");
		}
		
	}
}
