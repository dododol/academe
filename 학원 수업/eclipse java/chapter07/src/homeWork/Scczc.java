package homeWork;

import java.util.Scanner;

public class Scczc {

	public static void main(String[] args) {
		Study1 ss = new Study1();	
		ss.method7();

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
			Scanner ss = new Scanner(System.in);
			
			while(run) {
				System.out.println("----------------------------------");
				System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
				System.out.println("----------------------------------");
				System.out.print("����> " );
				
				int num = Integer.parseInt(ss.nextLine());
				
				switch(num) {
					
				case 1 :
					System.out.println("���ݾ�>10000\n");
					 continue;

				case 2 :
					System.out.println("��ݾ�>2000\n");
					continue;
				
				case 3 :
					System.out.println("�ܰ�>8000\n");
					continue;
					
				case 4 : 
					System.out.println("\n���α׷�����");
					
					run = false; 
					break;	
				
				
				}
				
				
				
				}
				
			
			}
		

		public void method7() {
			
			for(int x = 1; x <= 10; x++) {
				for(int y = 1; y<=10; y++) {
					if((4 * x + 5 * y) == 60) {
						System.out.println("(" + x + "," + y + ")");
					}
				}
			}
		}
		
}
