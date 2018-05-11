
public class Name {
	private String first;
	private String middle;
	private String last;
	
	public Name(String firstName, String middleName, String lastName) {
		first = firstName;
		middle = middleName;
		last = lastName;
	}
	public String getFirst() {
		return first;
	}
	public String getMiddle() {
		return middle;
	}
	public String getLast() {
		return last;
	}
	public String firstMiddleLast() {
		return(first + " " + middle + " " + last);
	}
	public String lastFirstMiddle() {
		return(last + " " + first + " " + middle);
	}
	/*public boolean equals(Name otherName) {
		if (Name.equalsIgoreCase(otherName)) {
			System.out.println("true"); 
		}
		else {
			System.out.println("false");
		}*/
	}
	

