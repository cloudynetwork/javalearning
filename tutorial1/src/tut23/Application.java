package tut23;

class Machine {

	private String name;
	private int code;

	public Machine() {
		this("Arnie", 0);
		System.out.println("First Constructor running!");

	}

	public Machine(String name) {
		this(); // Runs the default constructor
		this.name = name;
		System.out.println("Constructor 2 running!");
	}

	public Machine(String name, int code) {
		this.name = name;
		this.code = code;

		System.out.println("Third constrctor running!");
	}
}

public class Application {
	public static void main(String[] args) {

		Machine machine1 = new Machine();

	}
}
