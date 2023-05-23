package chapter06.sec08;

public class DriverExample {

	public static void main(String[] args) {
		
		new DriverExample().controller();
		
	}

	public void controller() {
		Driver driver = new Driver();
		
		Taxi taxi = new Taxi();
		driver.drive(taxi);
		driver.drive(new Bus(15));
		
	}
	
}
