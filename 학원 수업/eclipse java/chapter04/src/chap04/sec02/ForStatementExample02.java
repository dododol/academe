package chap04.sec02;

import java.util.Scanner;

public class ForStatementExample02 {				// 코치클래스, 마부클래스 : 일시키는 클래스
	public static void main(String[] args) {
		ForStatement02 ss = new ForStatement02();
//		ss.numberOfVowels();
		ss.fibonacciNumber();
		
	}
	
}

class ForStatement02 {								// 아무것도 적지 않으면 접근제한자 default로 설정. default는 자기 클래스 내에서 다 접근 가능하다. 말 클래스, 워크클래스 : 일하는 클래스
	Scanner sc = new Scanner(System.in);			// sc : 멤버변수. Scanner = 클래스		클래스간의 관계 : 'is a'(상속관계), 'has a'(포함관계) 두 가지.
	public void numberOfVowels() {					// 여기서 Scanner클래스는 ForStatement02에 포함된 'has a' 관계(멤버변수)
		
		int count = 0;

		System.out.print("단어를 입력하세요 : ");
		String word = sc.nextLine();
		
		for (int i=0; i<word.length(); i++) {				// length : 1번부터 문자의 수가 카운트 된다. index : 0부터 카운트 된다. 따라서 index는 length보다 1 작다.
			if (word.charAt(i)=='a'||word.charAt(i)=='e'||			//char At(index)		// 따라서 i는 index이므로 length인 word보다 작아야한다. 같다(=)부호를 넣으면 오류발생
				word.charAt(i)=='i'||word.charAt(i)=='o'||
				word.charAt(i)=='u') {
				count++;
			}
		}
		System.out.println(word+"에 포함된 모음의 수는 : "+ count + "입니다.");
	}

	public void fibonacciNumber() {
		int ppNum = 1;		// 전전수
		int pNum = 1;		// 전수
		int currNum = 0;	// 현재수
		
		System.out.printf("%3d%3d", 1, 1);		// "%" : 형식 지정 문자열
		
		for (int i = 1; i<=50; i++) {				// 여기서 i는 아무 의미없다(counting만 해줌)
			currNum= ppNum + pNum;
			if(currNum >= 50) {
				break;				// **반복문을 빠져나감. 따라서 for문 밖으로 나감
			}else {
				System.out.printf("%3d", currNum);
				ppNum = pNum;			// 47, 48 행의 순서가 중요하다. 전수가 전전수로 들어가고 현재값이 전수로 들어가게 하여 반복해야한다.
				pNum = currNum;
			}
		}
	}




}




/*	[예제6] 키보드로 단어를 입력 받아 단어에 포함된 모음(a,e,i,o,u)의 수를 출력하시오.

	[예제7] 1-5- 사이에 존재하는 fibonacci 수열을 출력하시오
		  ** fibonacci  수열 : 첫 수와 두번째 수가 1로 주어지고 그 다음부터 전 두 수의 합이
		  	현재수가 되는 수열 => 자료 검색 알고리즘에 사용(피보나치 검색)
		  	
	[예제8] 다음의 도형을 출력하는 프로그램 작성
		1)			2)			3)			4)			5)
		 *		*****			*				*		*****
		**		 ****		   ***			   **		****
	   ***		  ***		  *****			  ***		***
	  ****		   **		 *******		 ****		**
	 *****			*		*********		*****		*
	*/