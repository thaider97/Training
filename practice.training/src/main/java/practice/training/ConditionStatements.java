package practice.training;

public class ConditionStatements {

	public static void main(String[] args) {

		int x = 30;
		int y = 45;
		int z = 45;

		// if statement
		if (y > x) {
			System.out.println("y is greater than x");
		}

		// if-else statement
		if (x > z) {
			System.out.println("x is not greater than z");
		} else {
			System.out.println("x is smaller than z");
		}

		// else-if statement
		if (y < x) {
			System.out.println("X is not less than z");
		} else if (z < x) {
			System.out.println("z is not less than x");
		} else {
			System.out.println("x is smaller than y and z");
		}
		
		
		//
	}
}
