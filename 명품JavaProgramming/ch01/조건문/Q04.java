package ch01.���ǹ�;

import java.util.Scanner;

/*
04. Scanner Ŭ������ ���� 3���� �Է¹ް� 3���� ���� �� �߰� ũ���� ���� ����϶�.
	��հ��� ���ϴ� ���� �ƴԿ� �����϶�.
*/
public class Q04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� 3���� �Է��Ͻÿ�>>");
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
		System.out.println("�߰� ���� " + middleNum);
	}
}
