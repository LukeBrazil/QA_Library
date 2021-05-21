package com.qa.library;
import java.util.*;

public class LibraryShelves {
	private String name;
	
	public LibraryShelves(String name) {
		this.name = name;
	}
	
	List<Object> myLibraryShelf = new ArrayList<Object>();
	
	public void addLibraryItem(Object item) {
		myLibraryShelf.add(item);
	}
	
	public void showItemsOnShelves() {
		for (int i = 0; i < myLibraryShelf.size(); i++) {
			System.out.println(myLibraryShelf.get(i).toString());
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
