package chap02;

//연산자 실습
public class Operator {

	//산술연산자 : + - * / %
	public static void arithmetic() {
		final int time = 482;
		int min = time/60;
		int sec = time%60;
		System.out.println(min + "분" + sec + "초");
	}
	
	//증감, 대입연산자
	public static void increment() {
		int a = 10, b = 20, c = 30;
		c = --a - --b;
		System.out.println("c : " + c);
	}
	
	//논리, 비교연산자
	public static void logical() {
		//비교연산자
		int a = 10, b = 20;
		boolean result;
		result = a==b;
		result = a!=b;
		System.out.println("result : " + result);
		
		//논리연산자
		boolean b1 = true;
		boolean b2 = false;
		boolean result1;
		result1 = b1 && b2;
		System.out.println("result1 : " + result1);
	}
	
	//조건연산자
	public static void ternary() {
		int a = 10, b = 20;
		int max;
		max = a>b ? a : b;
		System.out.println("큰값 : " + max);
	}
	
	//비트연산자( 왼쪽으로는 두배, 오른쪽으로는 반절) 
	public static void bitop() {
		int a = 10, b = 20;
		int result = a << 1;
		System.out.println(result);
	}

	public static void main(String[] args) {
//		arithmetic();
//		increment();
//		logical();
//		ternary();
		bitop();
	}

}
