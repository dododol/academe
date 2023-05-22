package chapter07.sec03;

import java.util.ArrayList;
import java.util.Arrays;

public class Buyer {
	int money;
	int bonusPoint;
	ArrayList<Product> cart = new ArrayList<Product>();
	int i = 0;	// cart�迭�� index
	

	
	Buyer() {
		money = 5000;
		bonusPoint = 0;
	}
	
	void buy(Product p) {
		money = money - p.price;
		bonusPoint += p.bonusPoint;
		cart.add(p);
	}
	
	void summary() {
		int sum = 0;	// ���űݾ��հ�
		String list = "";	// ���Ÿ��
		

	
		for(Product p : cart) {
			if(cart.get(i) != null) {
			sum=sum+cart.get(i).price;
			bonusPoint += cart.get(i).bonusPoint;
			list += cart.get(i).toString() + ", ";
			}
		}
		System.out.println("���Ÿ��: " + list);
		System.out.println("���űݾ� �հ� : " + sum);
		System.out.println("���޺��ʽ�����Ʈ : " + bonusPoint);
	
	}
	
/*	void buy(Computer c) {
		money = money - c.price;
		bonusPoint += c.bonusPoint;
		System.out.println(c + "�� �����߽��ϴ�");
	}
	
	void buy(SmartPhone s) {
		money = money - s.price;
		bonusPoint += s.bonusPoint;
		System.out.println(s + "�� �����߽��ϴ�");
	}
	*/
	

}

