package chapter06.sec07;

public class IngeritanceExample {

	public static void main(String[] args) {
		Child c1 =new Child("남성","홍길동",45);
		System.out.println("이름 : " + c1.getName());
		System.out.println("나이 : " + c1.getAge());
	}	// 부모의 이름 자식의 나이, 파란글씨가 상속 받았다는 뜻.

}
