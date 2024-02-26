package ch01.조건문;

import java.util.Scanner;

/*
09. 원의 중심을 나타내는 한 점과 반지름을 실수 값으로 입력받아라. 그리고 실수 값으로 다른 점 (x,y)를 
	입력받아 이 점이 원의 내부에 있는지 판별하여 출력하라.
*/
public class Q09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("원의 중심과 반지름 입력>>");
		double p1 = scan.nextDouble();
		double p2 = scan.nextDouble();
		double radius = scan.nextDouble();
		
		System.out.print("점 입력>>");
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		
		double distance=Math.sqrt((x-p1)*(x-p1)+(y-p2)*(y-p2));
		if(distance<radius)
		System.out.println("점 (" + x + "," + y + ")는 " + "원 안에 있다.");
		else
		System.out.println("점 (" + x + "," + y + ")는 " + "원 밖에 있다.");
		scan.close();
	}

}
