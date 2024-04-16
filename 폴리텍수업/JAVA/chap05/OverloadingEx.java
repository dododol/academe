package chap05;

public class OverloadingEx {

	public static void main(String[] args) {
		OverloadingEx ex = new OverloadingEx();
		int result = ex.add(10, 20);
		System.out.println(result);
		
		result = ex.add(10, 20, 30);
		System.out.println(result);

		result = ex.add(1.2, 3.4);
		System.out.println(result);
		
		result = ex.add(10.2, 3);
		System.out.println(result);
		
		result = ex.add(10, 3.7);
		System.out.println(result);
		
		
		
	}
	
	// 메소드 오버로딩
	int add(int x, int y) {
		return x + y;
	}	
	int add(int x, int y, int z) {
		return x+y+z;
	}
	int add(double x, double y) {
		return (int) (x+y);
	}
	int add(double x, int y) {
		return (int)(x+y);
	}
	int add(int x, double y) {
		return (int)(x+y);
	}
	
}
