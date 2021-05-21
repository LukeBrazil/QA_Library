package com.qa.library;
import java.util.Random;

public abstract class Person {
	private String name;
	private int age;
	private boolean isAdmin;
	private int id;
	
//	public Person() {
//		super();
//	}
	
	public Person(String name, int age, boolean isAdmin) {
		Random rand = new Random();
		int n = rand.nextInt(1000);
		this.setName(name);
		this.setAge(age);
		this.setAdmin(isAdmin);
		this.setId(n);
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}	
