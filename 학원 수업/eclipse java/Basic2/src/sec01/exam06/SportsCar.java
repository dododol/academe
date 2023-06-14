package sec01.exam06;

public class SportsCar extends Car {

	@Override
	public void speedUp() { speed += 10; }
	
	@Override
	public void stop() {					// 부모메서드가 final이기 때문에 재정의 불가능
		System.out.println("스포츠카를 멈춤");	
		speed = 0;
	}
}
