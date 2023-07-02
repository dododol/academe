package chapter11.sec01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

// Class : Ŭ������ ���� ��ȯ

public class ClassExample {
	public static void main(String[] args) throws Exception{
		
		Class c1 = Member.class;
		Class c2 = Byte.class;
//		System.out.println("Ŭ���� �̸� : " + c2.getName());
//		System.out.println("Ŭ�����̸�(��Ī) : " + c2.getSimpleName());
//		System.out.println("�Ҽ� ��Ű���� : " + c2.getPackage());
//		System.out.println("�Ҽ� ��Ű���� : " + c2.getPackage());
//		System.out.println("�Ҽ� ��Ű���� : " + c2.getPackage());

		// ������ �޼ҵ� - �迭�� ��ȯ
		Constructor[] constructors = c1.getConstructors();
		Member member = null;
		for(Constructor c : constructors) {
			member = (Member)c.newInstance("1");
			System.out.println(member.toString());
		}
		System.out.println("�����ڸ޼ҵ�");
		for(Constructor c : constructors) {
			
		}
		
		// ����ʵ� - �迭�� ��ȯ
		Field[] fields = c1.getFields();	// public field �� ��ȯ
		Field[] fieldInher=c1.getDeclaredFields();	// ��ӹ��� �ʵ常 ��ȯ
		
		for(Field field : fields) {
			System.out.println("�ʵ�� : " + field.getName());
			System.out.println("�ʵ�Ÿ�� : " + field.getType());
		}
		
		// �޼ҵ� - �迭�� ��ȯ
		Method[] methods = c1.getDeclaredMethods();	// ��ӹ��� �޼ҵ� ������ �޼ҵ� ��ȯ
		
		for(Method method : methods) {
			System.out.println("�޼ҵ�� : " + method.getName());
			System.out.println("��ȯŸ�� : " + method.getReturnType());
		}
		
		System.out.println(member.getModifiers());
		
	}

}
