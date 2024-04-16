package chap05;

public class GoodCalc extends Calculator{

	public static void main(String[] args) {
		GoodCalc c = new GoodCalc();
//		int[] arr = {2,3,4};
		System.out.println(c.add(10,20));
		System.out.println(c.subtract(200,100));
		System.out.println(c.average(new int[]{2,3,4}));
	}

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		return a-b;
	}

	@Override
	public double average(int[] a) {
		double sum = 0;
		for(int n : a)
			sum += n;	// 총합
			
		return sum/a.length;
	}

}

//추상클래스
abstract class Calculator{
	//추상메소드
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int[] a);
}