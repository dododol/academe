package chap02.sec03;

public class PromotionExample {
	
	public static void main(String[] args) {
		// promotion : 자동 형변환
		// 표현범위가 큰 쪽으로 변환
		// 수식에서는 int보다 작은 타입의 자료는 int로 변환
		
		byte b1 = 100;
		short s1 = 20;
		
		int res1 = b1 + s1;
		
		float f1 = 20f;
		long l1 = 1000L;
		
		float res2 = f1 + l1;
		// 형 변환시 데이터 크기가 아닌 데이터표현 범위가 큰 곳으로 들어감.
		// long이 데이터 크기가 더 크지만 float이 표현범위가 더 넓기 때문에 float로 형변환 해야함
	}

}
