package chap05;

import java.security.DomainCombiner;

public class Person {
	void 말하기() {
		System.out.println("Person이 말합니다.");
	}
	void 먹기() {
		System.out.println("Person이 먹습니다.");		
	}
	void 걷기() {
		System.out.println("Person이 걷습니다.");		
	}
	void 잠자기() {
		System.out.println("Person이 잡니다.");	
		
	}

	public static void main(String args[]) {
		Student st = new Student();
		st.말하기();
		st.공부하기();
	}
}

class Student extends Person{
	void 공부하기() {
		System.out.println("Student 가 공부합니다.");
	}	
}
class StudentWorker extends Student{
	void 일하기() {
	System.out.println("StudentWorker 가 일합니다.");
	}
}

class Researcher extends Person{
	void 연구하기 () {
		System.out.println("Researcher 가 연구합니다.");		
	}
}
class Professor extends Researcher{
	void 가르치기() {
		System.out.println("Professor 가 가르칩니다.");				
	}
}