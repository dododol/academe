package chapter03.sec01;

public class BinaryOperator02 {
	
	public static void main(String[] args) {
		// 비트, 대입, 이동 -> 이항연산자
		
		// bitwiseOperator();
		// shiftOperator();
		assignOperator();
	}
	
	public static void bitwiseOperator() {
		// 비트별 연산자 ; |, &, ^
		int n1 = 35;
		int n2 = 23;
		System.out.println("n1 & n2 = " + (n1 & n2));  // and
		System.out.println("n1 | n2 = " + (n1 | n2));  // or
		System.out.println("n1 ^ n2 = " + (n1 ^ n2));  // xor
	}
	
	public static void shiftOperator() {
		// shift : >>(right shift), <<(left shift)
		// , >>>(right shift with sign bit(부호비트까지 이동. 특징으로 절대 음수가 나올 수 없다)
		int num = 35;
		System.out.println("35 >> 2 = " + (num >>2));
		System.out.println("35 << 2 = " + (num <<2));
		num = -35;
		System.out.println("35 >>> 2 = " + (num >>>2));
		
	}
	
	public static void assignOperator() {
		// 대입 : =, 우선순위가 가장 낮음
		// 결합대입연산자 : +=, -=, /=, *=, %=
		//	변수 = 변수 연산자(+, -, /, *)값
		//	변수 연산자 = 값
		
		int res = 0;
		int num = 100;
		
		res = res + 10; // res += 10
		
		res = res*(num/10); // res * (num/10)
	}

}
