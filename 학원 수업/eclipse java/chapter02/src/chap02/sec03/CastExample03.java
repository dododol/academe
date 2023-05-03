package chap02.sec03;

public class CastExample03 {

	public static void main(String[] args) {
		/*  1년은 365.2422일이다. 이 자료로
		    "1년은 365일 xx시간 xx분 xx초 이다" 를 출력하도록 프로그램 하시오. 
		    */
		
		double hour;
		hour = 0.2422 * 24;
		
		System.out.println(hour);		// 1) 0.2422에 하루 24시간을 곱해서 시간을 구한다.
		
		
		double minute;
		minute = hour % 5;
		minute = minute * 60;
		
		System.out.println(minute);		// 2) 나머지를 구하는 %연산자를 이용해서 시간값을 제외한 나머지 값을 구한 후 60분을 곱하여 분값을 구한다.
		
		
		double second;
		second = minute % 48;
		second = second * 60;
		
		System.out.println(second);		// 3) 마찬가지로 나머지를 구하는 %연산자를 이용해서 분값을 제외한 나머지 값을 구한 후 60초를 곱하여 초값을 구한다.
		
		System.out.println("1년은 365일" + (int)hour + "시간" + (int)minute + "분"  + (int)second + "초 이다.");
		
		
		
		

	}
}



/* 0.2422일

1일 24시간
1시간 60분
1분 60초

5시간 48분 46초

하루 24시간
1시간이 안되는 소숫점 취해서 1시간 60분 - x60하면 분나옴 */