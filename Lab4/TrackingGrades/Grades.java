
public class Grades {
	public static void main(String[] args) {
		double average = 0;
		
		Student student1 = new Student("Mary");
		Student student2 = new Student("Mike");
		
		student1.inputGrades();
		average = student1.getAverage(average);
		System.out.println(student1.getName() + "'s test average is: " + average);
		System.out.println();
		
		student2.inputGrades();
		average = student2.getAverage(average);
		System.out.println(student2.getName() + "'s test average is: " + average);
		System.out.println();
	}
}
