package chapter06.sec03;

public class AnimalExample {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		System.out.println(a1.getKind());
		
		a1.setKind("������");
		System.out.println(a1.getKind());
		
		Animal a2 = new Animal("�����");
		System.out.println(a2.getKind());

	}

}


//����] ������ ����(king)�� �����ϴ� ��� �ʵ尡 �ִ� ����Ŭ����(Animal)��
//	�����ϰ�, �����ڸ޼ҵ带 ���� ������ ���� ������ ������ ������ ����
//	�� �� �ִ� �޼ҵ� �� ������ ��ȯ�ϴ� �޼ҵ� �ۼ�