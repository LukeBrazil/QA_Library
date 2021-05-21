package com.qa.library;
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LibraryItem book = new Book("Book1", 10, 1000, "John Mable");
		LibraryItem book2 = new Book("Book2", 10, 350, "Mark Johns");
		
		Person john = new Customer("John", 25, false, 25.67);
		
		LibraryShelves myLib = new LibraryShelves("my lib");
		
//		a.    Check out item
		((Customer) john).checkout(book);
//		b.    Check in item
		((Customer) john).checkIn(book);
//		c.    Add item
		myLib.addLibraryItem(book);
		myLib.addLibraryItem(book2);
//		d.    Remove item
		myLib.removeItem(book2);
//		e.    Update item
		book.setName("Redwall");
//		f.    Register person
		Person david = new Customer("David", 25, false, 25.67);
//		g.    Delete person
		david = null;
//		h.    Update person
		john.setAge(90);
//		i. Show items in library
		myLib.showItemsOnShelves();
//		j. Show items checked out by person.
		((Customer) john).customerCheckouts();
	}

}
