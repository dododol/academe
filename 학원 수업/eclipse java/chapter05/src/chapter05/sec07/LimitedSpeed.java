package chapter05.sec07;

public enum LimitedSpeed {
	
	School_Zone(30),
	Downtown(50),
	Contryside(70);
	
	private final int value;
	
	LimitedSpeed(int value) {
		this.value = value;
	}
	
	public int getValues() {
		return value;
	}

}
