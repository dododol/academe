package chapter05.sec03;

import java.util.Random;
import java.util.Scanner;

public class WordScambleEx {

	public static void main(String[] args) {
		WordScamble ss=new WordScamble();
		String str = ss.WordSelection();
		String question = ss.shuffle(str);
		System.out.print("���þ� : " + question);
		ss.answer(str);

	}

}

class WordScamble{
	private String[] word = {"hope", "apple", "banana", "orange", "love"};	// private�� �����ϸ� �� Ŭ���� �ȿ����� ���

	public String WordSelection() {
		Random rnd=new Random();
		int idx = rnd.nextInt(5);	// 0~4 ������ ������ �����߻�
		return word[idx];
		
	}
	
	public String shuffle(String str) {
		char[] ch = str.toCharArray();		//to CharArray �޼ҵ带 ����ϸ� �ڵ����� ���ڿ��� ���� �迭�� �ٲ��ش�.
		
				for(int i=0; i<1000; i++) {
					int r = (int)(Math.random()*ch.length);
					char temp=ch[0];
					ch[0]=ch[r];
					ch[r]=temp;		// ���ڿ��� ����Ϸ��� ������ ���� �迭�� ���´�.
				}
				return(new String(ch));		//34���� �ִ� ������ �ٽ� ���ڿ��� ��ȯ 
	}
	
	public void answer(String question) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		
		while(true) {
			System.out.print("\n���� : ");
			String str = sc.nextLine();
			count++;
			
			if(str.equals(question)) {
				System.out.println("********************");
				System.out.println("�����Դϴ�");
				System.out.println("�õ�Ƚ�� : " + count);
				System.out.println("********************");
				break;
			} else {
				System.out.println("********************");
				System.out.println("������ �ƴմϴ�");
			}
		}
		
	}
}

//�迭 ����1] �Ʒ� �ܾ� 5���� �迭�� �����ϰ� ������ �ܾ ������ �� �ܾ� ���� ö�ڸ� ���� ����ڿ��� �����Ѵ�.
//����ڴ� ���õ� ö�ڸ� ���� �ܾ ���ߴ� ����(�õ� Ƚ���� ����� ��)
//[���þ�] hope, apple, banana, orange, love


/* 2���� �迭����1] 5���� 3���� ������ �� ����� ������ ����. �̸� �迭 ������ �� ����Ͻÿ�(����� ������)
   
   [�ڷ�]
	�̸�		����		����		����
	ȫ�浿	70		80		60
	�̼���	80		90		90
	������	90		80		90
	������	75		80		80
	�̼���	60		70		60

  2�����迭����2] �� �ڷḦ �̿��Ͽ� ������ ����� ���Ͻÿ�
  
  2�����迭����3 ] �� �ڷḦ �̿��Ͽ� ������ ��� �� ����(���)�� ���Ͻÿ�
  
  2023/05/15�� ���� ] �� 3�� ������� 1����� ������� ����Ͻÿ�
  */
 
 



