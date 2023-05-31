package chapter11.sec02;

import java.util.ArrayList;

public class ArrayListExample02 {

	public static void main(String[] args) {
		// 제네릭 : 컬렉션 프레임워크 객체에 저장되는 데이터를 제한함
		//		입력자료를 검사하여 오류를 최소화 시킴
		// 사용형식
		// 컬렉션객체 <타입> 변수 = new 컬렉션객체 <타입>();
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("대전시 중구 계룡로 846");
//		list.add(100);
//		list.add(new Person("정몽주"));
		
		ArrayList<Person> list1 = new ArrayList<Person>();

	}

}

