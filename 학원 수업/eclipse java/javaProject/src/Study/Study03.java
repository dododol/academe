package Study;

public class Study03 {

	public static void main(String[] args) {
		/*
		 * 2. �ݺ���
		 * - �۾� ������ �ݺ������� ����ǵ��� �� �� ���
		 * 
		 * > �ݺ����� �����δ� for��, while���� �ֽ��ϴ�.
		 *  (do-while�� �⺻������ �� �Ⱦ��� ������ ����)
		 *  > for���� �ݺ� Ƚ���� �� �� �־�, Ƚ�� ��ŭ �ݺ����� ����˴ϴ�.
		 *  > while���� ������ ���� ��� �ݺ����� ����ǰ� ���� �ƴ� ������ �߻�������
		 *   while�� ����ȴ�.
		 */
		
		/* �ݺ��� for �����غ���
		 * �ݺ��� for ���� �̿��ؼ� 0-9������ ���ڸ� ���ʴ�� ����غ��ô�.
		 */
		for(int i=0; i<10; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// ¦���� Ȧ���� �������� ����غ��ô�
		// - Ȧ���϶��� '_'�� �ٿ��� ����غ��ô�
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 0) {	// ¦��
				System.out.print(i + " ");
			}else {				// Ȧ��
				System.out.print(i + "_ ");
			}
		}
		
		System.out.println();
		
		// ����1) �������� ����غ��ô�
		// [��¿���]
		// 1x1=1 1x2=2 1x3=3 ... 1x9=9
		// 2x1=2 2x2=4 2x3=6 ... 2x9=18
		// ...
		// 1�ܺ��� 9�ܱ����� �������� ����غ�����!
		// [��Ʈ] for���� ��ø���� ����ؼ� ��������!
		
	/*	for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.printf("\t"+i + "x" + j + "=" + (i*j));
			}
			System.out.println();
		}
			
		System.out.println();
*/
		
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.printf("\t" + j + "x" + i + "=" + (i*j));
			}
			
			System.out.println();

				}
				System.out.println();

				
				
				
				
				
		for(int i =0; i<10; i++) {
			if(i ==0) {
				for(int k = 1; k < 10; k++) {
					System.out.print("[" +k+"��]\t");
				}
				System.out.println();
			}else {
				for(int j =1; j<10; j++) {
					System.out.print(j+"x"+i+"="+(i*j)+"\t");
				}
				System.out.println();
			}
		}
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
			
		}
	
	
