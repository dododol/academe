package chapter08.sce01;

public class OracleDao implements DataAccessObject{		// 전체를 재정의하지 않는다면 public과 class 사이에 abstract을 붙히면 오류해결됨.
	
	@Override
	public void select() {
		System.out.println("Oracle DB에서 데이터 검색");
	}
	
	@Override
	public void insert() {
		System.out.println("Oracle DB에서 자료삽입");
	}
	
	@Override
	public void update() {
		System.out.println("Oracle DB에서 자료갱신");
	}
	
	@Override
	public void delete() {
		System.out.println("Oracle DB에서 자료");
	}
	

}
