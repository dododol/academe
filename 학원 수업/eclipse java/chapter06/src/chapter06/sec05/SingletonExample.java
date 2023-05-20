package chapter06.sec05;

public class SingletonExample {

	public static void main(String[] args) {
		// Account ac = new Account();    private로 설정했기때문에 이렇게 쓰면 안됨
		Account ac1 = Account.getInstance();	//getInstance -> static에 public임 -> 객체를 생성하지 않아도 불러다 쓸 수 있음
		Account ac2 = Account.getInstance();
		Account ac3 = Account.getInstance();
		System.out.println("ac1=" + ac1);
		System.out.println("ac2=" + ac2);
		System.out.println("ac3=" + ac3);

	}

}
