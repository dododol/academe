package homeWork;

public class EmployeeExample {

	public static void main(String[] args) {
		// 1. ���� ���� ������ ���� ��ü�� ������ �� �ݵ�� ���, �̸�, �μ�, ������ ������ �־�� �Ѵ�.
		Employee ss = new Employee(0, "������", "", "",25,"");	// ��ü����(���, �̸�, �μ�, ������ N.N �������� Null����
		
		
		System.out.println(ss.getName());	// ������ ��ü ���� ȣ�� 
		
		// 2. ������ ������ ������ ������ �� �ִ�.
		ss.setSal(40000000);		// set�޼ҵ�� private ������� Sal�� ���� 4000���� �Է�

		System.out.println("����" + ss.getSal() + "��");		// �Է��� ���� ���
		
		System.out.println(ss.sil());			// 8%���� ���� �� �Ǽ��ɾ� ���
		
		//4000������ 2.5% �λ��� 4100����
		System.out.println(ss.updown(42000000));	// 2.5% ���� ���� �䱸�߱⿡ ������. ���翬�� ���� 
		
		System.out.println(ss.updown(40500000));	// 2.5% ���� �������� Ÿ��.

	}

}
