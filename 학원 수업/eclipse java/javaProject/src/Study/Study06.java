package Study;

public class Study06 {
	/*
	 * 객체(클래스)란?
	 * 
	 * - 물리적으로 존재하거나 추상적으로 생각할 수 있는 것 중에서 자신의 속성을 가지고 있으면서
	 * 	 식별 가능한 것
	 * - 객체는 속성과 동작으로 구성되어 있다.
	 * 	  > 이름, 나이, 성별과 같은 필드 (변수)
	 * 	  > 걷다, 말하다, 멈추다와 같은 메서드 (함수)
	 * - 객체(클래스) 생성을 통해 클래스를 선언할 수 있다.
	 * - ** 객체(클래스)는 생성자, 필드, 메소드로 구성되어 있다.
	 * 	 > 필드 : 데이터가 저장되는 곳 (변수)
	 *   > 생성자 : 값을 초기화 하는 역할 담당
	 *   > 메소드 : 기능을 실행하는 블록
	 * - new 연산자를 통해 생성된 객체(클래스)를 만들어내는데 이걸 인스턴스화라고 한다.
	 * - 객체(클래스)는 앞글자가 꼭 대문자여야한다.
	 */

	// Study06 클래스에 필드(변수)를 선언해보자
	String name;	// 이름
	int age;		// 나이
	String gender;	// 성별
	
	// Study06 클래스에 생성자를 만들어보자
	// - 기본생성자, 매개변수가 있는 생성자(Custom 생성자)
	public Study06() {} // 기본 생성자	: 아무것도 없이 열고 닫는 것 밖에 없어서 기본생성자.
	
	// Study06 클래스에 Custom 생성자를 만들어보자
	public Study06(String name) {
		this.name = name;
	}
	
	// Study06 클래스에 Custom 생성자를 만들어보자
	public Study06(String name, int age) {
	this.name = name;
	this.age = age;
	}
		
	// Study06 클래스에 Custom 생성자를 만들어보자
	public Study06(String name, int age, String gender) {
	this.name = name;
	this.age = age;
	this.gender = gender;
	}		

	// 생성자 오버로딩
	// public Study06() {}
	// public Study06(String name) {}
	// public Study06(String name, int age) {}
	// public Study06(String name, int age, String gender) {}

	// Study06 클래스에 함수를 만들어보자
	public void study() {
		System.out.println(name + "학생이 공부를 합니다!");
	}
	
	// getter 함수 : 특정 값을 얻어올 때
	public String getName() {
		return name;
	}
	
	// setter 함수 : 값을 저장할 때
	public void setName(String name) {
		this.name = name;
	}

	// 오버라이드(재정의)
	// toString() 함수는 우리가 클래스를 만들다 보면 제일 많이 보는 함수입니다.
	// 이 녀석은@override 되어 있는 함수로 부모 클래스에서 생성되어 있는 함수를
	// Study06클래스와 같은 자식 클래스에서 '재정의' 하여 사용하는 함수인데
	// 부모클래스는 Object이고 Object가 상속되는건 default로 생략 가능합니다.
	@Override
	public String toString() {
		return "ㅁㅇㄻㄴㄷㄻㄴㄹㄴㅇㅍㅋㅌㅊㅍㅍ";
	}


	
	
}

//변수(필드), 생성자, 메소드