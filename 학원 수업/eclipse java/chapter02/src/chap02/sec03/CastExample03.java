package chap02.sec03;

public class CastExample03 {

	public static void main(String[] args) {
		/*  1���� 365.2422���̴�. �� �ڷ��
		    "1���� 365�� xx�ð� xx�� xx�� �̴�" �� ����ϵ��� ���α׷� �Ͻÿ�. 
		    */
		
		double hour;
		hour = 0.2422 * 24;
		
		System.out.println(hour);		// 1) 0.2422�� �Ϸ� 24�ð��� ���ؼ� �ð��� ���Ѵ�.
		
		
		double minute;
		minute = hour % 5;
		minute = minute * 60;
		
		System.out.println(minute);		// 2) �������� ���ϴ� %�����ڸ� �̿��ؼ� �ð����� ������ ������ ���� ���� �� 60���� ���Ͽ� �а��� ���Ѵ�.
		
		
		double second;
		second = minute % 48;
		second = second * 60;
		
		System.out.println(second);		// 3) ���������� �������� ���ϴ� %�����ڸ� �̿��ؼ� �а��� ������ ������ ���� ���� �� 60�ʸ� ���Ͽ� �ʰ��� ���Ѵ�.
		
		System.out.println("1���� 365��" + (int)hour + "�ð�" + (int)minute + "��"  + (int)second + "�� �̴�.");
		
		
		
		

	}
}



/* 0.2422��

1�� 24�ð�
1�ð� 60��
1�� 60��

5�ð� 48�� 46��

�Ϸ� 24�ð�
1�ð��� �ȵǴ� �Ҽ��� ���ؼ� 1�ð� 60�� - x60�ϸ� �г��� */