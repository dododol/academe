package ch01.���ǹ�;

import java.util.Scanner;

/*
06. 369������ ������ �ۼ��غ���. 1~99������ ������ �Է¹ް� ������ 3, 6, 9 �� �ϳ��� �ִ� ����
	"�ڼ�¦"�� ����ϰ� �� �� �ִ� ���� "�ڼ�¦¦"�� ����ϴ� ���α׷��� �ۼ��϶�,
	���� ���, Ű����� �Էµ� ���� 13�� ��� "�ڼ�¦"��, 36�� ��� "�ڼ�¦¦"�� ����ϸ� �ȴ�.
*/
public class Q06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		int num = scan.nextInt();
		
		if(num >= 1 && num <= 99) {
			
			int ten = num/10;
			int one = num%10;
			
			if((ten==3 || ten==6 || ten==9) && (one==3 || one==6 || one==9)) {
				System.out.println("�ڼ�¦¦");				
			}else if((ten == 3 || ten == 6 || ten == 9) || (one == 3 || one == 6 || one == 9)) {
				System.out.println("�ڼ�¦");
			}			

		}else {
			System.out.println("��Ȯ�� ���ڸ� �Է��� �ּ���.");
		}
	}
}
