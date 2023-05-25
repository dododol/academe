package chapter08.sce01;

public class DaoExample {

	public static void main(String[] args) {
		OracleDao od = new OracleDao();
		MysqlDao msd = new MysqlDao();
		
		od.insert();
		
		DataAccessObject dao = new OracleDao();		// 인터페이스도 다형성 지원함.
		dao.insert();
	}

}
