package com.qa.library;
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibraryItem book = new Book("Book1", 10, 1000, "John Mable");
		LibraryItem book2 = new Book("Book2", 10, 350, "Mark Johns");
		Person john = new Customer("John", 25, false, 25.67);
		System.out.println(john.toString());
		
		LibraryShelves myLib = new LibraryShelves("my lib");
		myLib.addLibraryItem(book);
		myLib.addLibraryItem(book2);
		myLib.showItemsOnShelves();
	}

}
