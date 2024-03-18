package chap02;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		/*
		 * 커피 주문에 따라 가격 출력하는 프로그램
		 * 아메리카노 : 5000, 카푸치노 : 7000, 카페라떼 : 8000, 그외 : 0
		 */
		System.out.println("커피종류(아메리카노, 카푸치노, 카페라떼) : ");
		Scanner scan = new Scanner(System.in);
		
		String order = scan.next();
		int price = 0;
		
		switch (order) {
		case "아메리카노" :						price = 5000; break;
		case "카푸치노" : case "카페라떼" 	:	price = 7000; break;			
		default :							price = 0;
		}
		System.out.println("커피가격 : " + price);

		
//		switch (order) {
//		case "아메리카노" :	
//			price = 5000;
//			break;
//		case "카푸치노" :
//			price = 7000;
//			break;
//		case "카페라떼" :	
//			price = 8000;
//			break;
//			
//		default :
//			price = 0;
//		}
//		System.out.println("커피가격 : " + price);
		
	}

}
