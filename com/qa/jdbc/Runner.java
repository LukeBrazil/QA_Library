package com.qa.jdbc;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LearningJDBC myCon = new LearningJDBC("root", "mysql");
		myCon.readAll();
	}

}
