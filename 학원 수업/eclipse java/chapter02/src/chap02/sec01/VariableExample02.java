package chap02.sec01;

public class VariableExample02 {
	static int val1 = 200;
		public static void main(String[] args) {
			// 변수 참조 영역
			int sum = 0;
			for(int i = 1; i <= 100; i ++) {
				sum = sum + 1;
				System.out.println("i=" + 1);
			}
			System.out.println("val1=" + val1);
			System.out.println("sum=" + sum);
		
	}
		
		public static void myMethod() {
			System.out.println("val1=" + val1);
			System.out.println("sum=");
		}

}
