package chapter06.sec02;

public class Shape {
	String kind="������";		// �����ʱ�ȭ
	int height=50;
	int weight=15;
	
	{
		kind="Ÿ����";		// �ʱ�ȭ���
		height = 70;
	}

	Shape(String kind,int weight) {		// �����ڸ޼ҵ�
		this.kind = kind;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "���� : " + kind + "\n���� : " + weight + "\n���� : " + height;
	}
}

// �����ʱ�ȭ -> �ʱ�ȭ��� -> �����ڸ޼ҵ� ->>> �ᱹ ������ �޼ҵ尡 �� ���


/*
Person s1 = new person("������");
Classperson{
	String name = "�̼���";
	int age;

�ʱ�ȭ ���

1) ���� �ʱ�ȭ(������� 1��)
 String name = "�̼���";

2) �ʱ�ȭ ���(�����ڸ޼ҵ庸�� ��������� 2��) (������� �ʱ�ȭ���� ���Ͽ� ���)
 {name="ȫ�浿";
  age = 25;
}
person(String name){
this.name=name
}
3) ������ �޼ҵ�(���� ���� ���� 3��)
��ü���� �� ���� �پ��� ���� ���� ���ο� ��ü�� ������Ű�� ������ ���


==>�����ʱ�ȭ "�̼���" -> �ʱ�ȭ��� "ȫ�浿" -> �����ڸ޼ҵ� "������"

��ü�� ������ �� �ʱ�ȭ��.

*/