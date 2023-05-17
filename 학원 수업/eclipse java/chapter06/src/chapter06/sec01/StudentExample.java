package chapter06.sec01;

public class StudentExample {

	public static void main(String[] args) {
//		Student s1 = new Student();
//		s1.setStdID(1001);
//		s1.setStdName("이순신");
//		
//		s1.showInfo();
//		System.out.println(s1);
		
		Student s2 = new Student(1002,"홍길순");
		System.out.println(s2);

	}

}


class Student{
	private long stdID;
	private String stdName;						// 멤버변수 : 클래스의 속성을 결정지을 때 사용
												// 멤버변수는 메스드 밖에서 선언된 변수다. 메소드 안에서 선언된 변수는 지역변수.
	public Student() {}							// private : 밖에서 접근 불가.오로지 클래스 안에서만 생성자 호출 가능. 
	public Student(long stdID,String stdName) {	// private 초기화시키는 방법 1)생성자메소드 이용
		this.stdID = stdID;						
		this.stdName = stdName;
	}											// private 수정하기 위해서는 : getter setter 이용	
												// 사용자가 생성자 메소드를 만들어서 클래스를 초기화시켜야 오류가 적다. 안만들면 프로그램이 자동으로 만든다
	public void setStdID(long stdID)
	{
		this.stdID = stdID;
	}
	
	public void setStdName(String stdName)
	{
		this.stdName = stdName;
	}
	
	public void showInfo() {
		System.out.println("학번 : " + stdID);
		System.out.println("이름 : " + stdName);
	}
	
	@Override
	public String toString() {		// 이 라인은 한글자도 달라지면 안됨. 무조건 public이후 타입과 반환
		return "학번 : " + stdID + "\n이름 : " + stdName;
		
	}
												

}
//특수목적 참조변수 - this : 자기 클래스의 주소(참조변수), super : 부모의 주소(참조변수)
//set 메소드는 반환값이 없고 매개변수가 있다. get메소드는 반환값이 있고 매개변수가 없다