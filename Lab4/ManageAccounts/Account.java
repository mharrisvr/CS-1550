import java.util.Scanner;
import java.text.NumberFormat;

public class Account {
	private double balance;
	private String name;
	private long acctNum;
	
	
	public Account(double initBal, String owner, long number) {
		balance = initBal;
		name = owner;
		acctNum = number;
	}
	
	public void withdraw(double amount) {
		if (balance >= amount) {
			balance = balance - amount;
		}
		else {
			System.out.println("Insufficient funds");
		}
	}
	
	public void deposit(double amount) {
		balance = balance - amount;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String toString() {
		return (name + "\t" + acctNum + "\t" + balance);
	}
	
	public void chargeFee() {
		balance = balance - 10;
	}
	
	public void changeName(String newName) {
		name = newName;
		return;
		
	}
}
