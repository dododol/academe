package homeWork;

import java.util.Scanner;

public class Study {
	public static void main(String[] args) {
		qustn ss = new qustn();
//		ss.method01();
//		ss.method02();
//		ss.method03();
		ss.method08();		//1,2,3,4,5
	}

}

class qustn{
	
	public void method01(){
	long var1 = 2L;
	float var2 = 1.8f;
	double var3 = 2.5;
	String var4 = "3.9";
	int result = (int)(var1 + var2 + var3 + (int)Double.parseDouble(var4));
	System.out.println(result);
	}

	public void method02() {
		String name = "���ڹ�";
		int age = 25;
		String tel1 = "010", tel2="123", tel3="4567";
		System.out.println("�̸� : " + name);
		System.out.print("���� : " + age);
		System.out.printf("\n��ȭ : " + tel1 + tel2 + tel3);
	}

	
	public void method03() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ù��° �� : ");
		String strNum1 = scanner.nextLine();
				
		System.out.print("�ι�° �� : ");
		String strNum2 = scanner.nextLine();
				
				int num1 = Integer.parseInt(strNum1);
				int num2 = Integer.parseInt(strNum2);
				int result = num1 + num2;
		System.out.println("���� ��� : " + result);
	}
	
	public void method04() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. �̸� : ");
		String str1 = sc.nextLine();
		
		System.out.println("2. �ֹι�ȣ �� 6�ڸ� : ");
		int num1 = sc.nextInt();
		
		System.out.println("3. ��ȭ��ȣ : ");
		int num2 = sc.nextInt();
		
	}
	
	public void method05() {
		int pencils = 534;
		int studentes = 30;
		
		//�л� 1���� ������ ���� ����
		int pencilsPerStudent = (pencils / studentes);
		System.out.println(pencilsPerStudent);
		
		//���� ���� ����
		 int pencilsLeft = (pencils % studentes);
		 System.out.println(pencilsLeft);
		
	}
	
	public void method06() {
		boolean stop = false;
		int a=0;
		while(!stop) {
			a++;
			System.out.println(stop);
			if (a==10) {
				stop = true;
			}
		}
	}
	
	public void method07() {
		int var1 =5;
		int var2 = 2;
		double var3 = var1 / var2;
		int var4 = (int) (var3 * var2);
		System.out.println(var4);
	}
	
	public void method0() {
		float var1 = 10f;
		float var2 = var1 / 100;
		if(var2 ==0.1) {
			System.out.println("10%�Դϴ�.");
		} else {
			System.out.println("10%�� �ƴմϴ�.");
		}
	}
	
	public void method080() {
		int t =5;
		int b= 10;
		int h = 7;
		double area = (double)(t+b)*h/2;
		System.out.println(area);
	}
	
	public void method08() {
		Scanner sc = new Scanner(System.in);
		
			System.out.print("ù ��° �� : ");
			double num = Double.parseDouble(sc.nextLine());
			
			System.out.print("�� ���� �� : ");
			double num2 = Double.parseDouble(sc.nextLine());
			
			System.out.print("---------------");
			
			double i = 0;
			i = num/num2;
			b = 
			if(num/num2 != 0) {
				System.out.println("\n��� : " + i);
			} else if {
				System.out.println("\n��� : " + )
			}
			
		
		
	}
}

