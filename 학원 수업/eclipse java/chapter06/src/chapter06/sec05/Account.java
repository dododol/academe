package chapter06.sec05;

public class Account {
	private static Account ac = null;		// static�پ ����
	private Account() {}
	
	public static Account getInstance() {		// getInstance �տ� static ������ Account(��ȯŸ��)�� Ŭ����Ÿ������ �θ�
		if (ac == null) ac = new Account();
		return ac;			// ������� �̱��� ����
	}
}


// account�� static ���༭ �޼ҵ� ����� �� �ϳ��� �������

