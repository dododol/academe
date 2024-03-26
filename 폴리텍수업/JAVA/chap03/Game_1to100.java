package chap03;

import java.util.Scanner;

/*
 * 1 to 100 게임 : 컴퓨터는 1~100 랜덤한 수를 생성하고, 사용자가 이를 맞추는 게임
 */
public class Game_1to100 {

	public static void main(String[] args) {
		int com = 1 + (int) (Math.random() * 100);	//1~100 사이의 랜덤한 수
		
		Scanner scan = new Scanner(System.in);
//		int count = 1;			// 반복문을 10회 쓴 변수
		int try_count = 0;		// 시도횟수 초기화
		boolean state = false;	// 성공을 체크하기 위한 상태변수, 초기값 : false
		int user = 0;
		
		while(true)
		{
			if(try_count >= 5) break;	// 실패후 탈출
			//1회성의 if 코드
			System.out.print(" 사용자 값 입력 (1~100) : ");
			user = scan.nextInt();
			if(user==com) {
				state = true;			// state 를 성공으로 체크(true)
				break; 					// 성공후 탈출
			} 	
			else if(user > com) { System.out.println("Down!" );	} 
			else if(user < com) { System.out.println("Up!");	}
			
			try_count++;	// 1회 돌림. 1씩 증가
//			count++;
		}
		
		if(state == true) 	{ System.out.println("성공 ! user : " + user + " com : " + com); }
		else 				{ System.out.println("실패 ! user : " + user + " com : " + com); }
		
		scan.close();
		
	}

}





















