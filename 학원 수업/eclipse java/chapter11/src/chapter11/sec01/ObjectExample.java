package chapter11.sec01;

public class ObjectExample {

	public static void main(String[] args) {
		
		Person p1 = new Person("ȫ�浿");
		System.out.println("getinfo() :" + p1.getinfo());
		System.out.println("toString() :" + p1.toString());
		
		Person p2 = p1;
//		Person p2 = new Person("ȫ���");
		if (p2.equals(p1)) {
			System.out.println("���� ����");
		} else {
			System.out.println("�ٸ� ����");
		}

	}

}

class Person{
	private String name;	//private���� ����Ǿ��� ��������� ������ 1. ������ �޼ҵ� �Ἥ �ʱ�ȭ 2.�ϳ��� ������ �������ų� �����Ҷ� setter, getter���. 3. �ѹ��� ���������� toSting���
	
	Person(String name) {
		this.name = name;
	}
	String getinfo() {
		return getClass().getName() + '@' + Integer.toHexString(hashCode());	//10���� �ּҸ� 16���� ���ڿ��� �ٲ���
	}
	
	@Override
	public String toString() {
		return name;
	}
}