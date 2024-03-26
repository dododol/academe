package chap03;

import java.util.Random;
import java.util.Scanner;

public class Game_1to100_2 {
	
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        Random r = new Random();

	        while(true) {
	            int num = r.nextInt(100);
	            System.out.println("수를 결정하였습니다. 맞추어보세요!");
	            int count = 1, min = 0, max = 99;
	            String str = "";

	        while(true) {
	            System.out.println(min+"-"+max);
	            System.out.print(count+">>");
	            int user = scan.nextInt();

	            if(user>num) {
	                System.out.println("더 낮게");
	                max=user;
	            } else if(user<num) {
	                System.out.println("더 높게");
	                min=user;
	            } else {
	                System.out.println("정답입니다!");
	                break;
	            }
	            count++;
	        }
	        System.out.print("다시하시겠습니까?(y/n)>>");
	        str = scan.next();

	        if(str.equals("y")) continue;
	        else break;
	        }
	        System.out.println("프로그램을 종료하겠습니다.");
	    }
	}

