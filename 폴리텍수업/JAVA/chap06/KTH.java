package chap06;

public class KTH {
	
	//private로 한정해준 필드
	private String name;
	private int age;
	
	//생성자
	public KTH(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//getters & setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "KTH [name=" + name + ", age=" + age + "]";
	}
	
}
