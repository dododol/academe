//Collection 객체
// -List, Set, Map으로 분류
// 1) List : 선형구조(1차원 배열 구조)
//		- 첨자(index)를 사용하며 중복을 허용하여 자료 저장
//		- 객체만 저장함
//		- List는 interface 이고 이를 구현한 객체가 arrayList, Vector, Stack,
//		  LinkedList, Queue 등이 제공됨
//		- ArrayList : 가장 널리 사용됨
//		- 주요메소드 :
//		  (1) add(Object obj) : ArrayList에 저장. 데이터 삽입
//		  (2) get(int idx) : ArrayList index번째 저장된 자료 반환
//		  (3) boolean contains(Object obj) : ArrayList에 obj가 있는지 여부 반환
//		  (4) boolean isEmpty() : ArrayList가 비어 있는지 여부를 반환
//		  (5) void clear() : 모든 객체 삭제
//		  (6) E remove(int idx) : idx번째 객체 삭제
//		  (7) boolean remove(Object obj) : obj 객체를 찾아서 삭제
//		  (8) int size() : ArrayList에 존재하는 객체의 수 반환

package chapter11.sec02;

import java.util.ArrayList;
import java.util.Iterator;

public class ArryaListExample01 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		Person p1 = new Person("이성계");
		
		list.add("홍길동");
		list.add(100);
		list.add(false);
		list.add(p1);
		list.add(new Person("정몽주"));

		System.out.println(list);
		System.out.println("일반for문");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("[[기능이 향상된 for문]]");
		for(Object obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("[[반복자(Iterator) 사용]]");
		Iterator iter = list.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
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