package Study;

import java.util.Random;

public class Study04 {

	public static void main(String[] args) throws InterruptedException {
		/* �ݺ��� while �����غ���
		 * �ݺ���while���� �̿��Ͽ� 0-9������ ���ڸ� ���ʴ�� ����غ��ô�
		 */
		
		int a =0 ;
		while(a < 10) {
			System.out.println(a + " ");
			a++;
			
		}
		
		System.out.println();
		
		/* ���ѹݺ��Ǵ� while���� ���� �� �ִ�.
		 * while(true) : ���ѹݺ��� �����ϴ� while��
		 * ���ѹݺ��Ǵ� while�� �ȿ��� �������� ���� ����������
		 * 0-100������ %�޼����� ���� �ܼ�â�� ����� ��µǰ� 100%�϶� ������Ѻ��ô�
		 */

		while(true) {	// ������ �� �����̱� ������ �ݺ��� while�� ���ѹݺ��ȴ�.
			a++;
			if(a == 30) {
				System.out.println(a + "% �޼��߽��ϴ�!");
			}else if( a == 50) {
				System.out.println(a + "% �޼��߽��ϴ�!");
			}else if( a == 80) {
			System.out.println(a + "% �޼��߽��ϴ�!");
			}else if( a == 100) {
			System.out.println(a + "% �޼��߽��ϴ�!");
			System.out.println("���� �ݺ����� while���� �����մϴ�!");
			break;
			}
		}
	
		
		/* �ڵ��� ���͸� �ܷ��� ����, �ڵ��� ���°� ��µ˴ϴ�.
		 * �̶�, ���͸� �ܷ��� 10% �̸��϶��� �޼� �����Ⱑ ������ �Ǿ� ���͸� �ܷ��� 100%�� �˴ϴ�.
		 * ������, ���͸� �ܷ��� 0%�� �� ���� �ڵ����� ����˴ϴ�.
		 * 
		 * [���͸� �ܷ��� ���� ��� ���]
		 * �� ���͸� �ܷ��� 0%�϶� : [����] ���͸��� �����ϴ�. �ڵ����� �����մϴ�.
		 * �ܷ��� 10%�̻� 30%�̸� : [����] ���͸� ������ �ʿ��մϴ�!
		 * �ܷ��� 30%�̻� 50%�̸� : [����] ���͸��� ���ġ �ʽ��ϴ�!
		 * �ܷ��� 50%�̻� 80%�̸� : [����] ���͸��� ������ ��ƿ�� �մϴ�!
		 * �ܷ��� 80%�̻� 100%�̸� : [����] ���͸��� ����մϴ�!
		 * �ܷ��� 100%�϶� : [����] ���͸�Full����!
		 */
		
		int battery = 0;
		while(true) {	// ���ѹݺ�
			battery = new Random().nextInt(101);
			System.out.printf("[�ܷ�%d]", battery);
			
			if(battery >= 1 && battery < 10) {
				System.out.println("[����] �޼� ������ ����");
				for(int i = 0; i <10; i++) {
					Thread.sleep(200);
					System.out.print("��");
				}
			}else if(battery >= 10 && battery < 30) {
				System.out.println("[����] ���͸� ������ �ʿ��մϴ�!");
			}else if(battery >= 30 && battery < 50) {
				System.out.println("[����] ���͸��� ���ġ �ʽ��ϴ�!");
			}else if(battery >= 50 && battery < 80) {
				System.out.println("[����] ���͸��� ������ ��ƿ�� �մϴ�!");
			}else if(battery >= 80 && battery < 100) {
				System.out.println("[����] ���͸��� ���� ����մϴ�!");
			}else if(battery >= 100) {
				System.out.println("[����] ���͸� Full ����!");
			}
			
			if(battery == 0) {
				System.out.println("[����] ���͸��� �����ϴ�. �ڵ����� �����մϴ�!");
				break;
			}
			Thread.sleep(300);;
			System.out.println("��");
		}
		
	}

}
