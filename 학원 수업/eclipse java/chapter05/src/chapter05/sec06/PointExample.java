package chapter05.sec06;

public class PointExample {

	public static void main(String[] args) {
	Point p1 = new Point(100,200);
	
	Point p2 = (Point)p1.clone();
	
	System.out.println("p1=" + p1);
	System.out.println("p2=" + p2);

	}

}

class Point implements Cloneable {
	int x;
	int y;
	Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	@Override
	public String toString() {
		return "("+x+", "+y+")";
	}
	
	@Override
	public Object clone() {
		Object obj = null;
		try {
			obj=super.clone();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}
}