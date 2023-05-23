package chapter06.sec07;

public class Parent {
	String name;
	int age;
	
	Parent() {}
	Parent(String name, int age) {	// 멤버변수는 초기화 안하고 참조먼저하면 0으로 자동초기화된다. 지역변수는 초기화안하면 사용 못한다.
		this.name = name;			//따라서 age 초기화 안해도 사용할 수 있다. 자동초기화 된다.
		this.age = age;
	}
	
}


//지역변수(8행) 안에서 멤버변수(4,5행) 호출 시 참조안됨. 따라서 this 참조변수를 사용해야함.