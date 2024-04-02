package chap03;

public class ForeachEx {

	//enum 타입 선언
	enum Week {월, 화, 수, 목, 금, 토, 일}

	public static void main(String[] args) {
		
		String names[] = {"포도", "딸기", "바나나", "체리", "사과", "배"};
		for(String s : names)	System.out.println(s);
		
		// enum 타입 출력
		for(Week day : Week.values())	System.out.println(day + "요일");
	}

}
