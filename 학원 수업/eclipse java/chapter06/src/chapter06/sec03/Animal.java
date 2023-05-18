package chapter06.sec03;

public class Animal {
	private String kind;
	
	Animal() {		//기본생성자
		this("호랑이");	//매개변수 호랑이를 입력. -> 호랑이 값이 kind로 들어감. 그 kind 값을 this.kind로 이동	 7행 -> 10행 -> 4행	
						//매개변수가 소멸되기 전에 맴버변수로 이동해서 값을 보존시켜준다.
		
	}	
	Animal(String kind) {
		this.kind = kind;
	}
	
	public void setKind(String kind) { 		//setter(setting할때 값을 입력해야하니) 매개변수 ㅇ 반환 x 	getter(값을 가져오는거니) 매개변수 x 반환 o
		this.kind = kind;
	}
	
	public String getKind() {	// 특정값만 반환할때는 getter,  클래스자체를 반환할때는 toString()
		return kind;			// 매개값이 없고 반환해야하니 return을 반드시 작성
	}
}


//예제] 동물의 종류(king)를 보관하는 멤버 필드가 있는 동물클래스(Animal)를
//	생성하고, 생성자메소드를 통한 동물의 종류 설정과 동물의 종류를 변결
//	할 수 있는 메소드 및 종류를 반환하는 메소드 작성