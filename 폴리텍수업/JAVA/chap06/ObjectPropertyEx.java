package chap06;

class Point {
	int x, y;
	public Point(int x, int y) {
		this.x = x; this.y = y;
	}
	
	@Override
	public String toString() {
		return "(" + x  + ", " + y + ")";
	}
}

public class ObjectPropertyEx {

		@Override
		public String toString() {
			return "현재 객체의 정보입니다.";
		}
		
		//Object 클래스는 조상클래스이고 자동상속하므로
		//어디서든 upcasting 으로 활용 가능
		public static void print(Object obj) {
			System.out.println(obj.getClass().getName());
			System.out.println(obj.hashCode());
			System.out.println(obj.toString());
			System.out.println(obj);
		}
		
		public static void main(String[] args) {
			Point p = new Point(2,3);
			print(p);
		ObjectPropertyEx ex = new ObjectPropertyEx();
		System.out.println(ex);
	}
}
