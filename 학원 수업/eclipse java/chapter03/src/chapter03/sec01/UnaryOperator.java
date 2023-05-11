package chapter03.sec01;

public class UnaryOperator {
	public static void main(String[] args) {
		// 단항연산자 : 부호(-,+), 증감(++,--), 논리부정(!)	
		// signOperator();			//메인 메소드가 마부, 나머지 메소드들은 말. 말을 마부한테 연결해줘야함
		// incrementOperator();
		logicalNot();
	}
	
	public static void signOperator() {
		// 부호연산자 : 음수(-), 양수(+)
		int num1 = 100;
		int num2 = -num1;
		
		//1-2+3-4......-10=?
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
	}
	
	public static void incrementOperator() {
		// 증감연산자 : ++, --
		int num = 100;
		int res1 = 0;
		int res2 = 0;
		
//		res1 = num++;	// postfix 표기법
//		System.out.println("num=" + num + "\nres1=" + res1);
		
		System.out.println("num++=" + (num++) + ", num=" + num);
		// num++=100, num=101 -> 먼저 num 값(100)을 출력 후 ++연산자 실행한 +1 값(101)을 출력
		
		num = 100;
//		res2 = ++num;	// prefix 표기법
//		System.out.println("Num=" + num + "\nres2=" + res2);
		
		System.out.println("++num=" + (++num) + ", num=" + num);
		// ++num=101, num=101 -> ++연산자를 먼저 실행한 +1 값(101) 출력 후 num 값(101) 출력
	}
		public static void logicalNot() {
			// 논리 부정 연산자 : !
			//	토글기능(toggle) : 참과 거짓이 반복되는 기능
			//		-한영변환, 삽입/편집기능 등
			boolean powerState = true;
			while (true) {
				if(powerState) {
					System.out.println("전원 스위치가 on상태");
				}else {
					System.out.println("전원 스위치가 off상태");
				}
				powerState = !powerState;
			}
		
		}
		
}
