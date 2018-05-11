//************************************
// LetterCount.java
// 
// Demonstrates the relationship between strings and arrays. 
// ******************************************

import java.util.Scanner;

public class LetterCount {
	public static void main(String[] args) {
		
		final int NUMCHARS = 26;
		
		Scanner scan = new Scanner(System.in);
		
		int[] upper = new int[NUMCHARS];
		int[] lower = new int[NUMCHARS];
		
		char current;	// The current character being processed. 
		int other = 0;	// Counter for non-alphabeticals. 
		
		System.out.println("Enter a sentence: ");
		String line = scan.nextLine(); 
		
		// Count the number of each letter occurence
		for (int ch = 0; ch < line.length(); ch++) {
			current = line.charAt(ch);
			if ((current >= 'A') && (current <= 'Z')) {
				upper[current-'A']++;
			}
			else if ((current >= 'a') && (current <= 'z')) {
				lower[current-'a']++;
				}
			else {
				other++;
			}
		}
		// Print the results
		System.out.println();
		for (int letter=0; letter < upper.length; letter++) {
			System.out.println((char)(letter + 'A'));
			System.out.print(": " + upper[letter]);
			System.out.println("\t\t" + (char)(letter+'a'));
			System.out.println(": " + lower[letter]);
		}
		
		System.out.println();
		System.out.println("Non-Alphabetical characters: " + other);
	}
}
