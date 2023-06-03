package Study05_06;

public class ProductMain {
	public static void main(String[] args) {
		/*
		 * 문제)
		 * 
		 * Product 클래스를 이용하여 상품 3개를 만들어주세요.
		 * - notebook, phone, tablet 을 만들어주세요.
		 * - 상품 3개를 만들고 아래와 같이 출력해주세요.
		 * 	 > 출력은 Product 클래스 내 함수를 이용해주세요.
		 * 
		 * [notebook]
		 * 상품ID : P001
		 * 상품명 : 대덕노트북
		 * 가격 : 150000
		 * 재고수 : 100
		 * 
		 * [phone]
		 * 상품ID : P002
		 * 상품명 : 대덕핸드폰
		 * 가격 : 110000
		 * 재고수 : 100
		 * 
		 * [tablet]
		 * 상품ID : P003
		 * 상품명 : 대덕테블릿
		 * 가격 : 70000
		 * 재고수 : 100
		 */

//		Product notebook = new Product("P001","대덕노트북",150000,100);
		
//		System.out.println("[notebook]" + notebook);
		
		Product notebook = new Product("P001","대덕노트북");
		notebook.setprice(150000);
		notebook.setstock(100);
		
		System.out.println("[notebook]");
		System.out.println("상품ID : " + notebook.getid());
		System.out.println("상품ID : " + notebook.getname());
		System.out.println("상품ID : " + notebook.getprice());
		System.out.println("상품ID : " + notebook.getstock());
		
	
	
	}

}
