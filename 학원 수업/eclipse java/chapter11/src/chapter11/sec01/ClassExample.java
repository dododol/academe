package chapter11.sec01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

// Class : 클래스의 정보 반환

public class ClassExample {
	public static void main(String[] args) throws Exception{
		
		Class c1 = Member.class;
		Class c2 = Byte.class;
//		System.out.println("클래스 이름 : " + c2.getName());
//		System.out.println("클래스이름(약칭) : " + c2.getSimpleName());
//		System.out.println("소속 패키지명 : " + c2.getPackage());

		// 생성자 메소드 - 배열로 반환
		Constructor[] constructors = c1.getConstructors();
		Member member = null;
		for(Constructor c : constructors) {
			member = (Member)c.newInstance("1");
			System.out.println(member.toString());
		}
		System.out.println("생성자메소드");
		for(Constructor c : constructors) {
			
		}
		
		// 멤버필드 - 배열로 반환
		Field[] fields = c1.getFields();	// public field 만 반환
		Field[] fieldInher=c1.getDeclaredFields();	// 상속받은 필드만 반환
		
		for(Field field : fields) {
			System.out.println("필드명 : " + field.getName());
			System.out.println("필드타입 : " + field.getType());
		}
		
		// 메소드 - 배열로 반환
		Method[] methods = c1.getDeclaredMethods();	// 상속받은 메소드 제외한 메소드 반환
		
		for(Method method : methods) {
			System.out.println("메소드명 : " + method.getName());
			System.out.println("반환타입 : " + method.getReturnType());
		}
		
		System.out.println(member.getModifiers());
		
	}

}
