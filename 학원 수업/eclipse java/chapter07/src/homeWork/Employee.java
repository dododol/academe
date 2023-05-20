package homeWork;

public class Employee {
	int empno;		// ���
	String name;	// �̸�
	String dep;		// �μ�
	String rank;	// ����
	int age;		// ����
	String gender;	// ����
	int sal;		// ����
	int tel;		// ����ó
	String address;	// �ּ�
	
	
	
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
