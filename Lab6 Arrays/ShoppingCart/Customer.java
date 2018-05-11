import java.util.Scanner;

import java.text.NumberFormat;

public class Customer {
	
	// Instance Variables
	private String firstName;
	private String lastName;
	private String customerAddress;
	private int customerID;
	private double bankBalance;
	private double cartTotal;
	ShoppingCart cart;
	
	NumberFormat fmt = NumberFormat.getCurrencyInstance(); 
	
	// Instantiate Customer Object
	public Customer(String first, String last, String address, int id, double bankRoll, double total, ShoppingCart buggy) {
		firstName = first;
		lastName = last;
		customerAddress = address;
		customerID = id;
		bankBalance = bankRoll;
		cartTotal = total;
		cart = buggy;
	}
	
	public String toString() {
		return ("CustomerName: " + firstName + " " + lastName + 
				"\nCustomer Address: " + customerAddress + 
				"\nCustomer ID: " + customerID + "\nThis customer currently has: " +
				bankBalance + " in their account. ");
	}
	
	public String updateBalance(double total) {
		NumberFormat gmt = NumberFormat.getCurrencyInstance();
		return(fmt.format(bankBalance-=total));
	}
}
