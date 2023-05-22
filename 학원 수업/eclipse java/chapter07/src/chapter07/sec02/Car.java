package chapter07.sec02;

public class Car {

	public static void main(String[] args) {
		Car01 c1 = new FireEngine();	//upcasting
		
		System.out.println("c1.color=" + c1.color);

		c1.drive();
		c1.stop();
//		c1.water();
		FireEngine fe = null;
		if(c1 instanceof FireEngine) {
			fe = (FireEngine) c1;
		}
		fe.water();
		System.out.println("fe.color=" + fe.color);
	}

}

class Car01 {
	String color = "blue";
	int door;
	
	public void drive() {
		System.out.println("차가 운행 중입니다.");
	}
	
	public void stop() {
		System.out.println("차가 멈췄습니다.");
	}
}