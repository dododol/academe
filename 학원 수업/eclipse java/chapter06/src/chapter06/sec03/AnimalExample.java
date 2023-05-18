package chapter06.sec03;

public class AnimalExample {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		System.out.println(a1.getKind());
		
		a1.setKind("강아지");
		System.out.println(a1.getKind());
		
		Animal a2 = new Animal("고양이");
		System.out.println(a2.getKind());

	}

}


//예제] 동물의 종류(king)를 보관하는 멤버 필드가 있는 동물클래스(Animal)를
//	생성하고, 생성자메소드를 통한 동물의 종류 설정과 동물의 종류를 변결
//	할 수 있는 메소드 및 종류를 반환하는 메소드 작성