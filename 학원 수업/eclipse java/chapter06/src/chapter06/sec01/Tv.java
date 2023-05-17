package chapter06.sec01;

public class Tv {
	private String maker;
	private int year;
	private int size;
	
	// 제조회사
	public void setMaker(String maker) {
		this.maker = maker;
	}
	// 생산년도
	public void setYear(int year) {
		this.year = year;
	}
	// 크기
	public void setSize(int size) {
		this.size = size;
	}

	public void show() {
		System.out.println("------------------------------");
		System.out.println(" maker     year     size");
		System.out.println("------------------------------");
		System.out.printf("%6s    %6d    %6d",maker,year,size);
	}

}

/*
문제 5] main메소드를 실행시켰을때 제조회사, 생산년도, 크기를 출력하는 Tv클래스를 작성하시오.
문제 6] 세과목의 점수를 입력받아 총점과 평균을 출력하는 Grade 클래스 생성 ( 배열사용하면 간단해짐)
문제 7] 입급(deposit),출금(withdraw),잔고확인(getbalance)을 수행하는 계좌클래스(Account)를 생성하시오.

입금처리 메소드 - 넣는돈 + 잔고(반환값 없음)
출금처리 메소드 - 사용자가 출금 입력하면 잔고 확인부터 함(찾는돈>=잔고) 후에 돈 사용자한테(반환값 있음)
잔고 처리하는 메소드 - 반환값 있음

계좌 클래스가 가져야할 기본정보 : 소유주(이름), 잔고

*/