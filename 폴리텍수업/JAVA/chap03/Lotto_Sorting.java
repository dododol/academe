package chap03;

public class Lotto_Sorting {

	public static void main(String[] args) {
		
		//1. 배열 선언 및 생성
		int lotto[] = new int [7];
		
		//2. 배열에 값 입력 (1~45의 랜덤수 넣기)
		for(int i=0; i<lotto.length;i++) {
			lotto[i] = 1 + (int)(Math.random() * 45);
			//todo : 중복을 제거해주세요 !!! (중복제거 알고리즘)
			for(int x=0; x<i; x++) {
				if(lotto[i] == lotto[x]) {i--; break;}
			}
			
		}
		
		//3. 배열의 값 출력 (lotto 배열 값 출력)
//		for(int i=0; i<lotto.length; i++)
//			System.out.print(lotto[i] + " ");
		
		//3. 배열의 값 출력 (for-iterating 반복문)
		System.out.println("정렬 전 ==================== ");
		for(int num : lotto)
			System.out.print(num + " ");
	
		System.out.println(">>");
		
		//4. 로또값 중 최대값 출력 / 최대값이 있던 인덱스 출력
		int max = lotto[0];	//0번 index 값이 가장 크다고 가정
		int max_index = 0;	//0번 index 로 초기화
		for(int i=1; i<lotto.length; i++) {
			if(max<lotto[i]) {
				max = lotto[i];
				max_index = i;
			}
		}
		System.out.println("최대값 : " + max + " 최대값 인덱스 : " + max_index);
	
		// 선택정렬 알고리즘
		// 단계별 바뀔 수 있는 곳을 ***을 표시해보세요!
		for(int i=0; i<lotto.length; i++) {
			
			// 1. 최소값이 있는 방 번호 찾기
			int min_index = i;							// ***
			for(int j = i+1; j < lotto.length; j++) {		// ***
				if(lotto[min_index] > lotto[j])  {
					min_index = j;
				}
			}
			
			// 2. 최소값이 있는 방과 데이터 교환하기
			int temp = lotto[min_index];
			lotto[min_index] = lotto[i];				// ***
			lotto[i] = temp;							// ***
		}

		//3. 배열의 값 출력 (for-iterating 반복문)
		System.out.println("정렬 전 ==================== ");
		for(int num : lotto)
			System.out.print(num + " ");
		
		System.out.println(">>");

	
	}

}

















