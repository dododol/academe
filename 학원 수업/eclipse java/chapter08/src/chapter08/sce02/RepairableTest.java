package chapter08.sce02;

public class RepairableTest {
	
	public static void main(String[] args) {
		Tank t = new Tank();
		MARINE m = new MARINE();
		DropShip d = new DropShip();
		SCV scv = new SCV();
		
		scv.repair(t);
		scv.repair(d);
		scv.repair(m);
	}

}
