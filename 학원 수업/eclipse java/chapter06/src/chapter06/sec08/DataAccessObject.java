package chapter06.sec08;

public class DataAccessObject {

	final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	final String USER = "sem";
	final String PASSWD = "java";
	
	public void select() {
		String sql = "select * from cart";
		System.out.println(sql);
		System.out.println("������ �˻� query");
	}

	public void insert() {
		String sql = "insert into cart values(?,?,?,?)";
		System.out.println(sql);
		System.out.println("������ ���� query");
	}

	public void update() {
		System.out.println("������ ���� query");
	}
	
	public void delete() {
		System.out.println("������ ���� query");
	}
	
	

}
