package practice.training;

public class SecondChild extends Child {
	
	protected int ageOfSecondChild;

	public SecondChild() {
		super();
		System.out.println("Default constructor of Second Child Class");
	}

	public SecondChild(int ageOfSecondChild) {
		super(25);
		this.ageOfSecondChild = ageOfSecondChild;
		System.out.println("Parameterized constructor of SecondChild Class");
	}
	
	
	
	public int getAgeOfSecondChild() {
		return ageOfSecondChild;
	}

	public void setAgeOfSecondChild(int ageOfSecondChild) {
		this.ageOfSecondChild = ageOfSecondChild;
	}

	protected void getSecondChildAge() {
		System.out.println("The age of Second Child is " + getAgeOfSecondChild());
	}
	
	
	
	
}
