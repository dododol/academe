package ch01.���ǹ�;

import java.util.Scanner;

/*
���������� ����
*/
public class OpenChallnge {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���������� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���");
		System.out.print("ö�� >> ");
		String user1 = scan.nextLine();
		System.out.print("���� >> ");
		String user2 = scan.nextLine();
		
		if(user1.equals("����")) {
			if(user2.equals("����")) {
				System.out.println("�����ϴ�.");
			} else if(user2.equals("����")) {
				System.out.println("ö���� �����ϴ�.");
			} else if(user2.equals("��")) {
				System.out.println("ö���� �̰���ϴ�.");
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		} else if(user1.equals("����")) {
			if(user2.equals("����")) {
				System.out.println("ö���� �̰���ϴ�.");
			} else if(user2.equals("����")) {
				System.out.println("�����ϴ�.");
			} else if(user2.equals("��")) {
				System.out.println("ö���� �����ϴ�.");
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		} else if(user1.equals("��")) {
			if(user2.equals("����")) {
				System.out.println("ö���� �����ϴ�.");
			} else if(user2.equals("����")) {
				System.out.println("ö���� �̰���ϴ�.");
			} else if(user2.equals("��")) {
				System.out.println("�����ϴ�.");
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
			
	}
}
