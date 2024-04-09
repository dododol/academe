package chap04;

import java.util.Scanner;

public class BookArray {

	public static void main(String[] args) {
		Book[] book = new Book[2];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<book.length; i++) {
			System.out.println("제목>> ");
			String title = scan.nextLine();
			System.out.println("저자>> ");
			String author = scan.nextLine();
			book[i] = new Book(title, author);
		}
		
		//for-each로 출력해보자!
		for( Book b : book ) {
			System.out.println(b.title + " " + b.author);
		}
		
	}
}
