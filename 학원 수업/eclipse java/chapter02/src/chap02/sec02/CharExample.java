package chap02.sec02;

public class CharExample {
	public static void main(String[] args) {
		// char : 2 byte( 부호없는 정수 : 0 ~65535 )
		
		char ch1 = 44032;
		System.out.println(ch1);
		System.out.println(ch1 + 10);
		System.out.println((char)ch1 + 10);		// 괄호안에 있는 식이 먼저 실행됨
		System.out.println((char)(ch1 + 10));
		
		for(char ch = 'A'; ch <= 'Z'; ch ++) {
			System.out.println(ch+ " = " + (int)ch );
		}
		
		for(int i = 0; i <= 255; i ++) {
			System.out.println(i + " => " + (char)i);
		}
		
		short sh1 = 200;
		// char ch = sh1;
		short sh = 'A';
		
		char ch2 = (short) (200);
	}

}
