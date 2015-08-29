package tut22;

class Frog {
	private String name;
	private int age;
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setAge(int newAge) {
		this.age = newAge;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setInfo(String name, int age) {
		setName(name); 
		setAge(age);
	}
}

public class Application {
	public static void main(String[] args) {

		Frog frog1 = new Frog();
		
		System.out.println(frog1.getName());
		
		frog1.setName("Biggy");
		System.out.println(frog1.getName());
		
		frog1.setAge(55);
		System.out.println(frog1.getAge());
		
		
	}
}
