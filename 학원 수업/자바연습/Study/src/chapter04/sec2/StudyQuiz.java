package chapter04.sec2;

import java.util.Scanner;

public class StudyQuiz {

	public static void main(String[] args) {
	
	Study1 ss = new Study1();	
	ss.method6();

	}

}

class Study1 {
	
	public void method5() {
		
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				if(j==i) {
					System.out.println(" ");
				}
			}
		}
	}


	public void method6() {
		
		boolean run = true;
		int balance = 0;
		Scanner ss = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------------");
			System.out.print("선택> " );
			
			int num = Integer.parseInt(ss.nextLine());
			
			switch(num) {
				
			case 1 :
				System.out.println("예금액>10000\n");
				 continue;

			case 2 :
				System.out.println("출금액>2000\n");
				continue;
			
			case 3 :
				System.out.println("잔고>8000\n");
				continue;
				
			}
			if (num == 4) {
				System.out.println("\n프로그램종료");
				break;
			}
			
			
		
			}
			
		
		}
	

	}
