package chapter06.sec07;

public class Parent {
	String name;
	int age;
	
	Parent() {}
	Parent(String name, int age) {	// ��������� �ʱ�ȭ ���ϰ� ���������ϸ� 0���� �ڵ��ʱ�ȭ�ȴ�. ���������� �ʱ�ȭ���ϸ� ��� ���Ѵ�.
		this.name = name;			//���� age �ʱ�ȭ ���ص� ����� �� �ִ�. �ڵ��ʱ�ȭ �ȴ�.
		this.age = age;
	}
	
}


//��������(8��) �ȿ��� �������(4,5��) ȣ�� �� �����ȵ�. ���� this ���������� ����ؾ���.