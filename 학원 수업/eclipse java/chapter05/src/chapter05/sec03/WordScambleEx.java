package chapter05.sec03;

import java.util.Random;
import java.util.Scanner;

public class WordScambleEx {

	public static void main(String[] args) {
		WordScamble ss=new WordScamble();
		String str = ss.WordSelection();
		String question = ss.shuffle(str);
		System.out.print("제시어 : " + question);
		ss.answer(str);

	}

}

class WordScamble{
	private String[] word = {"hope", "apple", "banana", "orange", "love"};	// private로 생성하면 이 클래스 안에서만 사용

	public String WordSelection() {
		Random rnd=new Random();
		int idx = rnd.nextInt(5);	// 0~4 사이의 정수형 난수발생
		return word[idx];
		
	}
	
	public String shuffle(String str) {
		char[] ch = str.toCharArray();		//to CharArray 메소드를 사용하면 자동으로 문자열을 문자 배열로 바꿔준다.
		
				for(int i=0; i<1000; i++) {
					int r = (int)(Math.random()*ch.length);
					char temp=ch[0];
					ch[0]=ch[r];
					ch[r]=temp;		// 문자열을 출력하려고 했지만 문자 배열이 나온다.
				}
				return(new String(ch));		//34열에 있는 문제를 다시 문자열로 변환 
	}
	
	public void answer(String question) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		
		while(true) {
			System.out.print("\n정답 : ");
			String str = sc.nextLine();
			count++;
			
			if(str.equals(question)) {
				System.out.println("********************");
				System.out.println("정답입니다");
				System.out.println("시도횟수 : " + count);
				System.out.println("********************");
				break;
			} else {
				System.out.println("********************");
				System.out.println("정답이 아닙니다");
			}
		}
		
	}
}

//배열 예제1] 아래 단어 5개를 배열에 저장하고 임의의 단어를 선택한 후 단어 내의 철자를 섞어 사용자에게 제시한다.
//사용자는 제시된 철자를 보고 단어를 맞추는 게임(시도 횟수도 출력할 것)
//[제시어] hope, apple, banana, orange, love


/* 2차원 배열예제1] 5명이 3과목 시험을 본 결과가 다음과 같다. 이를 배열 저장한 후 출력하시오(평균은 정수로)
   
   [자료]
	이름		국어		영어		수학
	홍길동	70		80		60
	이순신	80		90		90
	정몽주	90		80		90
	강감찬	75		80		80
	이성계	60		70		60

  2차원배열예제2] 위 자료를 이용하여 총점과 평균을 구하시오
  
  2차원배열예제3 ] 위 자료를 이용하여 총점과 평균 및 석차(등수)를 구하시오
  
  2023/05/15일 과제 ] 위 3번 결과에서 1등부터 차레대로 출력하시오
  */
 
 



