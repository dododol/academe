package homeWork;

import java.util.Scanner;

public class Study {
	public static void main(String[] args) {
		qustn ss = new qustn();
//		ss.method01();
//		ss.method02();
//		ss.method03();
		ss.method09();		//1,2,3,4,5
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
		String name = "감자바";
		int age = 25;
		String tel1 = "010", tel2="123", tel3="4567";
		System.out.println("이름 : " + name);
		System.out.print("나이 : " + age);
		System.out.printf("\n전화 : " + tel1 + tel2 + tel3);
	}

	
	public void method03() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 수 : ");
		String strNum1 = scanner.nextLine();
				
		System.out.print("두번째 수 : ");
		String strNum2 = scanner.nextLine();
				
				int num1 = Integer.parseInt(strNum1);
				int num2 = Integer.parseInt(strNum2);
				int result = num1 + num2;
		System.out.println("덧셈 결과 : " + result);
	}
	
	public void method04() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 이름 : ");
		String str1 = sc.nextLine();
		
		System.out.println("2. 주민번호 앞 6자리 : ");
		int num1 = sc.nextInt();
		
		System.out.println("3. 전화번호 : ");
		int num2 = sc.nextInt();
		
	}
	
	public void method05() {
		int pencils = 534;
		int studentes = 30;
		
		//학생 1명이 가지는 연필 개수
		int pencilsPerStudent = (pencils / studentes);
		System.out.println(pencilsPerStudent);
		
		//남은 연필 개수
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
			System.out.println("10%입니다.");
		} else {
			System.out.println("10%가 아닙니다.");
		}
	}
	
	public void method080() {
		int t =5;
		int b= 10;
		int h = 7;
		double area = (double)(t+b)*h/2;
		System.out.println(area);
	}
	
	public void method081() {
		Scanner sc = new Scanner(System.in);
		
			System.out.print("첫 번째 수 : ");
			double num = Double.parseDouble(sc.nextLine());
			
			System.out.print("두 번재 수 : ");
			double num2 = Double.parseDouble(sc.nextLine());
			
			System.out.print("---------------");
			
			
			if(num2 != 0) {
				System.out.println("\n결과 : " + (num/num2));
			} else {
				System.out.println("\n결과 : 무한대");
			}
			
			
	}
	
	public void method082() {
		Scanner ss = new Scanner(System.in);
		
		System.out.print("첫 번째 수 : ");
		double num = Double.parseDouble(ss.nextLine());
		
		System.out.print("두 번째 수 : ");
		double num2 = Double.parseDouble(ss.nextLine());
		
		System.out.println("==========================");
		
		double i = num/num2;
		
		if (num2 != 0) {
			System.out.print("결과 : " + i);
		} else {
			System.out.print("결과 : 무한대");
		}
		
	}
	public void method0823() {
		int var1 = 10;
		int var2 = 3;
		int var3 = 14;
		double var4 = var1 * var1 * Double.parseDouble(var2 + "." + var3);
		System.out.println("원의 넓이 : " + var4);
	}

	public void method085() {
		Scanner ss = new Scanner(System.in);
		
		System.out.print("아이디 : ");;
		String name = ss.nextLine();
		
		System.out.print("패스워드: " );;
		String strPassword = ss.nextLine();
		int password = Integer.parseInt(strPassword);
		
		if(name.equals("java")) {
			if(password == 12345) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패 : 패스워드가 틀림 ");
			}
		} else {
			System.out.println("로그인 실패 : 아이디 존재하지 않음 ");
		
		}
	}

	public void method091() {
		
		int num = (int) (Math.random()*6) + 1;
		
		if (num == 1) {
			System.out.println("1번이 나왔습니다.");
		} else if (num == 2) {
			System.out.println("2번이 나왔습니다.");
		} else if (num == 3) {
			System.out.println("3번이 나왔습니다.");
		} else if (num == 4) {
			System.out.println("4번이 나왔습니다.");
		} else if (num == 5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		} 
	}
	
	public void method0913() {
		
		int num = (int) (Math.random()*6) + 1;
		
	switch(num) {	
		case 1 :
			System.out.println("1이 나왔습니다.");
			break;
		case 2 :
			System.out.println("2가 나왔습니다.");
			break;
		case 3 :
			System.out.println("3이 나왔습니다.");
			break;
		case 4 :
			System.out.println("4가 나왔습니다.");
			break;
		case 5 :
			System.out.println("5가 나왔습니다.");
			break;
		case 6 :
			System.out.println("6이 나왔습니다.");
			break;
		}
	}

	public void method039() {
		int time = (int) (Math.random() * 4) + 8;
		System.out.println("[현재시각: " + time + " 시]");
		
		switch(time) {
		case 8:
			System.out.println("출근합니다.");	
		case 9:
			System.out.println("회의를 합니다.");
		case 10:
			System.out.println("업무를 합니다.");
		default:
			System.out.println("외근합니다.");
			
		}
	}
	
	public void method0933() {
		char grade = 'A';
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("우수 회원입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다.");
			break;
			default:
				System.out.println("손님입니다.");
		}
	}
	
	public void method09() {

		int sum = 0;
		
			for(int i = 1; i<=100; i++) {
				sum = sum + i;
		}
			
			System.out.println("1~100 합 : " + sum);
	}
}
