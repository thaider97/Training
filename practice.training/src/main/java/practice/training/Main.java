package practice.training;

public class Main {

	public static void main(String[] args) {
		
		/*
		Parent parent = new Parent();		//Parent Object
		parent.setAgeOfParent(50);		//setting parent age
		System.out.println("Age of parent is  " + parent.getAgeOfParent()); 	//getting parent age through object of parent class
		parent.getParentAge();		//calling public method of parent class through object of parent class
		
		Child child = new Child(4);		//Child Object
		child.setAgeOfParent(51);
		child.setAgeOfChild(25);
		System.out.println("The age of Child is " +child.getAgeOfChild());
		child.getChildAgee();
		child.getParentAge();
		*/
		
		//Inheritance implementation
		/*
		SecondChild secondChild = new SecondChild(1);	//SecondChild Object
		secondChild.setAgeOfParent(52);
		secondChild.setAgeOfChild(26);
		secondChild.setAgeOfSecondChild(3);
		System.out.println("The age of Parent is " + secondChild.getAgeOfParent());
		System.out.println("The age of Child is " + secondChild.getAgeOfChild());
		System.out.println("The age of Second child is " + secondChild.getAgeOfSecondChild());
		secondChild.getParentAge();
		secondChild.getChildAgee();
		secondChild.getSecondChildAge();
		*/
		
		//Interface implementation
		Son son = new Son();
		son.setGender("Male");
		System.out.println(son.isStudying());
		System.out.println(son.isWorking());
		System.out.println(son.getAge());
		son.displayGender();
		
		Daughter daughter = new Daughter();
		daughter.setGender("Female");
		System.out.println(daughter.isStudying());
		System.out.println(daughter.isWorking());
		System.out.println(daughter.getAge());
		daughter.displayGender();
	}
}
