package chapter07.sec05;

public abstract class Unit {	

	int x;
	int y;
	String nm;
	
	Unit(String nm){	// �����ڸ޼ҵ� = ������� �ʱ�ȭ
		this.nm = nm;
	}
	
	public void stop(String nm, int x, int y) {
		System.out.println(nm + "�� (" + x + "," + y + ")�� ����ϴ�");
		
	}
	
	public abstract void move(int x, int y);
}

class Marine extends Unit {
	Marine() {
		super("�غ�");			// �θ�Ŭ������ �θ� �� super ���
	}
	
	@Override
	public void move(int x, int y) {
		System.out.println(nm + "�� (" + x + "," + y + ") ��ġ�� �̵��մϴ�.");
	}
	
	public void stimPack() {
		System.out.println("���ݸ�� : ������ ����");
	}
}

class Tank extends Unit{
	Tank() {
		super("��ũ");
	}

	@Override
	public void move(int x, int y) {
		System.out.println(nm + "�� (" + x + "," + y + ") ��ġ�� �̵��մϴ�.");
	}
	
	public void sizeMode() {
		System.out.println("���ݸ�� : ������� ��ȯ");
	}
}