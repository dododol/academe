package chapter06.sec03;

public class CalculateExample {

	public static void main(String[] args) {
		Calculate c1 = new Calculate();
		int res1 = c1.add(100, 200);	// �Ű����� 2��, ù��° int �ι�°�� int. ���� ù��° �޼ҵ� ȣ���
		double res2 = c1.add(27.5, 50);	// �Ű����� 2��, ù��° double �ι�°�� int. ���� ����° �޼ҵ� ȣ���

	}

}

class Calculate {
	
	public int add(int a, int b) {	// ù��°
		return (a+b);
	}
	
	public double add(int a, double b) {	// �ι�°
		return (a+b);
	}
	
	public double add(double a, int b) {	// ����°
		return (a+b);
	}
	
	public float add(int a, float b) {		// �׹�°	
		//�װ��� �Ű������� �迭�� Ÿ���� �ٸ���. �����ε� ����
		return (a+b);
	}
	
}


//����] �� ���ڸ� �Է� �޾� ������ ����� ��ȯ�ϴ� �޼ҵ带 �ۼ��Ͻÿ�
//�� ������ Ÿ���� [int,int],[int,double][double,int],
//[int,float]�̴�.