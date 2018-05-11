// Application pressure prints appropriate messages based on a 
// pressure reading input from the keyboard

import java.util.Scanner;

public class Pressure {

	public static void main(String[] args) {
		int pressure = 0;
		int testLimit = 0;
		int i = 1;
		int countDanger = 0;
		int countSafe = 0;
		Scanner inData = new Scanner(System.in);
		
		System.out.println("How many times should this test be run?");
		testLimit = inData.nextInt();
		
		while (i <= testLimit) {
			System.out.println("Enter the pressure: ");
			pressure = inData.nextInt(); 
			
			if (pressure > 100) {
				System.out.println("Warning!! Pressure reading above limit!");
				countDanger++;
			}	
				if (pressure > 6 && pressure < 100) {
					System.out.println("Everything looks fine");
					countSafe++;
				}
				i++;
				System.out.println();
		}
		System.out.println("Warning!! Pressure reading above limit is counted: " + countDanger);
		System.out.println("Everything looks fine is counted: " + countSafe);
	}

}
