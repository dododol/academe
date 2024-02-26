package ch2.조건문;

import java.util.Scanner;

/*
02. 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
*/
public class Q02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
//		if (100 >= score && score >= 90) {
//			System.out.println("A");
//		} else if(score >= 80) {
//			System.out.println("B");
//		} else if(score >= 70) {
//			System.out.println("C");
//		} else if(score >= 60) {
//			System.out.println("D");
//		} else {
//			System.out.println("F");
//		}
		
		switch (score/10) {
		case 10: case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;

		default:
			System.out.println("F");
		}
	
	}
}
