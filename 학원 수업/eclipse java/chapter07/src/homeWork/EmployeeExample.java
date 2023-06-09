package homeWork;

public class EmployeeExample {

	public static void main(String[] args) {
		// 1. 직원 정보 관리를 위한 객체를 생성할 때 반드시 사번, 이름, 부서, 직급의 정보가 있어야 한다.
		Employee ss = new Employee(0, "김직원", "", "",25,"");	// 객체생성(사번, 이름, 부서, 직급은 N.N 나머지는 Null가능
		
		
		System.out.println(ss.getName());	// 생성된 객체 직원 호출 
		
		// 2. 생성된 직원의 연봉을 설정할 수 있다.
		ss.setSal(40000000);		// set메소드로 private 멤버변수 Sal에 연봉 4000만원 입력

		System.out.println("연봉" + ss.getSal() + "원");		// 입력한 연봉 출력
		
		System.out.println(ss.sil());			// 8%세금 제외 후 실수령액 출력
		
		//4000만원의 2.5% 인상은 4100만원
		System.out.println(ss.updown(42000000));	// 2.5% 보다 높이 요구했기에 협상결렬. 현재연봉 유지 
		
		System.out.println(ss.updown(40500000));	// 2.5% 내로 연봉협상 타결.

	}

}
