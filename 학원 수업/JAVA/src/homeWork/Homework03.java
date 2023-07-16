package homeWork;

public class Homework03 {
	
	/*
	 * 1. 클래스의 3요소를 활용하여 Homework03클래스를 완성해주세요.
	 * 
	 * *** 변수명, 함수명은 본인이 자유롭게 작성해주세요.
	 */ 
	
	// # 필드를 작성해주세요
	// 1. 이름을 저장할 변수를 만들어주세요.
	
	private String name;
	
	// 2. 나이를 저장할 변수를 만들어주세요.
	
	private int age;
	
	// 3. 성별을 저장할 변수를 만들어주세요.
	
	private String gender;
	
	// 4. 주소를 저장할 변수를 만들어주세요.
	
	private String addr;

	// 5. 핸드폰번호를 저장할 변수를 만들어주세요.
	
	private String tel;
	
	// 6. 이메일을 저장할 변수를 만들어주세요.
	
	private String email;
	
	// 7. 취미를 저장할 변수를 만들어주세요.
	
	private String hobby;
	
	// # 생성자를 작성해주세요
	// 8. 기본생성자를 만들어주세요.
	
	public Homework03() {
		
	}
	
	// 9. 이름을 입력받을 수 있는 커스텀 생성자를 만들어주세요.
	// 그리고 입력받아온 이름을 초기화해주세요.
	
	public Homework03(String name) {
		this.name = name;
	}
	
	// 10. 이름, 나이를 입력받을 수 있는 커스텀 생성자를 만들어주세요.
	// 그리고 입력받아온 이름, 나이를 초기화해주세요.
	
	public Homework03(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 11. 이름, 나이, 성별을 입력받을 수 있는 커스텀 생성자를 만들어주세요. 
	// 그리고 입력받아온 이름, 나이, 성별을 초기화해주세요.
	
	public Homework03(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	// # 함수를 작성해주세요.
	// 12. 이름을 출력할 수 있는 함수를 만들어주세요.
	
//	public String getName() {
//		return name;
//	}

	public void nname() {
		System.out.println("이름 : " + name);
	}
	
	// 13. 나이를 출력할 수 있는 함수를 만들어주세요.
	
//	public int getAge() {
//		return age;
//	}
	
	public void aage() {
		System.out.println("나이 : " + age);
	}
	
	// 14. 성별을 출력할 수 있는 함수를 만들어주세요.
	
//	public String getGender() {
//		return gender;
//	}
	
	public void ggender() {
		System.out.println("성별 : " + gender);
	}
	
	// 15. 주소를 출력할 수 있는 함수를 만들어주세요.
		
//	public String getAddr() {
//		return addr;
//	}
	
	public void aaddr() {
		System.out.println("주소 : " + addr);
	}
	
	// 16. 핸드폰번호를 출력할 수 있는 함수를 만들어주세요.
	
	//	public String getTel() {
//		return tel;
//	}
	
	public void ttel() {
		System.out.println("번호 : " + tel);
	}
	
	// 17. 이메일을 출력할 수 있는 함수를 만들어주세요.
		
//	public String getEmail() {
//		return email;
//	}
	
	public void eemail() {
		System.out.println("메일 : " + email);
	}
	
	// 18. 취미를 출력할 수 있는 함수를 만들어주세요.
	
//	public String getHobby() {
//		return hobby;
//	}
	
	public void hhobby() {
		System.out.println("취미 : " + hobby);
	}
	
	// 19. 이름, 나이, 성별을 출력할 수 있는 함수를 만들어주세요.
	
//	public Object[] aa(){
//		Object[] a = {getName(),getAge(),getGender()};
//		return a;
//	}
	
	public void aa(String name, int age, String gender) {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
	}
	
	// 20. 주소, 핸드폰번호, 이메일, 취미를 출력할 수 있는 함수를 만들어주세요.
	
	public void bb(String addr, String tel, String email, String hobby) {
		System.out.println("주소 : " + addr);
		System.out.println("번호 : " + tel);
		System.out.println("메일 : " + email);
		System.out.println("취미 : " + hobby);
	}
	
	// 21. 이름, 나이, 성별, 주소, 핸드폰번호, 이메일, 취미를 출력할 수 있는 함수를 만들어주세요.
	
	public void cc(String name, int age, String gender, String addr, String tel, String email, String hobby) {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("주소 : " + addr);
		System.out.println("번호 : " + tel);
		System.out.println("메일 : " + email);
		System.out.println("취미 : " + hobby);
		
	}
	
	// 22. 주소를 전달받아서 전달받은 주소를 저장할 수 있는 함수를 만들어주세요.
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	// 23. 핸드폰번호를 전달받아서 전달받은 핸드폰번호를 저장할 수 있는 함수를 만들어주세요.
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	// 24. 이메일을 전달받아서 전달받은 이메일을 저장할 수 있는 함수를 만들어주세요.
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	// 25. 취미를 전달받아서 전달받은 취미를 저장할 수 있는 함수를 만들어주세요.
	
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	// 26. 주소, 핸드폰번호를 전달받아서 전달받은 주소, 핸드폰번호를 저장할 수 있는 함수를 만들어주세요.
	
	public void setAt(String addr, String tel) {
		this.addr = addr;
		this.tel = tel;
	}
	
	// 27. 이메일, 취미를 전달받아서 전달받은 이메일, 취미를 저장할 수 있는 함수를 만들어주세요.
	
	public void setEh(String email, String hobby) {
		this.email = email;
		this.hobby = hobby;
	}

	
	public static void main(String[] args) {
		// 26. Homework03 클래스 객체를 인스턴스화 과정을 통해 인스턴스를 만들어주세요. (객체 생성)
		// 이때, 기본 생성자를 이용해서 만들어주세요.
		
		Homework03 work03 = new Homework03();
		
		
		// 27. 만들어진 Homework03 클래스 객체 변수를 이용해서 주소, 핸드폰번호, 이메일, 취미를 저장할 수 있는 함수를 이용해 값을 저장해주세요.
		
		work03.addr = "대전";
		work03.tel = "010-1111-1111";
		work03.email = "aaa@aaa.aaa";
		work03.hobby = "java";
		
		// 28. 26번에서 만들어진 클래스 객체 변수를 이용해서 27번에서 넣었던 주소 값을 함수를 이용해서 출력해주세요.
		
		System.out.println("주소 : " + work03.addr);
		
		// 29. 26번에서 만들어진 클래스 객체 변수를 이용해서 27번에서 넣었던 핸드폰번호 값을 함수를 이용해서 출력해주세요.
		
		System.out.println("번호 : " + work03.tel);
		
		// 30. 26번에서 만들어진 클래스 객체 변수를 이용해서 27번에서 넣었던 이메일 값을 함수를 이용해서 출력해주세요.
		
		System.out.println("메일 : " + work03.email);
		
		// 31. 26번에서 만들어진 클래스 객체 변수를 이용해서 27번에서 넣었던 취미 값을 함수를 이용해서 출력해주세요.
		
		System.out.println("취미 : " + work03.hobby);
		
		// 32. Homework03 클래스 객체를 인스턴스화 과정을 통해 인스턴스를 만들어주세요. (객체 생성)
		// 이때, 이름,나이를 입력받아 만들 수 있는 생성자를 이용하여 객체를 만들어주세요.
		
		
		
		Homework03 work04 = new Homework03("홍길동", 30);
		
		// 33. 만들어진  Homework03 클래스 객체 변수를 이용해서 성별을 저장할 수 있는 함수를 이용해 값을 저장해주세요.
		
		work04.gender = "남자";
		
		// 34. 32번에서 만들어진 클래스 객체 변수를 이용해서 이름, 나이, 성별 값을 함수를 이용해서 출력해주세요.
		System.out.println("-------------------------------------------");
		System.out.println("이름 : " + work04.name);
		System.out.println("나이 : " + work04.age);
		System.out.println("성별 : " + work04.gender);
		
		// 35. Homework03 클래스 객체를 인스턴스화 과정을 통해 인스턴스를 만들어주세요. (객체 생성)
		// 이때, 이름, 나이, 성별을 입력받아 만들 수 있는 생성자를 이용하여 객체를 만들어주세요.
		
		Homework03 work05 = new Homework03("김김김", 40, "남");
		
		// 36. 만들어진 Homework03 클래스 객체 변수를 이용해서 이름, 나이, 성별 값을 함수를 이용해서 출력해주세요.
		
		System.out.println("-------------------------------------------");
		System.out.println("이름 : " + work05.name);
		System.out.println("나이 : " + work05.age);
		System.out.println("성별 : " + work05.gender);		
		
		// 37. 35번에서 만들어진 클래스 객체 변수를 이용해서 이름을 홍길동으로 변경해주세요. (이름에 새로운 이름으로 저장)
		
		work05.name = "홍길동";
		
		// 38. 35번에서 만들어진 클래스 객체 변수를 이용해서 나이를 99로 변경해주세요. (나이에 새로운 나이로 저장)
		
		work05.age = 99;
		
		// 39. 35번에서 만들어진 클래스 객체 변수를 이용해서 성별을 반대 성별로 변경해주세요. (성별에 새로운 성별으로 저장)
		
		work05.gender = "여";
		
		// 40. 새롭게 변경된 이름, 나이, 성별을 함수를 이용해서 출력해주세요.
		
		System.out.println("-------------------------------------------");
		System.out.println("이름 : " + work05.name);
		System.out.println("나이 : " + work05.age);
		System.out.println("성별 : " + work05.gender);		
		
	}
}
