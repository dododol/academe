package ch01.���ǹ�;

import java.util.Scanner;

/*
09. ���� �߽��� ��Ÿ���� �� ���� �������� �Ǽ� ������ �Է¹޾ƶ�. �׸��� �Ǽ� ������ �ٸ� �� (x,y)�� 
	�Է¹޾� �� ���� ���� ���ο� �ִ��� �Ǻ��Ͽ� ����϶�.
*/
public class Q09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �߽ɰ� ������ �Է�>>");
		double p1 = scan.nextDouble();
		double p2 = scan.nextDouble();
		double radius = scan.nextDouble();
		
		System.out.print("�� �Է�>>");
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		
		double distance=Math.sqrt((x-p1)*(x-p1)+(y-p2)*(y-p2));
		if(distance<radius)
		System.out.println("�� (" + x + "," + y + ")�� " + "�� �ȿ� �ִ�.");
		else
		System.out.println("�� (" + x + "," + y + ")�� " + "�� �ۿ� �ִ�.");
		scan.close();
	}

}
