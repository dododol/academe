package chapter11.sec01;
// ������ ������ ���ϸ��� ���̴�. �� �� ���ϸ����� 1000���� ���� ȸ���� ���ϸ����� 1000����
// 1000���� ū ���ϸ����� ���� ȸ���� ������ ���ϸ����� ����Ͻÿ�(Math.max()���)
// �� ���ϸ����� �迭ó�� : 
//		1200, 1800, 900, 3000, 750, 1600, 8700, 800, 5700, 2500�̴�.
public class MathExample {

	public static void main(String[] args) {
		
		int[] mileage = {1200, 1800, 900, 3000, 750, 1600, 8700, 800, 5700, 2500};

			System.out.println("���� ���ϸ���   ���� ���ϸ���");
			for(int m : mileage) {
				System.out.printf("%6d      | %6d\n",  m, Math.max(m, 1000));
			}
				
//			for(int i = 0; i < mileage.length; i++) {
//				if(mileage[i] < 1000) {
//					System.out.println("1000");
//				} else(Math.max(mileage[i])) {
//			}
		
	}

}
