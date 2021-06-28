package practice.training;

public class Son implements Father{

	private String gender;
	

	public Son() {
		System.out.println("Default constructor of implemented class Son");
	}

	public Son(String gender) {
		this.gender = gender;
		System.out.println("Parameterized constructor of implemented class Son");
	}
	

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isStudying() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean isWorking() {
		// TODO Auto-generated method stub
		return true;
	}

	public int getAge() {
		// TODO Auto-generated method stub
		return 25;
	}
	
	public void displayGender() {
		System.out.println("Gender of Son : " + getGender());
	}


}
