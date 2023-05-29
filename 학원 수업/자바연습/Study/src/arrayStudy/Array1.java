package arrayStudy;

public class Array1 {
	
	public static void main(String[] args) {
		Array2 rr = new Array2();
		
		//rr.method3();

	}
	
}


class Array2 {
	
	static void method1() {
		String [][] seats = new String[][] {
			{"A1", "A2", "A3", "A4", "A5"},
			{"B1", "B2", "B3", "B4", "B5"},
			{"C1", "C2", "C3", "C4", "C5"}
		};
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(seats[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	static void method2() {
	String[][] seats2 = {
			{"A1", "A2", "A3"},
			{"B1", "B2", "B3", "B4"},
			{"C1", "C2", "C3", "C4", "C5"}
		};
	
	for(int i = 0; i < seats2.length; i++) {
		for(int j = 0; j < seats2[i].length; j++) {
			System.out.print(seats2[i][j] + " ");
		}
		System.out.println();
	}
}
	
	static void method3() {
		// 세로 10 x 가로 15 영화관 좌석
		String[][] seats3 = new String[10][15];
		String[] eng = {"A","B","C","D","E", "F","G","H","I","J"};
		
		for(int i = 0; i < seats3.length; i++) {
			for(int j = 0; j < seats3[i].length; j++) {
				seats3[i][j] = eng[i] + (j + 1);
			}
		}
		
		// 표구매
		seats3[7][8] = "__";
		seats3[8][8] = "__";
	
		// 영화관 좌석 번호 확인
		for(int i = 0; i < seats3.length; i++) {
			for(int j = 0; j < seats3[i].length; j++) {
				System.out.print(seats3[i][j] + " ");
			}
			System.out.println();
		}
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
