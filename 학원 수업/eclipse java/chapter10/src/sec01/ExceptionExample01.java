package sec01;

public class ExceptionExample01 {

	public static void main(String[] args) {
		methodA();

	}
	
	public static void methodA() {
		int res = 0;
		int num = 10;
		try {
			for (int i = 0; i < 15; i++) {
				res = 100 / num;
				System.out.println(res);
				num--;
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();	// at sec01.ExceptionExample01.methodA(ExceptionExample01.java:15) 15번 행에서 오류발생했다는 끗
		} catch (ArithmeticException e) {	// ArithmeticException -> 산술연산오류
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("이곳은 언제나 시행되는 블록입니다.");
		}
	}

}


// ctrl + Shift + f = 들여쓰기