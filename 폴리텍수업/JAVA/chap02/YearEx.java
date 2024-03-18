package chap02;

import java.util.Scanner;

public class YearEx {

	public static void main(String[] args) {
		
		System.out.println("년도 입력 : ");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();	//년도
		
		//1. 조건연상자로 윤년과 평년을 나누기 (윤년 result = 1, 평년 result = 0)
//		int result = (year%4 == 0 && year%100 != 0) || year%400 == 0 ? 1 : 0;
		//1. 조건연상자로 윤년과 평년을 나누기 (윤년 result = true, 평년 result = false)
		boolean result = (year%4 == 0 && year%100 != 0) || year%400 == 0 ? true : false;
		
		//2. if 문으로 윤년과 평년을 출력하기
		if(result) 		System.out.println(year + "년은 윤년!");
		else			System.out.println(year + "년은 평년!");
		
		//3. switch 문으로 월의 일수를 체크하기
//		System.out.println("월 입력 : ");
//		scan = new Scanner(System.in);
//		int month = scan.nextInt();	//월
//		int days = 0;				//일수
		
//		switch (month) {
//		case 2:								
//			if(result) 	days = 29;
//			else		days = 28;
//			break;
//		case 4: case 6: case 9: case 11:
//			days = 30; break;
//		default:
//			days = 31; break;
//		}
//		System.out.println("입력하신 " + month + "월의 일수는 " + days + "일 입니다.");


		
		//4. if - else 문으로 월의 일수를 체크하기
		System.out.println("월 입력 : ");
		scan = new Scanner(System.in);
		int month = scan.nextInt();	//월
		int days = 0;				//일수
		
		// 내 풀이
//		if(month >= 1 && month <= 12) {
//			if(month == 2) {
//				if(result==true) {
//					System.out.println("29일 입니다.");
//				}else if(result==false) {
//					System.out.println("28일 입니다.");
//				}
//			}else if(month == 4 || month == 6 ||month == 9 ||month == 11 ) {
//				System.out.println("30일 입니다.");
//			}else {
//				System.out.println("31일 입니다.");
//			}
//		}else {
//			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
//		}
		
		//교수님 풀이
		if(month==2)
			if (result) 	days = 29;
			else		 	days = 28;
		else if(month == 4 || month == 6 || month == 9 || month == 11)
			days = 30;
		else
			days = 31;
	
		System.out.println("입력하신 " + month + "월의 일수는 " + days + "일 입니다.");
	}

}




















