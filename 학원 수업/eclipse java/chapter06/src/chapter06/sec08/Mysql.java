package chapter06.sec08;

public class Mysql extends DataAccessObject {

	@Override
	public void update() {
		StringBuffer sb = new StringBuffer();
		sb.append("UPDATE CART \n");
		sb.append("   SET CART_QTY = 10 \n");
		sb.append("  WHERE CART_NO = ? " );
		String sql = sb.toString();
		System.out.println(sql);
		System.out.println("MySql������ ���� query");
	}
	
	@Override
	public void select() {
		String sql = "SELECT * FROM CART";
		System.out.println(sql);
		System.out.println(" my sql ������ �˻� query");
	}
	
	
}
