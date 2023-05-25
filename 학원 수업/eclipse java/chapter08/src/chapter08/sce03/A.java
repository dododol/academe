package chapter08.sce03;

interface I {
	public void methodB();
}

public class A {	// 사용자
	
	public void methodA (I i) {
		i.methodB();
	}

}

class B implements I {	// 제공자
	@Override
	public void methodB () {
		System.out.println("methodB()");
	}
}