package chapter07.sec01;

public class StudentExample {

	public static void main(String[] args) {
		Student s1 = new Student("홍길동", 25, "여성", "ABC@naver.com");
		Student s2 = new Student("김석호",30,"남성");
		People p1 = new People("김석호",30,"남성");
		System.out.println("학생명 : " + s1.name);
		System.out.println("나이 : " + s1.age);
		
		People p2 = new People("강감창", 30, "남성");

	}

}
