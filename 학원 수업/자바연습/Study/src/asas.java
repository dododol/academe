
public class asas {
	
	public static void main(String[] args) {
		
        int[] sizeArray = new int[10];
        for ( int i = 0; i < sizeArray.length; i++) {
            sizeArray[i] = 250 + (5 * i);
        }

        for (int size : sizeArray) {
            System.out.println("������ " + size + " (��� ����)");
        }
	}

}
