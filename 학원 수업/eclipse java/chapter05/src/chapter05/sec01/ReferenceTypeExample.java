package chapter05.sec01;

public class ReferenceTypeExample {		//모든 클래스의 조상클래스 -> Object클래스
										//

	public static void main(String[] args) {
		Person p1 = new Person("홍길동",50);			//생성자 메소드. 		17열의 Person 매개변수가 출력된다.
		String str = new String("홍길동");
		
		int[] score = new int[10];
		
		System.out.println("str=" + str);	// str은 주소가 보여지지 않고
		System.out.println("p1=" + p1);		// 클래스 이름을 경로까지 포함하여 주소까지 보여주는 (p1=chapter05.sec01.Person@23ceabc1)
			// 오프젝트 클래스의 toString메소드는 객체정보를 반환할때 사용하는 메소드다.
			// 10, 11행에 ("str=" + str), ("p1=" + p1) -> . 뒤에 p1, str위에 toString메소드가 생략됨
		System.out.println("score=" + score);	// 배열 -> 클래스의 성질
	}
		// 주소가 포함되어진 참조형 변수.
}

class Person {
	String name;
	int age;			//14, 15 행은 멤버변수
	
	Person()/*매개변수*/ {}
	Person(String name, int age) {		// 메소드 오버로딩 - 한 클래스내에서 이름이 똑같은 메소드가 여러개 존재.(다양한 데이터 취급이 목적)
										// 사용하는 매개변수의 갯수나 타입이 다르면 이름이 같아도 다른것으로 인정
										// 오버 라이딩 - 자식클래스가 부모클래스의 주소를 재정의해서 사용한다
		this.name = name;	// 19, 20 행은 지역변수
		this.age =age;
	}
//사람이라는 클래스를 만들었다. 멤버변수는 특징을 보관하는 변수이다. 이 클래스에서는 이름(name)과 나이(age)라는 멤버변수가 있다.
	// 생성자 메소드는 첫글자가 소문자가 아닐 수 있는 유일한 메소드다( 생성자 메소드가 하는 일은 멤버변수 초기화이다)
	// 생성자 메소드는 사용된 멤버변수를 시스템에 반납한다.
	
	@Override // -> 컴파일 되어지는 주석. 기능을 매우 단축할 수 있다.(ex: 몇 페이지 분량을 한줄로 요약)
	public String toString() {
		return this.name;
	}
}


//모든 클래스는 생성자 메소드가 반드시 하나이상 필요하다.
// 만약 사용자가 직접 만들지 않으면 자바 유틸이 자동으로 생성하여 삽입한다.