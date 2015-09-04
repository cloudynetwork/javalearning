package tut33;

import java.util.ArrayList;
import java.util.HashMap;

class Animal {
	
}

public class App {
	public static void main(String[] args) {

		/////// Before Java 5 ///
		ArrayList list = new ArrayList();
		
		list.add("apple");
		list.add("banana");
		
		String fruit = (String)list.get(1); 
		
		System.out.println(fruit);
		
		//////// New Style /////
		
		ArrayList<String> strings = new ArrayList<String>();
		
		strings.add("cat");
		strings.add("dog");
		strings.add("alligator");
		
		String animal = strings.get(1);
		
		/////////////// There can be more than one type arg ///////
		
		HashMap<Integer, String>  map = new HashMap<Integer, String>();
		
		////////// Java 7 Style ///////
		
		ArrayList<Animal> someList = new ArrayList<Animal>();
		
		
	}

}
