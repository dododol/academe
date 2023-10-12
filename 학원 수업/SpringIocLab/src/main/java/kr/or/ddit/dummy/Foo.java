package kr.or.ddit.dummy;

public class Foo {
//	private Bar bar = new Bar();
//	private Baz baz = new Baz();
	
//Foo는 팩토리랑 결합력이 있음
//	private Bar bar = BarFactory.getBar();

	//baz는 생성자만 통해서
	private Baz baz;
	
	//생성자
	public Foo(Baz baz, Bar bar) {
		super();
		this.baz = baz;
		this.bar = bar;
	}
	
//전략패턴(전략의 주입자가 필요하다(setter호출 = 주입자 : playGround)
	private Bar bar;
	
	public void setBar(Bar bar) {
		this.bar = bar;
	}

	@Override
	public String toString() {
		return "Foo [baz=" + baz + ", bar=" + bar + "]";
	}
	
	
	
}
