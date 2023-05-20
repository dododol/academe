package chapter06.sec05;

public class Account {
	private static Account ac = null;		// static붙어서 정적
	private Account() {}
	
	public static Account getInstance() {		// getInstance 앞에 static 붙혀서 Account(반환타입)를 클래스타입으로 부름
		if (ac == null) ac = new Account();
		return ac;			// 여기까지 싱글턴 구성
	}
}


// account를 static 해줘서 메소드 에리어에 딱 하나만 만들어짐

