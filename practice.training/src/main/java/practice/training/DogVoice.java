package practice.training;

public class DogVoice extends Voice{

	@Override
	public void voice() {
		// TODO Auto-generated method stub
		System.out.println("This is inherited abstract method");
		
	}

	public static void main(String[] args) {
		
		Voice dVoice = new DogVoice();
		dVoice.voice();
		dVoice.myVoice();
		
		DogVoice dogVoice = new DogVoice();
		dogVoice.voice();
		dogVoice.myVoice();
	}
}


