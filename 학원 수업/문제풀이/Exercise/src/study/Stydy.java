package study;

public class Stydy {

	public static void main(String[] args) {
	
		Study1 ss = new Study1();
		ss.method1();
		
	}
}

class Study1 {

	void method1(){
//	. 주어진 섭씨 온도를 화씨 온도로 바꾸는 프로그램을 작성
//	하라. 주어진 섭씨 온도는 15도 이다. (힌트: 섭씨 온도 C를
//	화씨 온도 F로 바꾸어 주는 공식은 F=9/5*C+32 이다.)
//	 실행화면
//	섭씨 온도 = 15.0
//	화씨 온도 = 59.0
	
		double a, b;
	
		a = 15.0;
		b = 9.0/5.0*a+32.0;
	
		System.out.println("섭씨온도 = " + a);
		System.out.println("화씨온도 = " + b);
	}

	void method2() {
		
		
	}
}