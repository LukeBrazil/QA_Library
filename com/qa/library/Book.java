package com.qa.library;

public class Book extends LibraryItem{
	private int pages;
	private String author;
	

	public Book(String name, int condition, int pages, String author) {
		super(name, condition);
		this.pages = pages;
		this.author = author;
		// TODO Auto-generated constructor stub
	}


	public int getPages() {
		return pages;
	}


	public void setPages(int pages) {
		this.pages = pages;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	@Override
	public String toString() {
		return "Book [pages=" + pages + ", author=" + author + ", getName()=" + getName() + ", getId()=" + getId()
				+ ", getCondition()=" + getCondition() + "]";
	}

}
