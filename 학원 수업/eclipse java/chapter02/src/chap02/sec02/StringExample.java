package chap02.sec02;

public class StringExample {
	public static void main(String[] args) {
		// String : 문자열 처리 객체
		//          " "로 묶인 리터럴 처리
		//          "+"연산자는 두 문자열을 결합시킬때 사용
		// **객체들에 대한 동등연산자(==)는 주소값을 비교하며
		//   내용비교는 .equals()메소드를 사용해야 한다.
		
		
		String name1 = "이순신";
		String name2 = "이순신";
		
		String name3 = new String("이순신");
		String name4 = new String("이순신");
		
		System.out.println(name1 == name2);
		System.out.println(name3 == name4);
		
		System.out.println(name3.toString());
		
		Person p1 = new Person("이순신");
		System.out.println("p1="+p1.toString());
		
	}

}

	class Person{
		String name;
		
		Person(String name) {
			this.name = name;
		}
		
		@Override
		public String toString() {
			return name;
		}
	}