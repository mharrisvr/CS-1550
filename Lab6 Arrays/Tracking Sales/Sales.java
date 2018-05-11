//********************************************************************
// Sales.java
// 
// Reads in and stores sales for each of 5 salespeople. Displays
// sales entered by salesperson id and total sales for all salespeople. 
// 
//************************************************************************
import java.util.Scanner;
import java.text.NumberFormat;

public class Sales {
	
	public static int getArrayIndex(int[] arr, int value) {
		int k = 0;
		for(int i = 0; i<arr.length; i++) {
			if (arr[i] == value) {
				k = i;
				break;
			}
		}
		return k;
	}
	public static void main(String[] args) {
		//final int SALESPEOPLE = 6;
		//int[] sales = new int[SALESPEOPLE];
		int sum, average, satisfactoryPerformance;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int count = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many salespeople do we have? ");
		final int SALESPEOPLE = scan.nextInt();
		int[] sales = new int[SALESPEOPLE+1];
		
		NumberFormat fmt =  NumberFormat.getCurrencyInstance();
		
		for(int i=1; i<sales.length; i++ ) {
			System.out.println("Enter sales for saleperson " + i + ": ");
			sales[i] = scan.nextInt();
		}
		
		System.out.println("\nSalesperson\tSales");
		System.out.println("--------------------");
		sum = 0;
		
		for (int i = 1; i<sales.length; i++) {
			System.out.println("  " + i + "\t" + fmt.format(sales[i]));
			if (sales[i] > max) {
				max = sales[i];
			}
			
			if (sales[i] < min) {
				min = sales[i];
			}
			sum += sales[i];
		}
		
		System.out.println("\nEnter a dollar amount: ");
		int amount = scan.nextInt(); 
		
		for(int x = 0; x < sales.length; x++) {
			if (sales[x] > amount) {
				satisfactoryPerformance = sales[x];
				satisfactoryPerformance = getArrayIndex(sales, satisfactoryPerformance);
				System.out.println("\nSalesperson " + satisfactoryPerformance + " sold more than the minimum quota with total sales being " + fmt.format(sales[x])+ ".");;
				count++;
			}
		}
		
		System.out.println();
		System.out.println("#Number of sales personnel to exceed quota: " + count + ".");;
		
		int minSalesman = getArrayIndex(sales, min);
		int maxSalesman = getArrayIndex(sales, max);
		average = (sum/(SALESPEOPLE));
		
		System.out.println("\nSalesperson " + maxSalesman + " had the highest sale with $" + max + ".");
		System.out.println("\nSalesperson " + minSalesman + " had the lowest sales with $" + min + ".");
	
		System.out.println("\nTotal sales: $" + sum);
		System.out.println("\nAverage Sales: $" + average);

	}
}
