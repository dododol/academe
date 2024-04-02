package chap03;

public class Alpabet_Print {
	public static void main(String[] args) {
		int A[][] = {
				{0, 0, 0, 1, 0, 0, 0},
				{0, 0, 1, 0, 0, 0, 0},
				{0, 1, 0, 0, 0, 0, 0},
				{1, 1, 1, 1, 1, 1, 1},
				{1, 0, 0, 0, 0, 0, 1},
				{1, 0, 0, 0, 0, 0, 1},
				{1, 0, 0, 0, 0, 0, 1},
		};
		
			for(int row=0; row<A.length; row++) {
				for(int col=0; col<A[row].length; col++) {
					if(A[row][col]==0) {
						System.out.print(" ");
				}else if(A[row][col]==1) {
					System.out.print("■");
				}
				System.out.println();
			}
		}
	}
}
