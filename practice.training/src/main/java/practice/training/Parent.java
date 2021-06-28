package practice.training;

public class Parent {

	private int ageOfParent;

	public Parent() {
		this(1);
		System.out.println("Default constructor of Parent Class");
	}

	public Parent(int ageOfParent) {
		this.ageOfParent = ageOfParent;
		System.out.println("Parameterized constructor of Parent Class");
	}

	public int getAgeOfParent() {
		return ageOfParent;
	}

	public void setAgeOfParent(int ageOfParent) {
		this.ageOfParent = ageOfParent;
	}

	public void getParentAge() {
		System.out.println("The age of parent is " + getAgeOfParent());
	}

	
	
	
}
