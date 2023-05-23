package chapter06.sec07;

public class Child extends Parent{
	String gender;
	int age = 25;
	
	
	Child() {
		super();
	}
	
	Child(String gender, String name, int age) {	// �θ�Ŭ������ �����ڸ޼ҵ忡 �Ѱ��� �����͸� ���⼭ ����. ���� name, age�� �پ����.
		super(name,age);		// super�� �̿��Ͽ� �ҷ��;� �θ�Ŭ���� ��ü�� �����ȴ�.
		this.gender=gender;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
//		return age;		�̷��� ����ϸ� �θ��� ������ 45 ���
		return super.age;	// �տ� super�� ������ �ڽĿ��� �ʱ�ȭ�� 25�� ���
	}
}

//����ڽ�Ŭ������ ù���� super�̴�. 9�࿡ ���� �Ⱦ��� �׻� ����

//13�� super�� ���ؼ� �θ�Ŭ������ �����ǰ� ��ӵǾ����°�.