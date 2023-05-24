package chapter05.sec07;

public class Controller {

	public static void main(String[] args) {

		Menu[] m1 = Menu.values();
		for(int i=0; i<m1.length; i++) {
			System.out.println(m1[i]);
		}
		
		for(Menu m:Menu.values()) {
			System.out.print(m+"(");
			System.out.println(m.getValue() + ")");
		}
		
	}

}

//		System.out.println("1.Member_SignUp");
//		System.out.println("2.Member_Update");
//		System.out.println("3.Member_Delete");
//		System.out.println("---------------------");
//		
//		System.out.println();