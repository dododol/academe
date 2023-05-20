package homeWork;

public class Employee {
	int empno;		// 사번
	String name;	// 이름
	String dep;		// 부서
	String rank;	// 직급
	int age;		// 나이
	String gender;	// 성별
	int sal;		// 연봉
	int tel;		// 연락처
	String address;	// 주소
	
	
	
	public Employee(int empno, String name, String dep, String rank) {
		this.empno = empno;
		this.name = name;
		this.dep = dep;
		this.rank = rank;
	}
	
	public Employee(int empno, String name, String dep, String rank, 
			int age) {
		this.empno = empno;
		this.name = name;
		this.dep = dep;
		this.rank = rank;
		this.age = age;
	}
	
	public Employee(int empno, String name, String dep, String rank, 
					int age, String gender) {
		this.empno = empno;
		this.name = name;
		this.dep = dep;
		this.rank = rank;
		this.age = age;
		this.gender = gender;
	}
	
	public Employee(int empno, String name, String dep, String rank, 
					int age, String gender, int sal) {
		this.empno = empno;
		this.name = name;
		this.dep = dep;
		this.rank = rank;
		this.age = age;
		this.gender = gender;
		this.sal = sal;
	}
	
	public Employee(int empno, String name, String dep, String rank, 
					int age, String gender, int sal, int tel) {
		this.empno = empno;
		this.name = name;
		this.dep = dep;
		this.rank = rank;
		this.age = age;
		this.gender = gender;
		this.sal = sal;
		this.tel = tel;
	}
	
	public Employee(int empno, String name, String dep, String rank, 
					int age, String gender, int sal, int tel, String address) {
		this.empno = empno;
		this.name = name;
		this.dep = dep;
		this.rank = rank;
		this.age = age;
		this.gender = gender;
		this.sal = sal;
		this.tel = tel;
		this.address = address;
	}
	
	
	
}
