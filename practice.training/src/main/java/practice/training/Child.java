package practice.training;



public class Child extends Parent {

	private int ageOfChild;

	public Child() {
		super();
		System.out.println("Default constructor of Child class");
	}

	public Child(int ageOfChild) {
		super(50);
		this.ageOfChild = ageOfChild;
		System.out.println("Parameterized constructor of Child class");
	}

	public int getAgeOfChild() {
		return ageOfChild;
	}

	public void setAgeOfChild(int ageOfChild) {
		this.ageOfChild = ageOfChild;
	}
	
	private void getChildAge() {
		System.out.println("The age of Child is " + getAgeOfChild());
	}
	
	public void getChildAgee() {
		getChildAge();
	}
	
	
}
