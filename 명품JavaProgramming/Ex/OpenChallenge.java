package ch01.Ex;

import java.util.Scanner;

/*
가위바위보 게임
*/
public class OpenChallenge {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		System.out.print("철수 >> ");
		String user1 = scan.nextLine();
		System.out.print("영희 >> ");
		String user2 = scan.nextLine();
		
//		if(user1.equals("가위")) {
//			if(user2.equals("가위")) {
//				System.out.println("비겼습니다.");
//			}else if(user2.equals("바위")) {
//				System.out.println("철수가 졌습니다.");
//			}else if(user2.equals("보")) {
//				System.out.println("철수가 이겼습니다.");
//			}else {
//				System.out.println("잘못입력하셨습니다");
//			}
//		}else if(user1.equals("바위")) {
//			if(user2.equals("가위")) {
//				System.out.println("철수가 이겼습니다.");
//			}else if(user2.equals("바위")) {
//				System.out.println("비겼습니다.");
//			}else if(user2.equals("보")) {
//				System.out.println("철수가 졌습니다.");
//			}else {
//				System.out.println("잘못입력하셨습니다");
//			}
//		}else if(user1.equals("보")) {
//			if(user2.equals("가위")) {
//				System.out.println("철수가 졌습니다.");
//			}else if(user2.equals("바위")) {
//				System.out.println("철수가 이겼습니다.");
//			}else if(user2.equals("보")) {
//				System.out.println("비겼습니다.");
//			}else {
//				System.out.println("잘못입력하셨습니다");
//			}
//		}
		
		switch (user1) {
		case "가위":
			switch (user2) {
			case "가위":
				System.out.println("비겼습니다.");				
				break;
			case "바위":
				System.out.println("철수가 졌습니다.");
				break;
			case "보":
				System.out.println("철수가 이겼습니다.");
				break;
			}
		break;
		
		case "바위":
			switch (user2) {
			case "가위":
				System.out.println("철수가 이겼습니다.");				
				break;
			case "바위":
				System.out.println("비겼습니다.");
				break;
			case "보":
				System.out.println("철수가 졌습니다.");
				break;
			}
		break;

		case "보":
			switch (user2) {
			case "가위":
				System.out.println("철수가 졌습니다.");				
				break;
			case "바위":
				System.out.println("철수가 이겼습니다.");
				break;
			case "보":
				System.out.println("비겼습니다.");
				break;
			}
		break;
		
		}
		
		
		
		
		
	}
}
