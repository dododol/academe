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
			e.printStackTrace();	// at sec01.ExceptionExample01.methodA(ExceptionExample01.java:15) 15�� �࿡�� �����߻��ߴٴ� ��
		} catch (ArithmeticException e) {	// ArithmeticException -> ����������
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("�̰��� ������ ����Ǵ� ����Դϴ�.");
		}
	}

}


// ctrl + Shift + f = �鿩����