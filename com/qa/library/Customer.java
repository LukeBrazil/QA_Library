package com.qa.library;

public class Customer extends Person {
	private double walletBalance;
	public Customer(String name, int age, boolean isAdmin, double walletBalance) {
		super(name, age, isAdmin);
		this.setWalletBalance(walletBalance);
		this.setAdmin(false);
		// TODO Auto-generated constructor stub
	}
	
	public double getWalletBalance() {
		return walletBalance;
	}
	public void setWalletBalance(double walletBalance) {
		this.walletBalance = walletBalance;
	}

	@Override
	public String toString() {
		return "Customer [walletBalance=" + walletBalance + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", isAdmin()=" + isAdmin() + ", getId()=" + getId() + "]";
	}
	
	
}
