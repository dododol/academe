package Study05_06;

public class Product {
	/*
	 * ���� 1)
	 * 
	 * �ʵ带 ������ּ���
	 * - ���ڿ� Ÿ���� id			// ��ǰID
	 * - ���ڿ� Ÿ���� name		// ��ǰ��
	 * - ������ Ÿ���� price		// ����
	 * - ������ Ÿ���� stock		// ����
	 * 
	 * �����ڸ� ������ּ���.
	 * - �⺻�����ڸ� ������ּ���
	 * - ��ǰ ID�� ��ǰ���� �޴� Custom �����ڸ� ������ּ���.
	 * 
	 * �Լ��� ������ּ���.
	 * - ��ǰID�� �������� �Լ��� ������ּ��� (getId)
	 * - ��ǰ ID�� ������ �Լ��� ������ּ���(setId)
	 * - ��ǰ���� �������� �Լ��� ������ּ���(getName)
	 * - ��ǰ���� ������ �Լ��� ����� �ּ���(setName)
	 * - ������ �������� �Լ��� ������ּ���(getPrice)
	 * - ������ ������ �Լ��� ������ּ���(setPrice)
	 * - ������ �������� �Լ��� ������ּ���(getStock)
	 * - ������ ������ �Լ��� ������ּ���(setStock)
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
