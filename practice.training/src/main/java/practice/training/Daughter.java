package practice.training;

public class Daughter implements Father{

	private String gender;
	
	
	public Daughter() {
		System.out.println("Deafult constructor of implemented daughter Class");
	}
	

	public Daughter(String gender) {
		this.gender = gender;
		System.out.println("Parameterized constructor of implemented daughter Class");
	}
	

	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public boolean isStudying() {
		// TODO Auto-generated method stub
		return true;
	}
	
	public boolean isWorking() {
		// TODO Auto-generated method stub
		return false;
	}

	public int getAge() {
		// TODO Auto-generated method stub
		return 18;
	}
	
	public void displayGender() {
		System.out.println("Gender of Daughter : " + getGender());
	}

	

}
