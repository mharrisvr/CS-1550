// Application HighSore reads and prints three test scores.
// The largest value of the three is prined with an 
// Appropriate message
// Assumption: The scores are unique

import java.util.Scanner;

public class HighScore {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score1;
		int score2;
		int score3;
		int max = 0;
		int i = 1;
		int testLimit = 6;
		
		while (i <= testLimit) {
			System.out.println("Enter the three test scores (Seperated by a space): ");
			score1 = scan.nextInt();
			score2 = scan.nextInt();
			score3 = scan.nextInt(); 
		
			System.out.println("The test scores for the student were: " + score1 + ", " +  score2 + ", " + score3);
	
			if ((score1 > score2) && (score1 > score3)) {
				max = score1;
			}
			else if ((score2 > score1) && (score2 > score3)) {
				max = score2;
			}
			else {
				max = score3;
			}
			i++;
			System.out.println("The highest number is: " + max);
			System.out.println();
		}
			
	}
}

