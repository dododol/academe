package kr.or.ddit.collection;


import java.util.ArrayList;
import java.util.List;

public class CollectionTest {

	public static void main(String[] args) {

		/*
		 * 컬렉션 프레임워크
		 * 
		 * 널리 알려져 있는 자료구조를 사용해서 객체들을 효율적으로 추가, 삭제, 검색할 수 있도록
		 * 인터페이스와 구현 클래스를  java.util 패키지에서  제공한다.
		 * 이들을 총칭해서 컬렉션 프레임워크라고 한다.
		 * 
		 * 컬렉션 프레임워크의 주요 인터페이스는 List, Set, Map이ㅏ 있다.
		 * 이러한 인터페이스 List, Set, Map로 사용 가능한 컬렉션 클래스가 있다.
		 * 
		 * List
		   * > ★ArrayList 1 or 2
		 * > Vector
		 * > LinkedList
		 * 
		 * Set 
		   * > ★HashSet3
		 * > TreeSet
		 * 
		 * Map
		   * > ★HashMap 1 or 2
		 * > HashTable
		 * > TreeMap
		 * > Properties
		 * 
		 * 인터페이스 = 껍데기(붕어빵만드는 기계). 함수만 있음
		 * 
		 * 1. List(연관 키워드 : 출석부)
		 * 
		 * (ex: 출석부. 순서가 있고 값이 중복 가능하다.)
		 * List  컬렉션은 배열과 비슷하게 객체를 인덱스로 관리한다.
		 * 배열과의 차이점은 저장용량이 자동으로 증가, 객체를 저장할 때 자동으로 인덱스가 부여된다.
		 * 추가, 삭제, 검색을 위한 메소드가 존재한다.
		 *
		 * 1) ArrayList는 꼭 <제네릭타입>이 있어야한다.
		 * index 0번부터 차곡차곡 쌓아가야한다.
		 * 초기 default 공간 길이는 10개이다.
		 */
		List list = new ArrayList();
		System.out.println("list.size : " + list.size());
		
		System.out.println();
		
		// List에 데이터 추가
		// 데이터 추가는 add() 라는 함수를 이용한다.
		list.add(1);
		list.add("STR");
		list.add(true);
		for (int i = 0; i < list.size(); i++) {
			// List에 데이터를 출력(값을 얻어올때)
			// get() 함수를 이용하여 값을 출력할 수 있다.(꺼내올때)
			
			System.out.println(list.get(i));
		}
		
		
		list.add(1, 10);
		for (int i = 0; i < list.size(); i++) {
			// List에 데이터를 출력(값을 얻어올때)
			// get() 함수를 이용하여 값을 출력할 수 있다.(꺼내올때)
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		
		list.set(1,  "10을 수정");
		for (int i = 0; i < list.size(); i++) {
			// List에 데이터를 출력(값을 얻어올때)
			// get() 함수를 이용하여 값을 출력할 수 있다.(꺼내올때)
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		// 데이터를 삭제할 때 사용
		list.remove(1);
		list.remove(true);
		for (int i = 0; i < list.size(); i++) {
			// List에 데이터를 출력(값을 얻어올때)
			// get() 함수를 이용하여 값을 출력할 수 있다.(꺼내올때)
			System.out.println(list.get(i));
		}
	}

}
