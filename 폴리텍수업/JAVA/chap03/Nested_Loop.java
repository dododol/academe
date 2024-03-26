package chap03;

public class Nested_Loop {

	public static void main(String[] args) {
		// 1. 5x5 별찍기
		for(int row=1; row<=5; row++) {
			for(int col=1; col<=5; col++) {
				System.out.print("*");			
			}
			System.out.println();
		}
		
		System.out.println("========================================");
		
		// 2. 삼각형 별 찍기
		for(int row=1; row<=5; row++) {
			for(int col=1; col<=row; col++) {
				System.out.print("*");			
			}
			System.out.println();
		}
		
		System.out.println("========================================");

		// 3. 역삼각형 별 찍기
		for(int row=1; row<=5; row++) {
			for(int col=1; col<=6-row; col++) {
				System.out.print("*");			
			}
			System.out.println();
		}
		
		System.out.println("========================================");
		
		// 4. 오른쪽 삼각형 별 찍기
		for(int row=1; row<=5; row++) {
			for(int col=1; col<=5-row; col++) {
				System.out.print(" ");			
			}
			for(int col=1; col<=row; col++) {
				System.out.print("*");			
			}
			System.out.println();
		}
		
		System.out.println("========================================");
		
		
		// 5. 피라미드 삼각형 별 찍기
		for(int row=1; row<=5; row++) {
			for(int col=1; col<=5-row; col++) {
				System.out.print(" ");			
			}
			for(int col=1; col<=(row*2)-1; col++) {
				System.out.print("*");			
			}
			System.out.println();
		}
		
		System.out.println("========================================");
		
		// 1~9 단까지 구구단 출력
		for(int row=2; row<=9; row++) {	// 각 단
			for(int col=1; col<=9; col++) {
				System.out.println(row + " * " + col + " = " + (row*col) + "\t");			
			}
			System.out.println();
		}
		
		System.out.println("========================================");
		
		
	}

}
