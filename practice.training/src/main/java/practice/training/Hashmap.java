package practice.training;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Hashmap {

	public static void main(String[] args) {
		//Hashmaps
	    Map<String, Integer> people = new HashMap<String, Integer>();
	    people.put("Tehreem", 23);
	    people.put("Tooba", 21);
	    people.put("Hassaan", 19);
	    people.put("Zoha", 16);
	    
	    for(String string : people.keySet()) {
	    	System.out.println("Name " + string + " Age " + people.get(string) );
	    }
	    
	    people.keySet().stream().forEach(e -> {
	    	
	    });;
	    
	    
	    
		/*
		 * Iterator<Entry<String, Integer>> iterator = people.entrySet().iterator();
		 * while (iterator.hasNext()) { Map.Entry<java.lang.String, java.lang.Integer>
		 * entry = (Map.Entry<java.lang.String, java.lang.Integer>) iterator .next();
		 * System.out.println(entry.getKey() + "     " + entry.getValue()); }
		 * System.out.println(people);
		 * 
		 */	    
	    
	}
}
