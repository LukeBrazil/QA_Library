package com.qa.library;
import java.util.Random;

public abstract class LibraryItem {
	private String name;
	private int id;
	private int condition;
	private boolean isCheckedOut;
	
	public LibraryItem(String name, int condition) {
		Random rand = new Random();
		int n = rand.nextInt(1000);
		this.name = name;
		this.id = n;
		this.condition = condition;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCondition() {
		return condition;
	}
	public void setCondition(int condition) {
		this.condition = condition;
	}

	@Override
	public String toString() {
		return "LibraryItem [name=" + name + ", id=" + id + ", condition=" + condition + "]";
	}

	public boolean isCheckedOut() {
		return isCheckedOut;
	}

	public void setCheckedOut(boolean isCheckedOut) {
		this.isCheckedOut = isCheckedOut;
	}
	
	
}
