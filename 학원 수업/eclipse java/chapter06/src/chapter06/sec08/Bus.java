package chapter06.sec08;

public class Bus extends Vehicle{
	int passenger;
	
	Bus(int passenger){
		this.passenger=passenger;
	}
	
	@Override
	public void run() {
		System.out.println("�°� " + passenger + "���� �¿� ������ �������Դϴ�.");
	}

}
