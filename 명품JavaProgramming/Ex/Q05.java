package ch01.Ex;

import java.util.Scanner;

/*
05. Scanner를 이용하여 삼각형의 변의 길이를 나타내는 정수를 3개 입력받고 
	이 3개의 수로 삼각형을 만들 수 있는지 판별하라. 
	삼각형이 되려면 두 변의 합이 다른 한 변의 합보다 커야 한다.
*/
public class Q05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("세 변을 입력하세요 >> ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		if(num1+num2 < num3 || num1+num3 < num2 || num2+num3 < num1) {
			System.out.println("삼각형이 되지 않습니다.");
		}else {
			System.out.println("삼각형이 됩니다.");			
		}
	}
}
