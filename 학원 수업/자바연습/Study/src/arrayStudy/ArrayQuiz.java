package arrayStudy;

public class ArrayQuiz {

	public static void mail(String[] args) {
		
		Quiz qq = new Quiz();
		
		qq.SemQuiz();
		
	}
}

class Quiz {
	// �迭�� Ȱ���Ͽ� ���θ����� ���� ������ �Ź� ������ �ɼ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
	
	// ���� : �Ź� ������� 250���� 295���� 5 ������ ����. �Ź� ������ ���� �� 10����
	static void Quiz1() {
		
		int[] Shoes = {2,2,2,2,2,2,2,2,2,2};
	
		for(int i = 0; i < Shoes.length; i++) {
			Shoes[i] = Shoes[i] + 5;
			System.out.print("������ " + Shoes[i] + "(��� ����)");
		}
	}

	
	static void SemQuiz() {
		
        int[] sizeArray = new int[10];
        for ( int i = 0; i < sizeArray.length; i++) {
            sizeArray[i] = 250 + (5 * i);
        }

        for (int size : sizeArray) {
            System.out.println("������ " + size + " (��� ����)");
        }
	}
}
