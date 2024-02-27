package ch01.조건문;

import java.util.Scanner;

/*
06. 369게임을 간단히 작성해보자. 1~99까지의 정수를 입력받고 정수에 3, 6, 9 중 하나가 있는 경우는
	"박수짝"을 출력하고 두 개 있는 경우는 "박수짝짝"을 출력하는 프로그램을 작성하라,
	예를 들면, 키보드로 입력된 수가 13인 경우 "박수짝"을, 36인 경우 "박수짝짝"을 출력하면 된다.
*/
public class Q06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		int num = scan.nextInt();
		
		if(num >= 1 && num <= 99) {
			
			int ten = num/10;
			int one = num%10;
			
			if((ten==3 || ten==6 || ten==9) && (one==3 || one==6 || one==9)) {
				System.out.println("박수짝짝");				
			}else if((ten == 3 || ten == 6 || ten == 9) || (one == 3 || one == 6 || one == 9)) {
				System.out.println("박수짝");
			}			

		}else {
			System.out.println("정확한 숫자를 입력해 주세요.");
		}
	}
}
