package ch01.���ǹ�;

import java.util.Scanner;

/*
07. 2���� ��鿡�� ���簢���� ���� ��� �𼭸��� ������ �ϴ� �𼭸��� �� ������ ǥ���Ѵ�. (100, 100)�� (200,200)�� �� ������ �̷����
	�簢���� ���� ��, Scanner�� �̿��Ͽ� ���� x�� y ���� �Է¹ް� �� (x, y)�� �� ���簢�� �ȿ� �ִ����� �Ǻ��ϴ� ���α׷��� �ۼ��϶�.
*/
public class Q07 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("�� (x,y)�� ��ǥ�� �Է��Ͻÿ�>>");
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		if((100 <= x && 200 >= x) && (100 <= y && 200 >= y)) {
			System.out.println("(" + x + "," + y + ")�� �簢�� �ȿ� �ֽ��ϴ�.");
		} else {
			System.out.println("(" + x + "," + y + ")�� �簢�� �ȿ� ���� �ʽ��ϴ�.");
		}
	}
}
