import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Random;

public class Shopping {
	public static void main(String[] args) {
		
		System.out.println("Welcome to Amazon's Grocer!\n");
		ShoppingCart cart = new ShoppingCart(); 
		Random rand = new Random();
		NumberFormat fmt = NumberFormat.getCurrencyInstance(); 
	
		Customer tempF = new Customer("a", "b", "c", 123, 456, 789, cart);
		int cust = 0;
		double dailyTotal = 0.0;
		
		System.out.println("How many customers are in here shopping?");
		
		Scanner scan = new Scanner(System.in);
		int customers = scan.nextInt();
		
		while(customers > 0) {
			
			String name;
			String firstName, lastName;
			String address;
			int id = rand.nextInt(9999);
			int amount = 0;
			double price;
			double bankBalance; 
			double total = 0.0;
			
			if (cust == 0) {
				System.out.println("Please enter the customer's full name.");
				firstName = scan.next();
				lastName = scan.next(); 
				System.out.println("Your customerID is: "+ id);
				System.out.println("What is your address?");
				scan.next(); 
				address = scan.nextLine(); 
				
				System.out.println("How much money did you bring with you today?");
				bankBalance = scan.nextDouble(); 
				
				cust = 1;
				tempF = new Customer(firstName, lastName, address, id, bankBalance, amount, cart);
			}	else {	
			System.out.println("Please enter the item name you would like to purchase, or enter done.");
			String temp = scan.next(); 
			
			if(temp.equalsIgnoreCase("done")) {
				System.out.println("Please pay " + fmt.format(cart.total()));
				System.exit(0);
			}
			
			else {
				name = temp; 
				System.out.println("Please enter the price: ");
				price = scan.nextDouble(); 
				
				System.out.println("How many did you purchase?");
				amount = scan.nextInt(); 
				
				cart.addToCart(name, price, amount);
				System.out.println(cart.toString());
			}
				}
			}
		
	//	System.out.println("The total for all customers was " + fmt.format(fTtotal));
			
	}
}

