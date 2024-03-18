package chap02;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		
//		System.out.println("2자리수 정수 입력(10~99) >>");
		Scanner scan = new Scanner(System.in);
		
//		int num = scan.nextInt();
//		
//		if(num >= 10 && 10 <=99) {
//			if(num/10 == num%10) {
//				System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
//			}else {
//				System.out.println("Yes! 10의 자리와 1의 자리가 같지 않습니다.");
//			}
//		}else {
//			System.out.println("다시 입력하세요");
//		}
//	
//		scan.close();
	
//---------------------------------------------------------------------------------
		
//		System.out.println("금액을 입력하시오 >> ");
//		scan = new Scanner(System.in);
//		
//		int money = scan.nextInt();
//		
//		if(money!=0) {
//			System.out.println("오만원권 " + money/50000 + "매");
//		}
//		money%=50000;
//		if(money!=0){
//			System.out.println("만원권 " + money/10000 + "매");
//		}
//		money%=10000;
//		if(money!=0){
//			System.out.println("천원권 " + money/1000 + "매");
//		}
//		money%=1000;
//		if(money!=0){
//			System.out.println("백원 " + money/100 + "매");
//		}
//		money%=100;
//		if(money!=0){
//			System.out.println("오십원 " + money/50 + "매");
//		}
//		money%=50;
//		if(money!=0){
//			System.out.println("십원 " + money/10 + "매");
//		}
//		money%=10;
//		if(money!=0){
//			System.out.println("일원 " + money/1 + "매");
//		}
//		money%=1;
		
		scan = new Scanner(System.in);
		
		System.out.println("1~99 사이의 정수를 입력하시오 >> ");
		int num = scan.nextInt();

		int ten = num/10;
		int one = num%10;
		
		if(num >= 1 && num <= 99) {
			if((ten==3 || ten==6 || ten== 9) && (one==3 || one==6 || one==9)) {
				System.out.println("박수짝짝");
			}else if((ten==3 || ten==6 || ten==9) || (one==3 || one==6 || one==9)) {
				System.out.println("박수짝");
			}
		}
		
		
	}

}
