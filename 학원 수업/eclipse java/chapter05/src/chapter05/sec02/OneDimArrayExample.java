package chapter05.sec02;

public class OneDimArrayExample {

	public static void main(String[] args) {
		int score[]= {80,75,95,80,88};
		OneDimAarray od = new OneDimAarray();
		od.method1();
		System.out.println("\n합계=" + od.addArray(score));
		

	}

}

class OneDimAarray {
	
	public void method1() {
		// 정수 5개를 저장하는 배열을 생성하고 10, 20, 30, 40, 50을 저장한 후 출력하시오
		
		int[] num1 = null;
		num1 = new int[5];
		
		char[] num2;
		num2= new char[]{'a','b','c','d','e'};
		
		char[] num4 = new char[]{'a','b','c','d','e'};
		
		char[] num5 = {'a','b','c','d','e'};		// 배열과 스트링클래스에서는 new 생략되어도됨. 컴파일러가 자동으로 넣어줌
		
		boolean[] num3 = new boolean[5];
		
		for(int i=0; i<num2.length; i++) {
			System.out.print(num2[i]+",");
			
		}
				
	}
	
	public int addArray(int[] wjatn) {
		int sum = 0;
		for(int i=0; i<wjatn.length; i++) {
			sum += wjatn[i];
		}
		return sum;
	
	}
	
	
	
}
