package chapter07.sec03;

public class HiMart {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv());		
		b.buy(new Computer());		
		b.buy(new Tv());
		b.summary();


	}

}
