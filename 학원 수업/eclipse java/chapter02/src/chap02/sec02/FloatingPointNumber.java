package chap02.sec02;

public class FloatingPointNumber {
	public static void main(String[] args) {
		// 1) float : 4byte (1bit(부호), 8bit(지수), 23bit(가수(데이터))
		//            1.4e-45 ~ 3.4e+38
		//            숫자 끝에 F(f)추가 해야 함
		
		// 2: double : 8byte (1bit(부호), 11bit(지수), 52bit(가수(데이터))
		//             4.9e-324 ~ 1.8e+308
		//             기본실수 타입
		
		float pi = 3.1415926f;
		double d1 = 3.1415926;
		double d3 = 3.1415926d;		// double는 굳이 뒤에 d를 안붙혀도 된다.
		
		float f2 = 0.1f;
		double d2 = 0.1;
		double res = f2;
		
		System.out.println(res);
		
		if(f2 == d2) {
			System.out.println("같은 값");
		}else {
			System.out.println("다른 값");
		}
	}

}
