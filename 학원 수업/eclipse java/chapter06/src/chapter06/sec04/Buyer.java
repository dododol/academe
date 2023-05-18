package chapter06.sec04;

public class Buyer {
	
	int sum =0;
	public int saleGoods(Goods goods, int amt) {
		sum = sum + (goods.getPrice()*amt);
		return sum;
		
	}

}
