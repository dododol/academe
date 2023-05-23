package chapter06.sec08;

public class DataAccessObject {

	final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	final String USER = "sem";
	final String PASSWD = "java";
	
	public void select() {
		String sql = "select * from cart";
		System.out.println(sql);
		System.out.println("데이터 검색 query");
	}

	public void insert() {
		String sql = "insert into cart values(?,?,?,?)";
		System.out.println(sql);
		System.out.println("데이터 삽입 query");
	}

	public void update() {
		System.out.println("데이터 갱신 query");
	}
	
	public void delete() {
		System.out.println("데이터 삭제 query");
	}
	
	

}
