package chap04.sec02;

public class ForStatementExample03 {
	public static void main(String[] args) {
		ForStatement03 aa = new ForStatement03();

		System.out.println("[1번도형]");
		aa.shape01();
		System.out.println("[2번도형]");
		aa.shape02();
		System.out.println("[3번도형]");
		aa.shape03();
		System.out.println("[4번도형]");
		aa.shape04();
		
	}

}

class ForStatement03{
	
	public void shape01() {
		for(int i=0; i<5; i++) {		// 행을 담당
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void shape02() {
		for(int i=0; i<5; i++) {			// 행을 담당
			for(int j=0; j<i; j++) {		// 공백출력
				System.out.print(" ");
			}
			for(int j=0; j<(5-i); j++) {	//"*"출력
				System.out.print("*");
			}
			System.out.println();
		}
		
	
	}
	
	public void shape03() {
		for(int i=0; i<5; i++) {		// 행을 담당
			for(int j=0; j<(5-i); j++) {		// 공백출력
				System.out.print(" ");
			}
			for(int j=0; j<(i*2)+1; j++) {	//"*"출력
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void shape04() {
		for(int i=0; i<=5; i++) {			// 행을 담당
			for(int j=0; j<=i; j++) {		// 공백출력
				System.out.print("*");
			}
			for(int j=0; j<(5-i); j++) {	//"*"출력
				System.out.print(" ");
			}
			System.out.println();
		}
		
	
	}
	
}




/*
	[예제8] 다음의 도형을 출력하는 프로그램 작성
		1)			2)			3)			4)			5)
	 *			*****			*				*		*****
	 **		 	****		   ***			   **		****
	 ***		  ***		  *****			  ***		***
	 ****		   **		 *******		 ****		**
	 *****			*		*********		*****		*
	
*/