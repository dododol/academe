package chapter06.sec03;

public class CalculateExample {

	public static void main(String[] args) {
		Calculate c1 = new Calculate();
		int res1 = c1.add(100, 200);	// 매개변수 2개, 첫번째 int 두번째도 int. 따라서 첫번째 메소드 호출됨
		double res2 = c1.add(27.5, 50);	// 매개변수 2개, 첫번째 double 두번째는 int. 따라서 세번째 메소드 호출됨

	}

}

class Calculate {
	
	public int add(int a, int b) {	// 첫번째
		return (a+b);
	}
	
	public double add(int a, double b) {	// 두번째
		return (a+b);
	}
	
	public double add(double a, int b) {	// 세번째
		return (a+b);
	}
	
	public float add(int a, float b) {		// 네번째	
		//네가지 매개변수의 배열과 타입이 다르다. 오버로딩 가능
		return (a+b);
	}
	
}


//예제] 두 숫자를 입력 받아 덧셈의 결과를 반환하는 메소드를 작성하시오
//두 숫자의 타입은 [int,int],[int,double][double,int],
//[int,float]이다.