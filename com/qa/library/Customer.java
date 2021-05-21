package com.qa.library;
import java.util.*;
public class Customer extends Person {
	private double walletBalance;
	
	public Customer(String name, int age, boolean isAdmin, double walletBalance) {
		super(name, age, isAdmin);
		this.setWalletBalance(walletBalance);
		this.setAdmin(false);
		// TODO Auto-generated constructor stub
	}
	
	List<Object> myCheckedOut = new ArrayList<Object>();
	
	public double getWalletBalance() {
		return walletBalance;
	}
	public void setWalletBalance(double walletBalance) {
		this.walletBalance = walletBalance;
	}
	
	public void checkout(Object obj) {
		LibraryItem myObj = (LibraryItem) obj;
		myObj.setCheckedOut(true);
		myCheckedOut.add(myObj);
	}

		
	public void checkIn(Object obj) {
		LibraryItem myObj = (LibraryItem) obj;
		myObj.setCheckedOut(false);
		myCheckedOut.remove(myObj);
		System.out.println("Checked in!");
	}
	
	public void customerCheckouts() {
		for (int i = 0; i < myCheckedOut.size(); i++ ) {
			LibraryItem myObj = (LibraryItem) myCheckedOut.get(i);
			System.out.println(myObj.toString());
		}
	}
	@Override
	public String toString() {
		return "Customer [walletBalance=" + walletBalance + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", isAdmin()=" + isAdmin() + ", getId()=" + getId() + "]";
	}
	
	
}
