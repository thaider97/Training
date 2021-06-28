package practice.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		//String Arraylist with for loop
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("City");
		cars.add("Civic");
		cars.add("Accord");
		cars.remove(1);
		
		for(int i=0; i <cars.size(); i++){
			System.out.println(cars.get(i));
		}
				 		
				
		//Integer arraylist with iterator
				
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(8);
		numbers.add(6);
		numbers.add(4);
		numbers.add(2);
		numbers.add(0);
		Collections.sort(numbers);
		//for loop for arraylist
		for (int i =0; i<numbers.size(); i++) {
		System.out.println(numbers.get(i));
		}
				
		//iterator for arraylist
		Iterator<Integer> iterator = numbers.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());		
		}
				
	}
}
