package ch01.���ǹ�;

import java.util.Scanner;

/*
02. Scanner Ŭ������ �̿��Ͽ� 2�ڸ��� ����(10~99����)�� �Է¹ް�, 
	���� �ڸ��� 1�� �ڸ��� ������ �Ǻ��Ͽ� ����ϴ� ���α׷��� �ۼ��϶�.
*/
public class Q02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("2�ڸ��� ���� �Է�(10 ~99)>>");
		int num = scan.nextInt();
		
		if(num>=10 && num <= 99) {
		
			if(num/10 == num%10) {
				System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
			}else {
				System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� ���� �ʽ��ϴ�.");
			}
		
		}else {
			System.out.println("��Ȯ�� ���� �Է��� �ּ���.");
		}
	}
}
