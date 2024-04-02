package chap03;

import java.util.Scanner;

public class RPS_Game {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

        String game[] = {"가위", "바위", "보"};
        String user = "";

        System.out.println("컴퓨터와 가위바위보 게임을 합니다.");

        while(true) {
            int com = (int)(Math.random()*3);
            System.out.print("가위 바위 보!>>");
            user = scan.next();

            if(user.equals("그만")) {
                System.out.println("게임을 종료합니다...");
                break;
            }
            System.out.print("사용자 = " + user + ", 컴퓨터 = " + game[com] + ", ");

            switch (game[com]) {
            case "가위":
                if(user.equals("가위")) {
                    System.out.println("비겼습니다.");
                } else if(user.equals("바위")) {
                    System.out.println("사용자가 이겼습니다.");
                } else {
                    System.out.println("컴퓨터가 이겼습니다.");
                }
                break;
            case "바위":
                if(user.equals("가위")) {
                    System.out.println("컴퓨터가 이겼습니다.");
                } else if(user.equals("바위")) {
                    System.out.println("비겼습니다.");
                } else {
                    System.out.println("사용자가 이겼습니다.");
                }
                break;
            case "보":
                if(user.equals("가위")) {
                    System.out.println("사용자가 이겼습니다.");
                } else if(user.equals("바위")) {
                    System.out.println("컴퓨터가 이겼습니다.");
                } else {
                    System.out.println("비겼습니다.");
                }
                break;
            }
        }
    }
}

