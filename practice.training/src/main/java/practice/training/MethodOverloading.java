package practice.training;



public class MethodOverloading {

	public static int add(int x, int y) {
		  return x + y;
		}

	public static double add(double x, double y) {
		  return x + y;
		}
	
	public static void myName(String firstName) {
		System.out.println(firstName + " Haider");
	}
	
	public static void main(String[] args) {
		int i = add(5, 6);
		double d = add(4.5, 6.47);
		
		System.out.println(i);
		System.out.println(d);
		myName("Tehreem");
		myName("Tooba");
		
	}
}
