
public class Student {
	private int exam1;
	private int exam2;
	private int exam3;
	
	public Student(int x, int y, int z) {
		exam1 = x;
		exam2 = y;
		exam3 = z;
	}
	
	public String printAllScores() {
		return ("The test scores for the student were " + exam1 + ", " + exam2 + ", " + exam3);
	}
	
	public int computeHighestScore() {
		int max = 0;
		if ((exam1 > exam2) && (exam1 > exam3)) {
			max = exam1;
		}
		else if ((exam2 > exam1) && (exam2 > exam3)) {
			max = exam2;
		}
		else if ((exam3 > exam1) && (exam3 >exam2)) {
			max = exam3;
		}
		return max;
	}

	
}
