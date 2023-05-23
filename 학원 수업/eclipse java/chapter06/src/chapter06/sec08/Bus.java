package chapter06.sec08;

public class Bus extends Vehicle{
	int passenger;
	
	Bus(int passenger){
		this.passenger=passenger;
	}
	
	@Override
	public void run() {
		System.out.println("승객 " + passenger + "명을 태운 버스가 운행중입니다.");
	}

}
