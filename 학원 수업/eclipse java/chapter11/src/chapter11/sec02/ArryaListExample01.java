//Collection ��ü
// -List, Set, Map���� �з�
// 1) List : ��������(1���� �迭 ����)
//		- ÷��(index)�� ����ϸ� �ߺ��� ����Ͽ� �ڷ� ����
//		- ��ü�� ������
//		- List�� interface �̰� �̸� ������ ��ü�� arrayList, Vector, Stack,
//		  LinkedList, Queue ���� ������
//		- ArrayList : ���� �θ� ����
//		- �ֿ�޼ҵ� :
//		  (1) add(Object obj) : ArrayList�� ����. ������ ����
//		  (2) get(int idx) : ArrayList index��° ����� �ڷ� ��ȯ
//		  (3) boolean contains(Object obj) : ArrayList�� obj�� �ִ��� ���� ��ȯ
//		  (4) boolean isEmpty() : ArrayList�� ��� �ִ��� ���θ� ��ȯ
//		  (5) void clear() : ��� ��ü ����
//		  (6) E remove(int idx) : idx��° ��ü ����
//		  (7) boolean remove(Object obj) : obj ��ü�� ã�Ƽ� ����
//		  (8) int size() : ArrayList�� �����ϴ� ��ü�� �� ��ȯ

package chapter11.sec02;

import java.util.ArrayList;
import java.util.Iterator;

public class ArryaListExample01 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		Person p1 = new Person("�̼���");
		
		list.add("ȫ�浿");
		list.add(100);
		list.add(false);
		list.add(p1);
		list.add(new Person("������"));

		System.out.println(list);
		System.out.println("�Ϲ�for��");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("[[����� ���� for��]]");
		for(Object obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("[[�ݺ���(Iterator) ���]]");
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