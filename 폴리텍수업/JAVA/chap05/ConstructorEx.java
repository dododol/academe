package chap05;

public class ConstructorEx {
	 public static void main(String[] args) {
		C c = new C();
	}
}
class A {
	A(){
		super();
		System.out.println("생성자A");
	}
}

class B extends A {
	B(){
		super();
		System.out.println("생성자B");
	}
	
	B(int x){
		this();
		System.out.println(x + "값과 생성자 B");
	}
}

class C extends B {
	C(){
		super();
		System.out.println("생성자C");
	}
}

