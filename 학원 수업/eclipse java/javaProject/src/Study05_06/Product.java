package Study05_06;

public class Product {
	/*
	 * 문제 1)
	 * 
	 * 필드를 만들어주세요
	 * - 문자열 타입의 id			// 상품ID
	 * - 문자열 타입의 name		// 상품명
	 * - 정수형 타입의 price		// 가격
	 * - 정수형 타입의 stock		// 재고수
	 * 
	 * 생성자를 만들어주세요.
	 * - 기본생성자를 만들어주세요
	 * - 상품 ID와 상품명을 받는 Custom 생성자를 만들어주세요.
	 * 
	 * 함수를 만들어주세요.
	 * - 상품ID를 가져오는 함수를 만들어주세요 (getId)
	 * - 상품 ID를 저장할 함수를 만들어주세요(setId)
	 * - 상품명을 가져오는 함수를 만들어주세요(getName)
	 * - 상품명을 저장할 함수를 만들어 주세요(setName)
	 * - 가격을 가져오는 함수를 만들어주세요(getPrice)
	 * - 가격을 저장할 함수를 만들어주세요(setPrice)
	 * - 재고수를 가져오는 함수를 만들어주세요(getStock)
	 * - 재고수를 저장할 함수를 만들어주세요(setStock)
	 */
	
	String id;
	String name;
	int price;
	int stock;
	
	public Product() {}
	
	public Product(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public Product(String id, String name, int price, int stock) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	public String getid() {
		return id;
	}
	
	public void setid(String id) {
		this.id = id;
	}
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public int getprice() {
		return price;
	}
	
	public void setprice(int price) {
		this.price = price;
	}
	
	public int getstock() {
		return stock;
	}
	
	public void setstock(int stock) {
		this.stock = stock;
	}
	
	
}
