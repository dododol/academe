package chapter06.sec03;

public class Animal {
	private String kind;
	
	Animal() {		//�⺻������
		this("ȣ����");	//�Ű����� ȣ���̸� �Է�. -> ȣ���� ���� kind�� ��. �� kind ���� this.kind�� �̵�	 7�� -> 10�� -> 4��	
						//�Ű������� �Ҹ�Ǳ� ���� �ɹ������� �̵��ؼ� ���� ���������ش�.
		
	}	
	Animal(String kind) {
		this.kind = kind;
	}
	
	public void setKind(String kind) { 		//setter(setting�Ҷ� ���� �Է��ؾ��ϴ�) �Ű����� �� ��ȯ x 	getter(���� �������°Ŵ�) �Ű����� x ��ȯ o
		this.kind = kind;
	}
	
	public String getKind() {	// Ư������ ��ȯ�Ҷ��� getter,  Ŭ������ü�� ��ȯ�Ҷ��� toString()
		return kind;			// �Ű����� ���� ��ȯ�ؾ��ϴ� return�� �ݵ�� �ۼ�
	}
}


//����] ������ ����(king)�� �����ϴ� ��� �ʵ尡 �ִ� ����Ŭ����(Animal)��
//	�����ϰ�, �����ڸ޼ҵ带 ���� ������ ���� ������ ������ ������ ����
//	�� �� �ִ� �޼ҵ� �� ������ ��ȯ�ϴ� �޼ҵ� �ۼ�