// Application StudentExams reads the number of students from
// the user and, for each student, reads three test scores from
// the user and uses those scores to initialize a Student object.
// The three test scores and the largest test score are printed
// using the Student object’s computeHighestScore() method.

import java.util.Scanner;

public class StudentExam {

	public static void main(String[] args) {
		
		Scanner inData = new Scanner(System.in);
		int score1;
		int score2;
		int score3;
		int numStudents, studentsNum;
		int students = 1;
		
		
		System.out.println("How many students are we testing? ");
		studentsNum = inData.nextInt(); 
		
		int array[] = new int[studentsNum];
		
		for (numStudents = studentsNum; numStudents > 0; numStudents-- ) {
			System.out.println("Enter the three test scores for exam 1, exam 2, and exam 3. (Seperated by a space)");
			score1 = inData.nextInt();
			score2 = inData.nextInt(); 
			score3 = inData.nextInt(); 
			Student student = new Student(score1, score2, score3);
			System.out.println(student.printAllScores());
			System.out.println("The highest score for student " + ("#"+ students++) + ": " +  student.computeHighestScore());
			System.out.println();
			
		}
		
		
		
		
	}
}
