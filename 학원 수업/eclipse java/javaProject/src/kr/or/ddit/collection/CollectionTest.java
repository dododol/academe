package kr.or.ddit.collection;


import java.util.ArrayList;
import java.util.List;

public class CollectionTest {

	public static void main(String[] args) {

		/*
		 * �÷��� �����ӿ�ũ
		 * 
		 * �θ� �˷��� �ִ� �ڷᱸ���� ����ؼ� ��ü���� ȿ�������� �߰�, ����, �˻��� �� �ֵ���
		 * �������̽��� ���� Ŭ������  java.util ��Ű������  �����Ѵ�.
		 * �̵��� ��Ī�ؼ� �÷��� �����ӿ�ũ��� �Ѵ�.
		 * 
		 * �÷��� �����ӿ�ũ�� �ֿ� �������̽��� List, Set, Map�̤� �ִ�.
		 * �̷��� �������̽� List, Set, Map�� ��� ������ �÷��� Ŭ������ �ִ�.
		 * 
		 * List
		   * > ��ArrayList 1 or 2
		 * > Vector
		 * > LinkedList
		 * 
		 * Set 
		   * > ��HashSet3
		 * > TreeSet
		 * 
		 * Map
		   * > ��HashMap 1 or 2
		 * > HashTable
		 * > TreeMap
		 * > Properties
		 * 
		 * �������̽� = ������(�ؾ����� ���). �Լ��� ����
		 * 
		 * 1. List(���� Ű���� : �⼮��)
		 * 
		 * (ex: �⼮��. ������ �ְ� ���� �ߺ� �����ϴ�.)
		 * List  �÷����� �迭�� ����ϰ� ��ü�� �ε����� �����Ѵ�.
		 * �迭���� �������� ����뷮�� �ڵ����� ����, ��ü�� ������ �� �ڵ����� �ε����� �ο��ȴ�.
		 * �߰�, ����, �˻��� ���� �޼ҵ尡 �����Ѵ�.
		 *
		 * 1) ArrayList�� �� <���׸�Ÿ��>�� �־���Ѵ�.
		 * index 0������ �������� �׾ư����Ѵ�.
		 * �ʱ� default ���� ���̴� 10���̴�.
		 */
		List list = new ArrayList();
		System.out.println("list.size : " + list.size());
		
		System.out.println();
		
		// List�� ������ �߰�
		// ������ �߰��� add() ��� �Լ��� �̿��Ѵ�.
		list.add(1);
		list.add("STR");
		list.add(true);
		for (int i = 0; i < list.size(); i++) {
			// List�� �����͸� ���(���� ���ö�)
			// get() �Լ��� �̿��Ͽ� ���� ����� �� �ִ�.(�����ö�)
			
			System.out.println(list.get(i));
		}
		
		
		list.add(1, 10);
		for (int i = 0; i < list.size(); i++) {
			// List�� �����͸� ���(���� ���ö�)
			// get() �Լ��� �̿��Ͽ� ���� ����� �� �ִ�.(�����ö�)
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		
		list.set(1,  "10�� ����");
		for (int i = 0; i < list.size(); i++) {
			// List�� �����͸� ���(���� ���ö�)
			// get() �Լ��� �̿��Ͽ� ���� ����� �� �ִ�.(�����ö�)
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		// �����͸� ������ �� ���
		list.remove(1);
		list.remove(true);
		for (int i = 0; i < list.size(); i++) {
			// List�� �����͸� ���(���� ���ö�)
			// get() �Լ��� �̿��Ͽ� ���� ����� �� �ִ�.(�����ö�)
			System.out.println(list.get(i));
		}
	}

}
