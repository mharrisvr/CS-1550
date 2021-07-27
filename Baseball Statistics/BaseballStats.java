// ************************************************
// BaseballStats.java
// Contributors: Mike H & Mike D
// Reads baseball data in from a comma delimited file. Each line
// of the file contains a name follows by a list of symbols indicating
// the result of each at bat: h for hit, o for out, 
// w for walk, s for sacrifice. Statistics are computed and 
//printed for each player. 
//*************************************************

import java.util.Scanner;
import java.io.*;

public class BaseballStats {

	public static void main(String[] args) throws IOException {

		Scanner fileScan, lineScan;
		String fileName;
		double battingAverage, total = 0;
		int countH = 0; 
		int countS = 0;
		int countW = 0;
		int countO = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the name of the input file: ");
		fileName = scan.nextLine();
		fileScan = new Scanner(new File(fileName));
		
		// Read and process each line of the file 
		
		while (fileScan.hasNextLine()) {
			fileName = fileScan.nextLine(); 
			//System.out.println(fileName);
			
			lineScan = new Scanner(fileName);
			lineScan.useDelimiter(",");
			
				while (lineScan.hasNextLine()) {
					System.out.println(lineScan.next()); 
					
					if (lineScan.hasNext("h"))  {
						countH++;
					}
					else if (lineScan.hasNext("o")) {
						countO++;
					}
					else if (lineScan.hasNext("w")) {
						countW++;
					}
					else if (lineScan.hasNext("s")) {
						countS++;
					}  
					
					}	
				System.out.println("This batter has: " + countH + " Hits");
				System.out.println("This batter has: " +countO + " Outs");
				System.out.println("This batter has: " + countW + " Walks");
				System.out.println("This batter has: " + countS + " Sacrifices");
				
				int sum = countH + countO + countW + countS;
				battingAverage = (double) countH / sum;//sum / (double) countH;
				
				System.out.println("Batting average is: " + battingAverage);
				System.out.println();
				
				countH = 0;
				countO = 0;
				countW = 0;
				countS = 0;
				} 
			
			
		} 
		
	}


