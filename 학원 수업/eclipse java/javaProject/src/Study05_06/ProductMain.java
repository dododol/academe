package Study05_06;

public class ProductMain {
	public static void main(String[] args) {
		/*
		 * ����)
		 * 
		 * Product Ŭ������ �̿��Ͽ� ��ǰ 3���� ������ּ���.
		 * - notebook, phone, tablet �� ������ּ���.
		 * - ��ǰ 3���� ����� �Ʒ��� ���� ������ּ���.
		 * 	 > ����� Product Ŭ���� �� �Լ��� �̿����ּ���.
		 * 
		 * [notebook]
		 * ��ǰID : P001
		 * ��ǰ�� : �����Ʈ��
		 * ���� : 150000
		 * ���� : 100
		 * 
		 * [phone]
		 * ��ǰID : P002
		 * ��ǰ�� : ����ڵ���
		 * ���� : 110000
		 * ���� : 100
		 * 
		 * [tablet]
		 * ��ǰID : P003
		 * ��ǰ�� : ����׺�
		 * ���� : 70000
		 * ���� : 100
		 */

//		Product notebook = new Product("P001","�����Ʈ��",150000,100);
		
//		System.out.println("[notebook]" + notebook);
		
		Product notebook = new Product("P001","�����Ʈ��");
		notebook.setprice(150000);
		notebook.setstock(100);
		
		System.out.println("[notebook]");
		System.out.println("��ǰID : " + notebook.getid());
		System.out.println("��ǰID : " + notebook.getname());
		System.out.println("��ǰID : " + notebook.getprice());
		System.out.println("��ǰID : " + notebook.getstock());
		
	
	
	}

}
