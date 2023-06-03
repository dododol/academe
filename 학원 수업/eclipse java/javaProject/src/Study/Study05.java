package Study;

import java.util.Arrays;

public class Study05 {

	public static void main(String[] args) {
		/*
		 * �迭�̶�?
		 * 
		 * - �迭�� ����Ÿ������, �л����� �̸�, ����, ���� ���� �� ���� �����͸�
		 * 	  ȿ�������� ���� �� �ִ� �����̴�.
		 * - �迭�� ���� Ÿ���� �����͵��� ���� index ��°�� ������ �迭�� ũ�⸸ŭ
		 * 	  ���� �� �ִ�.
		 * - �ѹ� ������ ũ���� �迭�� ũ�⸦ ������ �Ұ����ϴ�.
		 * - �迭�� ũ�⸦��ȸ�� ���� length���̿��Ѵ�.
		 * 
		 * 	1) �迭���� ���
		 * - int[] ������ = new int[ũ��]; ��� ���� 0���� �ʱ�ȭ �Ǿ��ִ�.
		 * - int[] ������ = new int[ũ��]; {1,2,3,4,5}; 
		 * - int[] ������ = {1,2,3,4,5};
		 * ** int �� ���� �ڷ����� ���� ����
		 */
		// �پ��� ������� �迭�� �����غ���
		int[] nums1 = new int[5];		// ������ Ÿ�� �迭�� ���� 5�� ����
		// ������ Ÿ�� �迭�� �� index �ڸ��� ������� 1,2,3,4,5�� ����
		int[] nums2 = new int[] {1,2,3,4,5};
		// ������ Ÿ�� �迭�� �� index �ڸ��� ������� 1,2,3,4,5�� ����
		int[] nums3 = {1,2,3,4,5};
		
		// �迭�� ���� ����غ��ô�.
		System.out.println("nums1 : " + Arrays.toString(nums1));
		System.out.println("nums1 : " + Arrays.toString(nums2));
		System.out.println("nums1 : " + Arrays.toString(nums3));
		
		// ���ѵ��� ������� �̸��� �迭�� �߰��غ��ô�.
		String[] names = {"���缮","�ڸ��","������","������","�ϵ���","��ȫö","�漺��"};
		System.out.println("names.length : " + names.length);
		System.out.println("names : " + Arrays.toString(names));
		// �迭�� ���� index�� 0�̴�.
		
		// ���ѵ��� ������� �츮 305ȣ �л����� �̸����� �ٲ㺾�ô�.
		// �ڽ��� �翷 �ڸ��� �ִ� ������ �̸��� �ٲ㺼�ǵ�, index 1,3,5��°��
		// �ش��ϴ� ��ġ�� �̸��� �����غ��ô�.
		/*
		names[1] = "������";
		names[3] = "����ȣ";
		names[5] = "��ö��";
		System.out.println("[����]names : " + Arrays.toString(names));
		*/
		// ����1) �츮�� 305ȣ �л� �̸� 5���� �迭�� �����ϰ� index�� ¦����°�� ���
		// �ִ� �̸��� ������ּ���
		/*
		String[] name305 = {"������","�輮ȣ","�ڹ���","���缺","Ȳ����"};
		for ( int i = 0; i < name305.length; i++) {
			if(i % 2 == 0) {
				System.out.print(name305[i] + " ");
			}
		}*/
		
		// System.out.println("305ȣ �л� 5�� :" + name305[2] + "," + name305[4]);
		
		
		/*
		 * 2���� �迭
		 * - �⺻���� �迭�� Ư¡�� �����ϹǷ� ������ �ǳʲ��.
		 */
		String[][] str = new String[][] {
										 {"0,0","0,1","0,2"},
										 {"1,0","1,1","1,2"},
										 {"2,0","2,1","2,2"}
										 };
		for (int i = 0; i < str.length; i++) {
			System.out.print(Arrays.toString(str[i]) + " ");
			for(int j = 0; j < str[i].length; j++) {
				System.out.print(str[i][j] + " ");
			}
			System.out.println();
		}
	
		System.out.println("str.length : " + str.length);
		System.out.println("str[0].length : " + str[0].length);
		System.out.println("----------------------------");
		
		// ���� 2)
		// ĥ�ǿ� üũ�س��� ��ġ�� ���� '*'�� �����ؼ� ����Ͻÿ�.
		// [ '*', '0,1', '*' ]
		// [ '*', '1,1', '*' ]
		// [ '*', '2,1', '*' ]
		
		for (int i = 0; i < str.length; i++) {
			for(int j = 0; j < str[i].length; j++) {
				if (j % 2 ==0) {
					str[i][j] = "*";
				}
			}
			System.out.println(Arrays.deepToString(str[i]) + " ");
		}
		
	}

}


