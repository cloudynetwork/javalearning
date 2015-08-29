package tut21;

class Person {
	String name;
	int age;

	void speak() {
		System.out.println("My name is: " + name);
	}

	int calculateYearsToRetirement() {
		int yearsLeft = 65 - age;
				
		return yearsLeft;
	}
	
	int getAge() {
		return age;
	}
	
	String getName() {
		return name;
	}
}

public class Application {
	public static void main(String[] args) {

		Person person1 = new Person();

		person1.name = "Joe";
		person1.age = 25;

		person1.speak();
		
		System.out.println("Years to retirement: " + person1.calculateYearsToRetirement());

		int age = person1.getAge();
	}
}
