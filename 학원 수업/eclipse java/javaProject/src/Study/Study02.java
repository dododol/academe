package Study;

import java.util.Scanner;

public class Study02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ���ǹ� switch �����غ���
		// ���ǹ� ��, ���� �ܰ��� ¦��/Ȧ�� ���ϱ�
/*		System.out.println("���ڸ� �Է����ּ��� : ");
		String input = sc.nextLine();
		
		switch (Integer.parseInt(input) % 2) {	// ��ȣ �ȿ��� ������ �� ����, ��� ���ǽ��� ���� �ɼ��� ����. ���� ����� ���� ����ϸ� 0�� 1 �ΰ����� ����
		case 0:		// case �ڿ��� ���� ����
			System.out.println(input + ":¦��");
			break;	// ���⿡ break�� ������ case1�� �����.
			
		case 1:
			System.out.println(input + ":Ȧ��");
			break;
			
		default:
			System.out.println("���� ������?");
			break;
		}

	*/

	/* ���������� ������ ������
	 * ����1)
	 * A����� B����� ���������� ������ �մϴ�.
	 * A����� �� ���������� B ����� �� ������������ ���� ����� ������ּ���.
	 * - ���� ����� �������� ����� ����غ��ô�
	 * > ���� ����, ���� ����, �� �� : �����ϴ�.
	 * > ���� ����, ���� ��, �� ���� : �����ϴ�.
	 * > ���� ����, �� ����, ���� �� : �̰���ϴ�.
	 * switch case���� �̿��ؼ�...!
	 */
	
		
		
	
	System.out.println("A��� :");
	String strA = sc.nextLine();
	
	System.out.println("B��� :");
	String strB = sc.nextLine();

	switch (strA) {
	case "����" :
		
		switch (strB) {
		case "����" :
			System.out.println("�����ϴ�.");
			break;
		case "����" :
			System.out.println("�����ϴ�.");
			break;
		case "��" :
			System.out.println("�̰���ϴ�.");
			break;
		default:
			System.out.println("���B�� ������ �� �½��ϴ�");
			break;
		}
		
		break;
	case "����":
		
		switch (strB) {
		case "����" :
			System.out.println("�̰���ϴ�.");
			break;
		case "����" :
			System.out.println("�����ϴ�.");
			break;
		case "��" :
			System.out.println("�����ϴ�.");
			break;
		default:
			System.out.println("���B�� ������ �� �½��ϴ�");
			break;
		}
		
		break;
	case "��":
		
		switch (strB) {
		case "����" :
			System.out.println("�����ϴ�.");
			break;
		case "����" :
			System.out.println("�̰���ϴ�.");
			break;
		case "��" :
			System.out.println("�����ϴ�.");
			break;
		default:
			System.out.println("���B�� ������ �� �½��ϴ�");
			break;
		}
		
		break;
		default:
			System.out.println("���A�� ������ �� �½��ϴ�.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	}
	
	
}
