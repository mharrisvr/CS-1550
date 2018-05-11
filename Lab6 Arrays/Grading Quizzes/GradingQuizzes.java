import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class GradingQuizzes {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double correct  = 0;
		boolean corrector = true;
		
		System.out.println("Enter the number of questions: ");
		int answerKey[] = new int[scan.nextInt()];
		
		System.out.println("Enter the answer key for the test: "); 
		
		for(int i = 0; i < answerKey.length; i++) {
			answerKey[i] = scan.nextInt(); 
		}
		
		while (corrector) { 
			System.out.println("Enter the student's answers. (Seperated by a space):");
			for(int i = 0; i < answerKey.length; i++) {
			if (Integer.parseInt(scan.next()) == answerKey[i]) {
				correct++; 
				}
			}
		
		//double average = correct/numQuestions;
		
		System.out.println("The student got " + Math.round(correct) + " questions correct.");
		System.out.println("The student's average: " + Math.round((correct/answerKey.length) * 100) + "%");
		System.out.println("\nGrade another Quiz? y/n");
		if(scan.next().equalsIgnoreCase("y")) {
			correct  = 0;
		}
		else {
			corrector = false;
			System.exit(0);
		}
		}
	}
}


