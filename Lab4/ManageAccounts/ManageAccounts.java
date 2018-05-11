
public class ManageAccounts {
	
	public static void main(String[] args) {
		Account acct1, acct2; 
		
		acct1 = new Account(1000.00, "Sally", 1111);
		acct2 = new Account(500.00, "Joe", 1112);
		
		acct2.deposit(100);
		System.out.println("Joe's new account balance is: " + acct2.getBalance());
		acct1.withdraw(50);
		System.out.println("Sally's new account balance is: " + acct1.getBalance()); 
		System.out.println();
		System.out.println("\t" +  "Account Summary");
		acct1.chargeFee(); 
		acct2.chargeFee();
		
		acct2.changeName("Joseph");
		System.out.println("\t" + acct2.toString());
		System.out.println("\t" + acct1.toString());
	}
}
