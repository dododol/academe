package chapter08.sce01;

public interface DataAccessObject {

	public void select();
	public void insert();
	public void update();
	public void delete();	// public 뒤에 abstract 자동으로 생성되어짐. 직접 기입해도 상관 없음.
}
