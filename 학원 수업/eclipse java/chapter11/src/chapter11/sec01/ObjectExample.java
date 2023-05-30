package chapter11.sec01;

public class ObjectExample {

	public static void main(String[] args) {
		
		Person p1 = new Person("홍길동");
		System.out.println("getinfo() :" + p1.getinfo());
		System.out.println("toString() :" + p1.toString());
		
		Person p2 = p1;
//		Person p2 = new Person("홍길순");
		if (p2.equals(p1)) {
			System.out.println("같은 내용");
		} else {
			System.out.println("다른 내용");
		}

	}

}

class Person{
	private String name;	//private으로 선언되어진 멤버변수가 있으면 1. 생성자 메소드 써서 초기화 2.하나씩 밖으로 내보내거나 변경할때 setter, getter사용. 3. 한번에 내보낼때는 toSting사용
	
	Person(String name) {
		this.name = name;
	}
	String getinfo() {
		return getClass().getName() + '@' + Integer.toHexString(hashCode());	//10진수 주소를 16진수 문자열로 바꿔줌
	}
	
	@Override
	public String toString() {
		return name;
	}
}