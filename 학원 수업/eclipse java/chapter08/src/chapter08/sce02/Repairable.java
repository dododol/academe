package chapter08.sce02;

public interface Repairable {}

class Unit {
	int hitpoint;
	final int MAX_HP;
	
	Unit(int hp) {
		MAX_HP = hp;
	}
}

class GroundUnit extends Unit {
	GroundUnit(int hp){
		super(hp);
	}
}

class AirUnit extends Unit {
	AirUnit(int hp) {
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable {
	Tank() {
		super(150);
	}
	
	@Override
	public String toString() {
		return "TANK";
	}
}

class SCV extends GroundUnit implements Repairable {
	SCV() {
		super(50);
	}
	
	@Override
	public String toString() {
		return "SCV";
	}
	
	public void repair(Repairable r) {
		if(r instanceof Unit) {
			Unit uu = (Unit)r;
			while(uu.hitpoint != uu.MAX_HP)
				uu.hitpoint++;
		}
		System.out.println(uu.toString() + "�� ������ �������ϴ�.");
	}
}

class MARINE extends GroundUnit implements Repairable {
	MARINE() {
		super(100);
	}
	
	@Override
	public String toString() {
		return "MARINE";
	}
}


class DropShip extends GroundUnit implements Repairable {
	DropShip() {
		super(200);
	}
	
	@Override
	public String toString() {
		return "DropShip";
	}
}

