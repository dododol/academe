package chapter06.sec07;

public class Child extends Parent{
	String gender;
	int age = 25;
	
	
	Child() {
		super();
	}
	
	Child(String gender, String name, int age) {	// 부모클래스의 생성자메소드에 넘겨줄 데이터를 여기서 정의. 따라서 name, age도 붙어야함.
		super(name,age);		// super를 이용하여 불러와야 부모클래스 객체가 생성된다.
		this.gender=gender;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
//		return age;		이렇게 사용하면 부모의 나이인 45 출력
		return super.age;	// 앞에 super를 붙히면 자식에서 초기화한 25를 출력
	}
}

//모든자식클래스의 첫줄은 super이다. 9행에 쓰던 안쓰던 항상 존재

//13행 super에 의해서 부모클래스가 생성되고 상속되어지는것.