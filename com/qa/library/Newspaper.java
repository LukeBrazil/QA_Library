package com.qa.library;

public class Newspaper extends LibraryItem{
	private int pages;
	private String publisher;
	

	public Newspaper(String name, int condition, int pages, String publisher) {
		super(name, condition);
		this.pages = pages;
		this.publisher = publisher;
		// TODO Auto-generated constructor stub
	}
	
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Newspaper [pages=" + pages + ", publisher=" + publisher + ", getName()=" + getName() + ", getId()="
				+ getId() + ", getCondition()=" + getCondition() + "]";
	}
	
}
