package kr.or.ddit.variable;

public class VariableClass {
	/*
	 *  *2. 변수와 타입
	 *- 변수 선언 및 초기화
	 *- 변수 명명 규칙
	 *- 기본 타입
	 *- 타입 변환
	 *- 변수와 시스템 입출력
	 * 
	 */
	public static void main(String[] args) {
		/*
		 * 1) 변수 선언 및 초기화
		 * 
		 * 변수란? 값을 저장할 수 있는 메모리의 특정 번지에 붙이는 이름이다.
		 * 이런 개념 다 필요없고 '값을 저장하기 위한 공간'으로 기억하면 됩니다
		 * 그런데 그 공간이 주소를 갖는다는 것이다!!
		 * 
		 * [변수 선언 및 초기화]
		 * int age;			// 변수 선언
		 * age = 10;		// 변수 초기화
		 * int num = 20; 	// 변수 선언 및 초기화
		 * 
		 * 		**여기서 꼭 알고 가야 할 부분은, 변수를 선언하기 위해서는 여러가지 타입의
		 * 		자료형을 알아야합니다. 그러기 위해서는 타입 종류를 알고 타입 종류에 따른
		 * 		초기화 할 수 있는 값을 알아야합니다.
		 * 		타입별 초기화 할 수 있는 값은 어떤 것이며, 타입 종류는 어떤것이 있고 그 형태는
		 * 		어떤것이 있는지는 아래 3)에서 한번 더 확인 할 수 있도록 합니다!
		 */
		int age = 99;			// 정수형 타입의 변수 age를 99라는 값으로 초기화
		int num;				// 정수형 타입의 변수 num을 선언
		num = 1400;				// 변수 num에 1400값으로 초기화
		boolean flag = false;	// 논리형 타입의 변수 flag에 false값으로 초기화
		String str = "";		// 문자열 타입의 변수 str에 ""(공백)값으로 초기화			String은 대문자로시작.클래스
		str = "Basic Java"; 	// str변수에 "Basic Java" 문자열의 값을 초기화
		
		/*
		 * 2) 변수 명명 규칙
		 * 
		 * 		변수 이름은 자바 언어에서 정한 명명 규칙을 따라야 하는데, 아래와 같은 명명
		 * 		규칙을 지키도록 하자!
		 * 		- 첫번째 글자는 문자이거나 '$','_'로 시작해야하고, 숫자로 시작할 수 없다
		 * 		- 영문 재소문자를 구분한다.
		 * 		- 첫 문자는 소문자로 시작하고, 뒤에 다른 단어가 붙는 경우 대문자로 시작한다
		 * 			> 개발자들 사이에서 관례로 행해진다
		 * 			> 카멜 표기법(Camel Case)이라고 한다.
		 * 		- 문자 수의 제한은 없다. (그렇다고 너무 길면 안되겠죠? 적당히 길게)
		 * 		- 자바 예약어는 사용할 수 없다.
		 * 			> boolean, byte, char, int ,private, new, void 등
		 * 			> 혼자 공부하는 자바 p50쪽을 참고 하도록 한다!!
		 * 
		 */
		int boNo = 0;
		int bo_hit = 0;
		String title = "";
		String boContent = "";
		boolean joinFlag = false;
		
		double MathKorNum;	// 대문자로 시작해서 틀림
//		float 1FloatNum;	// 1로 시작해서 틀림, 1을 지워도 대문자로 시작해서 틀림	float floatNum ->이 맞음
		String $ajaxObject;	// 관례적으로 변수는 소문자로 시작한다. 변수는 숫자로 시작할 수 없다. 변수는 $,_로 시작할 수 있다.
		int _count;			
//		String private;		// 변수명을 예약어로 시작할 수 없다.
	
		/*
		 * 3) 기본 타입
		 * 
		 * 		기본형 타입
		 * 		- 정수, 실수, 논리형타입의 기본 타입을 제공한다.
		 * 		- 정수형 타입 : byte, char, short, int, long
		 * 		- 실수 타입 : float, double
		 * 		- 논리 타입 : boolean
		 * 
		 * 		** 정수형 타입의 크기 암기 비법
		 * 		- BC 카드로 SIL나게!!!!
		 * 		- B C S I L (byte char short int long)
		 * 		- 1 2 2 4 8
		 * 		- boolean float double
		 * 		- 1         4      8
		 * 
		 * 		참조형 타입
		 * 		- String, Integer, Float, Double 등등
		 */
		byte len = 127;
		short length = 128;
		char ch1 = 'A';		// A가 출력된다
		char ch2 = 65;		// A가 출력된다
		int textNum = ch1;	// 숫자 65가 출력된다
		int box = 2145685911;	// int에는 담을 수 있는 최대 수 범위가 있다.
		long max = 999999999;	// long에도 담을 수 있는 최대 수 범위가 있다.
		boolean agree = false;	// 논리형은 true/false 값 둘 중 하나로
		float num1 = 24;
//		float num2 = 24.5;		// float은 소수를 입력할 때 f를 붙혀준다.
		float num3 = 24.516f;
		double num4 = 123.123;	// double는 소수를 그대로 입력 가능
		double num5 = num3;		// 같은 실수형이기 때문에 집어넣을 수 있다.
		
		/*
		 * 4) 타입 변환
		 * 	타입 변환이란, 해당 데이터 타입을 다른 데이터 타입으로 변환하는 것을 말한다.
		 * 	
		 * 	타입 변환은 큰 허용 범위 타입 = 작은 허용 범위 타입;
		 * 
		 * 	[크기 순서]
		 * 	byte < short < int < long < float < double
		 * 
		 * 	강제 타입 변환(캐스팅)
		 * 	작은 허용 범휘 = (큰 허용 범위)값;
		 * 
		 * 	참조형 타입의 함수를 이용한 타입 변환
		 * 	참조형 타입.parse참조형 타입
		 * 	> Integer.parseInt();
		 * 	> Byte.parseByte();
		 *  > Short.parseShort();
		 *  > Double.parseDouble();
		 *  
		 *  참조형 타입의 함수를 이용한 형변환은 특징이 있는데, 변환하고자 하는 타입의
		 *  값 형태를 맞춰 주어야 한다.
		 *  
		 *  #자료형에 따른 기본값(데이터)
		 *  자료형	|	기본값
		 *  byte	|	0
		 *  short	|	0
		 *  int		|	0
		 *  long	|	0
		 *  float	|	0.0f
		 *  double	|	0.0
		 *  char	|	'\u0000'(null)
		 *  boolean	|	false
		 */
		byte byteValue = 127;
		int intValue = 1 + byteValue;
		long longValue = 900000000L;
		float floatValue = longValue;
		double doubleValue = longValue;
		char charValue = 'A';
		int intValue2 = charValue;
		System.out.println("결과 집계=====");
		System.out.println("byteValue : " + byteValue);
		System.out.println("intValue : " + intValue);
		System.out.println("longValue : "+ longValue);
		System.out.println("floatValue : " + floatValue);
		System.out.println("doubleValue : " + doubleValue);
		System.out.println("charValue : " + charValue);
		System.out.println("intValue2 : " + intValue2);
		
		int a = 128;
		byte b = (byte)a;
		System.out.println("b : " +b);
	
	}

}
