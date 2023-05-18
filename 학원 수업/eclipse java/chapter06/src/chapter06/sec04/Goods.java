package chapter06.sec04;

public class Goods {
	private String kind;
	private int price;
	
	Goods() {}
	Goods(String kind, int price) {
		this.kind = kind;
		this.price = price;
	}
	
	public String getKind() {
		return kind;
	}
	
	public int getPrice() {
		return price;
	}
}
