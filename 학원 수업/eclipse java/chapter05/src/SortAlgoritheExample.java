
public class SortAlgoritheExample {

	public static void main(String[] args) {
			//	다음 수를 배열에 저장하고 크기순으로 정렬하시오.
			//	자료 : 35,80,25,69,44,51,19,97
			// Bubble sort => 인접괸 두 자료의 크기를 비교하여 자리를 교환. 자료가 n개일때 n-1회전수행(수행시마다 오른쪽 끝을 제외시킴)
			// 35,80,25,69,44,51,19,97

//		int[] source = new int[8];
		int[] source = {35,80,25,69,44,51,19,97};

		SortAlgorithm sa = new SortAlgorithm();
		sa.bubbleSort(source);
	
	}

}

class SortAlgorithm{

	public void bubbleSort(int[] target) {
		boolean flag = false;	// 개선된 버블정렬
		int cnt = 0;
		for(int i=0; i<target.length-1; i++) {	// 각 회전 수
			flag = false;
			cnt++;
			for(int j=0; j<target.length-1-i; j++) {	// 한 행에서 큰수와 작은수 비교
				if(target[j]>target[j+1]) {
					int temp=target[j];
					target[j]=target[j+1];
					target[j+1] = temp;
					flag=true;
				}
			}
			if(!flag) break;
		}
		
		System.out.println("수행횟수 : " + cnt);
		for(int i=0; i<target.length; i++) {
			System.out.printf("%5d", target[i]);
		}
	}
}


//예제1] 정수 5개를 저장하는 배열을 생성하고 10, 20, 30, 40, 50을 저장한 후 출력하시오
//
//2] 기보드로 5명의 친구이름 입력받아 배열에 저장하고 역순으로 출력하시오
//
//3] 에제2의 첫 번재 친구이름과 마지막 친구 이름을 서로 바꾸시오
//
//4] 로또번호를 생성하여 출력하시오
//
//5] 금액을 1000원 단위로 입력하여 예제 4번의 로또번호를 금액만큼 출력하시오.
//
//6] 다음 수를 배열에 저장하고 크기순으로 정렬하시오.
//   자료 : 35,80,25,69,44,51,19,97
