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
			LibraryItem e = (LibraryItem) myLibraryShelf.get(i);
			if (!e.isCheckedOut()) { 
				System.out.println(e.toString());
			}
			
		}
	}
	
	public void removeItem(Object obj) {
		for(int i = 0; i < myLibraryShelf.size(); i++) {
			if(myLibraryShelf.get(i).equals(obj)) {
				myLibraryShelf.remove(i);
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
