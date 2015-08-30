package tut26;abstract

class Frog {
	
	private String name; 
	
	public String toString() {
		return "Hello";
	}
}

public class Application {
	public static void main(String[] args) {

		Frog frog1 = new Frog("bleh");
		
		frog1.toString();
	}
}
