//************************************
// BasicArray.java
//  Demonstrates basic array declaration and use. 
//****************************
public class BasicArray {
	//----------------------------------------------------------
	// Creates an array, fills it with various integer values. 
	// modifies one value, then prints them out. 
	//----------------------------------------------------------
	public static void main(String[] args) {
		final int LIMIT = 15, MULTIPLE = 10;
		int [] list = new int[LIMIT];
		
		// initialize the array values
		for (int index = 0; index < LIMIT; index++) {
			list[index] = index * MULTIPLE;
		}
		
		list[5] = 999; // Changes one array value
		
		list[8] = 17;
		
		// print the array values
		for (int value : list)
			System.out.println(value + " ");
	}
}
