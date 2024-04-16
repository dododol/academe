package chap05;

public class UpcastingEx {
	
	public static void main(String[] args) {
		Person1 p = new Student1("이재문");	// 업캐스팅
		System.out.println(p.name);
		
//		Person1 p1 = new Student1("1학년", "스마트소프트웨어학과");
//		System.out.println(p1.grade);
		
		Person1 p2 = new Student1("김태형");	//다운캐스팅
		Student1 s = (Student1)p2;
		System.out.println(s.name);

		if(p2 instanceof Person1) {
			System.out.println("Pserson1 타입입니다.");
		}else {
			System.out.println("Pserson1 타입이 아닙니다.");			
		}
	}
	
}

class Person1 {
	String name;
	String id;
	
	Person1(){}
	Person1(String name) {this.name = name;}
}

class Student1 extends Person1{
	String grade;
	String department;
	
	Student1(String name) {
		super(name);
	}
	
	Student1(String grade, String department) {
		this.grade = grade;
		this.department = department;
	}
}
