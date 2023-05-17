package chapter06.sec02;

public class Shape {
	String kind="오각형";		// 직접초기화
	int height=50;
	int weight=15;
	
	{
		kind="타원형";		// 초기화블록
		height = 70;
	}

	Shape(String kind,int weight) {		// 생성자메소드
		this.kind = kind;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "도형 : " + kind + "\n가로 : " + weight + "\n높이 : " + height;
	}
}

// 직접초기화 -> 초기화블록 -> 생성자메소드 ->>> 결국 생성자 메소드가 다 덮어씀


/*
Person s1 = new person("정몽주");
Classperson{
	String name = "이순신";
	int age;

초기화 방법

1) 직접 초기화(가장빠름 1등)
 String name = "이순신";

2) 초기화 블록(생성자메소드보다 빨리실행됨 2등) (멤버변수 초기화만을 위하여 사용)
 {name="홍길동";
  age = 25;
}
person(String name){
this.name=name
}
3) 생성자 메소드(가장 많이 쓰임 3등)
객체생성 때 마다 다양한 값을 갖는 새로운 객체를 생성시키고 싶을때 사용


==>직접초기화 "이순신" -> 초기화블록 "홍길동" -> 생성자메소드 "정몽주"

객체가 생성될 때 초기화됨.

*/