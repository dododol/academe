package chapter06.sec05;

public class ProductExample {

	public static void main(String[] args) {
//		�Ϲ� ������ �����Ǿ� �����Ϸ��� �� Ÿ������ ����Ǿ� �����������. �� ����߼Ҹ� ����� �����ڰ� new��������(heap�޸𸮿� ����)
		Product p1 = new Product("����");
		System.out.println(p1); // p1�ڿ� .toString �� �����Ǿ��ִ°�.
		
		Product p2 = new Product("���찳");
		System.out.println(p2);
		
		Product p3 = new Product("����Ʈ��");
		System.out.println(p3);
		
		System.out.println(p1);
		
	
	}

} //
// ��ǰ�ڵ�� 1001���� �ڵ������Ǿ� pid�� ����
class Product {
	static long pid = 1000;	// ��������� �ʱ�ȭ��Ű�� ������ �ڵ����� �ʱ�ȭ ��. �̰� �̴ϼȺ������ ��
	String pName;
	
	Product() {}
	Product(String pName) {
		pid++;
		this.pName = pName;
	}
	
	@Override
	public String toString() { // ������ public. ���� objectŬ������. Ŭ������ public�̱⿡ �ڽ�Ŭ���������� public���� ���� ����� �� ����.
	return"��ǰ��ȣ : " +pid+ "\n��ǰ�� : " + pName;						//getter to String ������ : - getter �ϳ��ϳ� ������ - toString �������� ��� ������
	}
}