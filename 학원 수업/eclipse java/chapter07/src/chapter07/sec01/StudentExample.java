package chapter07.sec01;

public class StudentExample {

	public static void main(String[] args) {
		Student s1 = new Student("ȫ�浿", 25, "����", "ABC@naver.com");
		Student s2 = new Student("�輮ȣ",30,"����");
		People p1 = new People("�輮ȣ",30,"����");
		System.out.println("�л��� : " + s1.name);
		System.out.println("���� : " + s1.age);
		
		People p2 = new People("����â", 30, "����");

	}

}
