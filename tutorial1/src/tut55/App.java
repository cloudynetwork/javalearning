package tut55;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Person implements Comparable<Person> {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name; 
	}

	@Override
	public int compareTo(Person person) {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class App {

	public static void main(String[] args) {

		List<Person> list = new ArrayList<Person>(); 
		
		Set<Person> set = new TreeSet<Person>();
		
		addElements(list);
		addElements(set);

		System.out.println("List:");
		showElements(list);
		System.out.println();
		System.out.println("Tree:");
		showElements(set);
	}

	private static void addElements(Collection<Person> col) {
		col.add(new Person("Joe"));
		col.add(new Person("Sue"));
		col.add(new Person ("Juliet"));
		col.add(new Person ("Claire"));
		col.add(new Person ("Mike"));

	}
	
	private static void showElements(Collection<Person> col) {
		for(Person element: col) {
			System.out.println(element);
		}
		
	}
}
