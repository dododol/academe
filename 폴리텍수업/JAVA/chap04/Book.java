package chap04;

public class Book {
	String title;
	String author;
	
	public Book(String title) {	//생성자
		this.title = title;
		this.author = "작자미상";
	}
	
	public Book(String title, String author) {	// 생성자
		this.title = title;
		this.author = author; 
	}
	
	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자","생텍쥐페리");
		Book loveStory = new Book("춘향전");
		
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
	}
}
