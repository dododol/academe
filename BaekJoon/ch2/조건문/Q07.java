package ch2.���ǹ�;

import java.util.Scanner;

/*
07. 1�������� 6������ ���� ���� 3���� �ֻ����� ������ ������ ���� ��Ģ�� ���� ����� �޴� ������ �ִ�.

	���� ���� 3���� ������ 10,000��+(���� ��)��1,000���� ����� �ް� �ȴ�.
	���� ���� 2���� ������ ��쿡�� 1,000��+(���� ��)��100���� ����� �ް� �ȴ�.
	��� �ٸ� ���� ������ ��쿡�� (�� �� ���� ū ��)��100���� ����� �ް� �ȴ�.
	���� ���, 3���� �� 3, 3, 6�� �־����� ����� 1,000+3��100���� ���Ǿ� 1,300���� �ް� �ȴ�. �� 3���� ���� 2, 2, 2�� �־����� 10,000+2��1,000 ���� ���Ǿ� 12,000���� �ް� �ȴ�. 3���� ���� 6, 2, 5�� �־����� ���� ���� ū ���� 6�̹Ƿ� 6��100���� ���Ǿ� 600���� ������� �ް� �ȴ�.
	
	3�� �ֻ����� ���� ���� �־��� ��, ����� ����ϴ� ���α׷��� �ۼ� �Ͻÿ�.
*/
public class Q07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dice1 = scan.nextInt();
		int dice2 = scan.nextInt();
		int dice3 = scan.nextInt();
		
		int maxDice = Math.max(Math.max(dice1, dice2), dice3);
		
		if (dice1 == dice2 && dice1 == dice3) {
			System.out.println(10000+dice1 * 1000);
		} else if (dice1 == dice2 || dice1 == dice3) {
			System.out.println(1000+dice1 * 100);
		} else if (dice2 == dice3) {
			System.out.println(1000+dice2 * 100);
		} else {
			System.out.println(maxDice * 100);
		}
	}
}
