package practice.training;

import java.util.ArrayList;
import java.util.Collections;

public class Exceptions {

	public static void main(String[] args) {

//		try {
//			for (int i = 0; i >= 5; i++) {
//				System.out.println(i);
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("There is an error");
//		}

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(8);
		numbers.add(6);
		numbers.add(4);
		numbers.add(2);
		numbers.add(0);
		Collections.sort(numbers);
		try {
			System.out.println(numbers.get(7));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("There is an error");
		}

	}
}
