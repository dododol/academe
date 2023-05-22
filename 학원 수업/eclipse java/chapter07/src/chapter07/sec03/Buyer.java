package chapter07.sec03;

import java.util.ArrayList;
import java.util.Arrays;

public class Buyer {
	int money;
	int bonusPoint;
	ArrayList<Product> cart = new ArrayList<Product>();
	int i = 0;	// cart배열의 index
	

	
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
		int sum = 0;	// 구매금액합계
		String list = "";	// 구매목록
		

	
		for(Product p : cart) {
			if(cart.get(i) != null) {
			sum=sum+cart.get(i).price;
			bonusPoint += cart.get(i).bonusPoint;
			list += cart.get(i).toString() + ", ";
			}
		}
		System.out.println("구매목록: " + list);
		System.out.println("구매금액 합계 : " + sum);
		System.out.println("지급보너스포인트 : " + bonusPoint);
	
	}
	
/*	void buy(Computer c) {
		money = money - c.price;
		bonusPoint += c.bonusPoint;
		System.out.println(c + "를 구입했습니다");
	}
	
	void buy(SmartPhone s) {
		money = money - s.price;
		bonusPoint += s.bonusPoint;
		System.out.println(s + "를 구입했습니다");
	}
	*/
	

}

