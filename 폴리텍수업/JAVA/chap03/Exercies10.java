package chap03;

public class Exercies10 {

	public static void main(String[] args) {
		//1. 2차원 배열 선언 및 생성
		int [][] intArray = new int[4][4];
	
		//2. 1~10 사이의 랜덤한 수를 넣기
		for(int row=0; row < intArray.length; row++) {
			for(int col=0; col < intArray[row].length; col++)
				intArray[row][col] = 0;
		}
		
		// 10개만 랜덤하게 넣기
		int count = 0;
		while(count < 10) {
			int row = (int)(Math.random()*4);
			int col = (int)(Math.random()*4);
			if(intArray[row][col]!=0) continue;
			else {
				intArray[row][col] = 1+(int)(Math.random()*10);
				count++;
			}
		}
		
		//3. 화면에 4 X 4 행렬로 출력하기
		for(int row=0; row < intArray.length; row++) {
			for(int col=0; col < intArray[row].length; col++)
				System.out.printf("%5d", intArray[row][col]);
			System.out.println();
		}
		
		// 4. 9 번을 확장하라
		// 	  2번에서 10개만 만들고, 랜덤한 위치에 넣는다.
		//	  3넣지 못한 위치에는 0을 넣흡니다.
//		for(int row=0; row < intArray.length; row++) {
//			for(int col=0; col < intArray[row].length; col++)
//				System.out.printf("%5d", intArray[row][col]);
//			System.out.println();
//		}
		
		
	}

}
