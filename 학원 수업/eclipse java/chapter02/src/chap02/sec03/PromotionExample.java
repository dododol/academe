package chap02.sec03;

public class PromotionExample {
	
	public static void main(String[] args) {
		// promotion : �ڵ� ����ȯ
		// ǥ�������� ū ������ ��ȯ
		// ���Ŀ����� int���� ���� Ÿ���� �ڷ�� int�� ��ȯ
		
		byte b1 = 100;
		short s1 = 20;
		
		int res1 = b1 + s1;
		
		float f1 = 20f;
		long l1 = 1000L;
		
		float res2 = f1 + l1;
		// �� ��ȯ�� ������ ũ�Ⱑ �ƴ� ������ǥ�� ������ ū ������ ��.
		// long�� ������ ũ�Ⱑ �� ũ���� float�� ǥ�������� �� �б� ������ float�� ����ȯ �ؾ���
	}

}
