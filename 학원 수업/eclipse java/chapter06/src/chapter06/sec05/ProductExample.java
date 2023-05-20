package chapter06.sec05;

public class ProductExample {

	public static void main(String[] args) {
//		일반 변수가 생성되어 참조하려면 각 타입으로 선언되어 만들어져야함. 그 기억잘소를 만드는 연산자가 new연산자임(heap메모리에 만듦)
		Product p1 = new Product("볼펜");
		System.out.println(p1); // p1뒤에 .toString 이 생략되어있는것.
		
		Product p2 = new Product("지우개");
		System.out.println(p2);
		
		Product p3 = new Product("포스트잇");
		System.out.println(p3);
		
		System.out.println(p1);
		
	
	}

} //
// 상품코드는 1001부터 자동생성되어 pid에 저장
class Product {
	static long pid = 1000;	// 멤버변수는 초기화시키지 않으면 자동으로 초기화 됨. 이걸 이니셜벨류라고 함
	String pName;
	
	Product() {}
	Product(String pName) {
		pid++;
		this.pName = pName;
	}
	
	@Override
	public String toString() { // 무조건 public. 원래 object클래스꺼. 클래스는 public이기에 자식클래스에서는 public보다 좁혀 사용할 수 없음.
	return"제품번호 : " +pid+ "\n제품명 : " + pName;						//getter to String 차이점 : - getter 하나하나 내보냄 - toString 여러개를 묶어서 내보냄
	}
}