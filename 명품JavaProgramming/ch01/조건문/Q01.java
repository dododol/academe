package ch01.���ǹ�;

import java.util.Scanner;

/*
01. Scanner Ŭ������ �̿��Ͽ� ��ȭ�� �Է¹޾� �޷��� �ٲپ� 
	���� ���ÿ� ���� ����ϴ� ���α׷��� �ۼ��϶�. $1=1100������ �����ϰ� ����϶�.
*/
public class Q01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("��ȭ�� �Է��ϼ���(���� ��)>>");
		int won = scan.nextInt();
		double doller = won/1100;
		
		System.out.println(won + "���� $" + doller + "�Դϴ�.");
	}
}
