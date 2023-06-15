package homeWork;

public class Employee {	//클래스에 있으면 멤버변수. 메소드안에 있으면 지역변수
	private int empno;		// 사번
	private String name;	// 이름
	private String dep;		// 부서
	private String rank;	// 직급
	private int age;		// 나이
	private String gender;	// 성별
	private int sal;		// 연봉
	private int tel;		// 연락처
	private String address;	// 주소
	
	
	
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

	
	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getSal() {
		return sal;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	//3. 급여는 연봉에서 12개월을 나눈 값으로 지급하나 매달 세금으로 급여의 8%를 빼고 수령받게 될 것이다.
	//   따라서 급여 정보를 반환하는 메서드는 위의 사항을 고려하여 값이 반환될 수 있게 해야 한다.  
	public int sil() {		// 메소드의 할당연산자는 return.  int 타입의  sil이라는 메소드에 return뒤에 오는 값을 넣는다.
		return (int)((sal / 12) * 0.92);
	}
	
	// 4. 회사 내규에 따라 연봉 협상은 현재 연봉의 2.5% 까지만 최대로 올릴 수 있다. 이는 모든 직원들이 동일하다.
	//    단, 전년도 실적에 따라 더 높이거나 낮출 수는 있다.
	public int updown(int aa) {
		if (sal*1.025>=aa) {
				return aa;
			}else {
				return sal;		//결렬시 현재 연봉으로 유지한다.
			}
		
	}

}


/*
다음 요구사항에 맞는 메소드와 객체를 생성하여라.

[직원 클래스]



⦁ 직원 정보를 가지고 있는 Employee 클래스가 있다.

⦁ 이 클래스를 사용하여 직원들의 사번, 이름, 부서, 직급, 나이, 성별, 연봉, 연락처, 주소 등의 정보를  관리할 것이다.



     Employee e = new Employee();



1. 직원 정보 관리를 위한 객체를 생성할 때 반드시 사번, 이름, 부서, 직급의 정보가 있어야 한다.

2. 생성된 직원의 연봉을 설정할 수 있다.

3. 급여는 연봉에서 12개월을 나눈 값으로 지급하나 매달 세금으로 급여의 8%를 빼고 수령받게 될 것이다. 따라서 급여 정보를 반환하는 메서드는 위의 사항을 고려하여 값이 반환될 수 있게 해야 한다.  

4. 회사 내규에 따라 연봉 협상은 현재 연봉의 2.5% 까지만 최대로 올릴 수 있다. 이는 모든 직원들이 동일하다. 단, 전년도 실적에 따라 더 높이거나 낮출 수는 있다.
*/