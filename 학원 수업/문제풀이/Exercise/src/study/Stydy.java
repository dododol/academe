package study;

public class Stydy {

	public static void main(String[] args) {
	
		Study1 ss = new Study1();
		ss.method1();
		
	}
}

class Study1 {

	void method1(){
//	. 二쇱뼱吏� �꽠�뵪 �삩�룄瑜� �솕�뵪 �삩�룄濡� 諛붽씀�뒗 �봽濡쒓렇�옩�쓣 �옉�꽦
//	�븯�씪. 二쇱뼱吏� �꽠�뵪 �삩�룄�뒗 15�룄 �씠�떎. (�엺�듃: �꽠�뵪 �삩�룄 C瑜�
//	�솕�뵪 �삩�룄 F濡� 諛붽씀�뼱 二쇰뒗 怨듭떇�� F=9/5*C+32 �씠�떎.)
//	�궓 �떎�뻾�솕硫�
//	�꽠�뵪 �삩�룄 = 15.0
//	�솕�뵪 �삩�룄 = 59.0
	
		double a, b, c;
	
		a = 15.0;
		b = 9.0/5.0*a+32.0;
		c = 0;
	
		System.out.println("�꽠�뵪�삩�룄 = " + a);
		System.out.println("�솕�뵪�삩�룄 = " + b);
		System.out.println("�솕�뵪�삩�룄 = " + c);
	}

	void method2() {
		
		
	}
}