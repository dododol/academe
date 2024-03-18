// chap02 패키지
package chap02;

import java.util.Scanner;

// Hello 클래스
public class Hello {
	
	// sum 메소드
	public static int sum(int n, int m) {
		return n + m;
	}
	
	// main 메소드
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	//ctrl+chift+o 자동 import
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		
		int result = sum(a, b);
		System.out.println("합계 : " + result);
	}

}