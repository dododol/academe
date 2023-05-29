package arrayStudy;

public class ArrayQuiz {

	public static void mail(String[] args) {
		
		Quiz qq = new Quiz();
		
		qq.SemQuiz();
		
	}
}

class Quiz {
	// 배열을 활용하여 쇼핑몰에서 구매 가능한 신발 사이즈 옵션을 출력하는 프로그램을 작성하시오
	
	// 조건 : 신발 사이즈는 250부터 295까지 5 단위로 증가. 신발 사이즈 수는 총 10가지
	static void Quiz1() {
		
		int[] Shoes = {2,2,2,2,2,2,2,2,2,2};
	
		for(int i = 0; i < Shoes.length; i++) {
			Shoes[i] = Shoes[i] + 5;
			System.out.print("사이즈 " + Shoes[i] + "(재고 있음)");
		}
	}

	
	static void SemQuiz() {
		
        int[] sizeArray = new int[10];
        for ( int i = 0; i < sizeArray.length; i++) {
            sizeArray[i] = 250 + (5 * i);
        }

        for (int size : sizeArray) {
            System.out.println("사이즈 " + size + " (재고 있음)");
        }
	}
}
