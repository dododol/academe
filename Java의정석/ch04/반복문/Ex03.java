package ch04.반복문;

public class Ex03 {
	public static void main(String[] args) {
//		int i = 5;	// 반복할 횟수를 넣는다.
//		
//		while(i--!=0) {
//			System.out.println(0 + " - I can do it.");
//		}
		
//		int sum = 0;
//		int i = 0;
//		// i를 1씩 증가시켜서 sum에 계속 더해나간다.
//		while (sum <= 100) {
//			System.out.printf("%d - %d%n", i, sum);
//			sum += ++i;
//		}
		
		int num =12345, sum = 0;
		
		// 10으로 나머지 연산을 하면 마지막 자리를 얻는다.
		
		// num = 12345, 1234, 123, 12, 1
		for(num=12345; num>0; num = num/10) {
			System.out.println(num%10);
			sum += num %10;
		}
		System.out.println("각 자리수의 합 : " + sum);
	}
}
