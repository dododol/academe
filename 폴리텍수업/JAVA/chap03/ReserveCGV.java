// For future : 이 좌석시스템을 2차원 시스템으로 변경시켜보자!

package chap03;

import java.util.Scanner;

public class ReserveCGV {

	public static void main(String[] args) {
		
		//1. 배열에 10좌석 준비
		int seats[] = new int[10];	//배열에 10좌석 준비
		int selected_num[] = new int[10];
		
		//2. 배열에 빈좌석으로 0으로 초기화
		for(int i=0; i<seats.length; i++)
			seats[i] = 0;
		
		//3. 배열의 상태를 출력하는 메소드 호출
		print_array(seats);
		
		//4. 좌석 예약을 위한 반복문
		Scanner scan = new Scanner(System.in);	//사용자에게 입력을 위한 객체 준비
		int count = 0;
		while(true) {
			//4.1 사용자에게 좌석번호를 입력받는다.
			System.out.println("예약할 좌석번호 : ");
			int seat_num = scan.nextInt();
			seats[seat_num-1] = 1;
			//입력된 좌석 값을 selected_num 배열에 넣습니다.
			selected_num[count++] = seat_num;
			
			//4.2 현재 좌석 상태를 출력합니다.
			print_array(seats);
			//4.3 계속할 것인지 y/n 중에서 묻는다.
			System.out.print("계속 예약하실 건가요? (y/n) : ");
			if(scan.next().equals("n")) break;
		}

		//5. 종료시에 출력될 메시지나 내용을 넣어줍니다.
		System.out.println("좌석예약을 종료합니다.");
		System.out.println("예약한 좌석을 확인해주세요.");
		
		//6. 예약된 좌석 출력
		print_array(seats);
		
		//7. 예약된 좌석번호 출력
		for(int n : selected_num)
			if(n!=0) System.out.printf("%5d", n);
		System.out.println();
	}
	
	private static void print_array(int[] seats) {
		for(int n : seats) {
			if(n==0)	System.out.print("□");
			else		System.out.print("■");
		}
		System.out.println();
	}

}
