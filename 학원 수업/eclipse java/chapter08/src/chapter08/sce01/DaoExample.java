package chapter08.sce01;

public class DaoExample {

	public static void main(String[] args) {
		OracleDao od = new OracleDao();
		MysqlDao msd = new MysqlDao();
		
		od.insert();
		
		DataAccessObject dao = new OracleDao();		// �������̽��� ������ ������.
		dao.insert();
	}

}
