import java.util.Scanner;

public class Student {
	private String name;
	private double test1;
	private double test2;
	
	public Student(String studentName) {
		name = studentName;
	}
	
	public double inputGrades() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter " + getName() + "'s scores for test 1 and test 2 (seperated by a space)");
		test1 = scan.nextDouble();
		test2 = scan.nextDouble();
		return test1 + test2;
	}
	
	public double getAverage(double average) {
		average = (test1 + test2)/2;
		return average;
	}
	
	public String getName() {
		return name;
	}
}
