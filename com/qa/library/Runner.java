package com.qa.library;
import java.util.Random;
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibraryItem book = new Book("Book1", 10, 1000, "John Mable");
		System.out.println(book.toString());
	}

}
