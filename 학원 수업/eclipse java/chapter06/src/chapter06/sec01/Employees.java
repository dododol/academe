package chapter06.sec01;
//���� 3] �����ȣ(int Ÿ���� ����), �����, ��ȭ��ȣ�� ������ ���Ŭ����(Employees)
//�� �ۼ��Ͻÿ�. ����� ������� ��� ���
public class Employees {

		int empId;
		String empName;
		String telNum;
		
		public void showEmpInfo() {
			System.out.println("-----------------------");
			System.out.println(" �����ȣ     �����     ��ȭ��ȣ   ");
			System.out.println("-----------------------");
			System.out.printf("%6d  %4s  %15s",empId,empName,telNum);		//%6d = 6ĭ �ڿ������� ���µ� ����, %4s = 4ĭ �ڿ������� ���µ� ����
		}
		
		

	}

