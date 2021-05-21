package com.qa.library;

public abstract class Person {
	private String name;
	private int age;
	private boolean isAdmin;
	
	public Person() {
		super();
	}
	
	public Person(String name, int age, boolean isAdmin) {
		this.setName(name);
		this.setAge(age);
		this.setAdmin(isAdmin);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	
}	
