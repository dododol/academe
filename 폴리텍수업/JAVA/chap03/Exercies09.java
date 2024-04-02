package chap03;

public class Exercies09 {

	public static void main(String[] args) {
		//1. 2차원 배열 선언 및 생성
		int [][] intArray = new int[4][4];
	
		//2. 1~10 사이의 랜덤한 수를 넣기
		for(int row=0; row < intArray.length; row++) {
			for(int col=0; col < intArray[row].length; col++)
				intArray[row][col] = 1 + (int)(Math.random() * 10);
		}
		
		//3. 화면에 4 X 4 행렬로 출력하기
		for(int row=0; row < intArray.length; row++) {
			for(int col=0; col < intArray[row].length; col++)
				System.out.printf("%5d", intArray[row][col]);
			System.out.println();
		}
		
	}

}
