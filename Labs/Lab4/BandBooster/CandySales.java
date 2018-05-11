import java.util.Scanner;
public class CandySales {
	public static void main(String[] args) {
		BandBooster b1, b2;
		int count = 1;
		int b1Sold = 0, b2Sold = 0;
		int salesWeek = 1;
		
		b1 = new BandBooster("Peter");
		b2 = new BandBooster("Kyle");
		
		Scanner scan = new Scanner(System.in);
		
		while (count <= 3) {
			System.out.println("Enter the number of boxes sold by " + b1.getName() + " in week " + salesWeek + ":");
			b1Sold = scan.nextInt();
			b1.updateSales(b1Sold);
			
			System.out.println("Enter the number of boxes sold by " + b2.getName() + " in week " + salesWeek + ":");
			b2Sold = scan.nextInt();
			b2.updateSales(b2Sold);
			
			salesWeek++;
			count++;
	}
		System.out.println(b1.toString());
		System.out.println(b2.toString());
}
	
}
