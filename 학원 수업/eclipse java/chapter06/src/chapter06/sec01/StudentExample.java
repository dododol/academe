package chapter06.sec01;

public class StudentExample {

	public static void main(String[] args) {
//		Student s1 = new Student();
//		s1.setStdID(1001);
//		s1.setStdName("�̼���");
//		
//		s1.showInfo();
//		System.out.println(s1);
		
		Student s2 = new Student(1002,"ȫ���");
		System.out.println(s2);

	}

}


class Student{
	private long stdID;
	private String stdName;						// ������� : Ŭ������ �Ӽ��� �������� �� ���
												// ��������� �޽��� �ۿ��� ����� ������. �޼ҵ� �ȿ��� ����� ������ ��������.
	public Student() {}							// private : �ۿ��� ���� �Ұ�.������ Ŭ���� �ȿ����� ������ ȣ�� ����. 
	public Student(long stdID,String stdName) {	// private �ʱ�ȭ��Ű�� ��� 1)�����ڸ޼ҵ� �̿�
		this.stdID = stdID;						
		this.stdName = stdName;
	}											// private �����ϱ� ���ؼ��� : getter setter �̿�	
												// ����ڰ� ������ �޼ҵ带 ���� Ŭ������ �ʱ�ȭ���Ѿ� ������ ����. �ȸ���� ���α׷��� �ڵ����� �����
	public void setStdID(long stdID)
	{
		this.stdID = stdID;
	}
	
	public void setStdName(String stdName)
	{
		this.stdName = stdName;
	}
	
	public void showInfo() {
		System.out.println("�й� : " + stdID);
		System.out.println("�̸� : " + stdName);
	}
	
	@Override
	public String toString() {		// �� ������ �ѱ��ڵ� �޶����� �ȵ�. ������ public���� Ÿ�԰� ��ȯ
		return "�й� : " + stdID + "\n�̸� : " + stdName;
		
	}
												

}
//Ư������ �������� - this : �ڱ� Ŭ������ �ּ�(��������), super : �θ��� �ּ�(��������)
//set �޼ҵ�� ��ȯ���� ���� �Ű������� �ִ�. get�޼ҵ�� ��ȯ���� �ְ� �Ű������� ����