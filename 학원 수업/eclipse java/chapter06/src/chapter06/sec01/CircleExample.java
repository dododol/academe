package chapter06.sec01;

public class CircleExample {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.radius = 10.2;
		circle.x = 300;
		circle.y = 500;
		
		circle.getPoint();
		double res = circle.getArea();
		System.out.println("���� ���� : " +circle.getArea());
		
		circle.getCircumference();
	}

}

/*

 ���� 1] ����(��ǥ��)�� �������� ������ ��(Circle)Ŭ������ �����Ͻÿ�.

�� �ʺ�� �������� ���ϴ� �޼ҵ嵵 �����Ͻÿ�.

���� 2] �й�(longŸ�� ����), �̸�(���ڿ�)�� ���� �ִ� �л�Ŭ������ �����Ͻÿ�
����� �л� ������ ����ϴ� �޼ҵ�� ����

���� 3] �����ȣ(int Ÿ���� ����), �����, ��ȭ��ȣ�� ������ ���Ŭ����(Employees)
�� �ۼ��Ͻÿ�. ����� ������� ��� ���

���� 4] ��ǰ��ȣ, ��ǰ��, ����ȸ��, ���� ������ ������ �ְ� ��ǰ ������ ����� �� �ִ�
��ǰ Ŭ����(Products)�� �����Ͻÿ�.

*/