package tut13;

class Person { 
	
	// Instance variables (data or "state")
	
	String name; 
	int age;
	
	
	// Classes can contain
	
	// 1. Data
	// 2. Subroutines (methods)
}

class Bicycle {
	
	String brand;
	String owner;
	int gears;
	int speed; 
	
}

public class Application {
	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name = "Joe Bloggs";
		person1.age = 37;
		
		Person person2 = new Person();
		person2.name = "Sarah Smith";
		person2.age = 20;
		
		System.out.println(person1.name);
		
		Bicycle speedy = new Bicycle();
		speedy.gears = 24;
		speedy.owner = "Peter";
		speedy.speed = 454334;
		
		System.out.println(speedy.owner);
	
	}
}
