package Study;

import java.util.Scanner;

public class Study01 {

	public static void main(String[] args) {
		/*
		 * 1. ���ǹ�
		 * - ���ǽ��� �ܷΰ��� ���� ��� ���� ���ΰ� ����
		 * 
		 * > ���ǹ��� �����δ� if��, switch���� �ֽ��ϴ�.
		 * > if���� ���ǽ��� ����� true/false�Ŀ� ���� ���๮�� �����˴ϴ�.
		 * > switch���� ������ ���� ���� �� case�� ���� ��ġ�ϴ� ���๮�� �����˴ϴ�.
		 */
		// ~�϶�, � ���ǿ� ���� �Ŀ� ���� ������ �������� ���ǹ� if��Ʈ�� ����������
		// �����Ѵ�!
		/*if() {
			
		}else if() {
			
		}else {
			
		}	*/
		
		// ���ǹ� if �����غ���
		// ���ǹ� ��, ���� �ܰ� ������ ¦��/Ȧ�� ����
		
		Scanner sc = new Scanner(System.in);	// �Է��� ���� Scanner ��ü ����
	
		/*
		System.out.println("���ڸ� �Է����ּ��� : ");
		// �Է¹��� ���ڿ��� ���� int�� ����ȯ ����
		int numValue = Integer.parseInt(sc.nextLine());
		String result = "";
		
		if(numValue % 2 == 0) {	// ¦��
			result = numValue + " : ¦���Դϴ�";
		}else {					// if�� �ݴ��̹Ƿ� Ȧ��
			result = numValue + " : Ȧ���Դϴ�";
		}
		
		System.out.println(result);
		*/
		// on,off�� �� �� �ִ� ���� ����ġ�� ������
		// ����1)
		// - ���ڿ� click�̶�� ������ null�� ���� �� �ʱ�ȭ ���ּ���.
		// - 1 �Ǵ� 2�� �Է� �޾Ƽ� �Է� ���� ���� ���� �Ʒ� ������ ������ּ���.
		// > click�� ���� 1�϶�, '���� ����ġ�� on�˴ϴ�'�� ������ּ���.
		// > click�� ���� 2�϶�, '���� ����ġ�� off�˴ϴ�'�� ������ּ���.

	/*	���� Ǭ ����
	 * String click = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1�� 2�� �Է����ּ���: ");
		int num = Integer.parseInt(sc.nextLine());
		
		
		
		if(num == 1) {
			System.out.println("���� ����ġ�� on�˴ϴ�.");
		}else {
			System.out.println("���� ����ġ�� off�˴ϴ�.");
		}
	}
				���� Ǭ ���� */

	
		/*
	String click = null;
	click = sc.nextLine();
//	if(click == "1") {	// �ּҺ�
//	}
	if(click.equals("1")) {	// ����
		System.out.println("���� ����ġ�� on�˴ϴ�.");
	}else if(click.equals("2")) {
		System.out.println("���� ����ġ�� off�˴ϴ�.");
	}else {
		System.out.println("���� ����ġ�� ������?");
		}
	*/
	
	/* ���� ���α׷��� ������
	 * ����2)
	 * [���� ��� ����]
	 * 90�� �̻��� A,
	 * 80�� �̻�, 90�� �̸� B
	 * 70�� �̻�, 80�� �̸� c
	 * 60�� �̻�, 70�� �̸� D
	 * 60�� �̸��� f
	 * - ������ �ܼ�â�� �Է� �ް�, ���� ��� ���ǿ� ���� ����� ������ּ���.
	 * ����� �������� �����Ӱ�!
	 */
/*	
	int num;
	num = sc.nextInt();
	
	if (num>=90) {
		System.out.println("A");
	}else if(num>=80) {
		System.out.println("B");
	}else if(num>=70) {
		System.out.println("C");
	}else if(num>=60) {
		System.out.println("D");
	}else {
		System.out.println("F");
	}
	*/

		
	//������ Ǯ��
	System.out.println("������ �Է����ּ��� : ");
	String in = sc.nextLine();
	int num1 = Integer.parseInt(in);
	String grade = "";
	if(num1 >= 90) {
		grade = "A";
	}else if(num1 >= 80 && num1 < 90) {
		grade = "B";
	}else if(num1 >= 70 && num1 < 80) {
		grade = "C";
	}else if(num1 >= 60 && num1 < 70) {
		grade = "D";
	}else {
		grade = "F";
	}
	
	
	
		
	}
}
