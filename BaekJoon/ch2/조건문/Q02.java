package ch2.���ǹ�;

import java.util.Scanner;

/*
02. ���� ������ �Է¹޾� 90 ~ 100���� A, 80 ~ 89���� B, 70 ~ 79���� C, 60 ~ 69���� D, ������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
