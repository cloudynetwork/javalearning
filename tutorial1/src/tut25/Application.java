package tut25;

public class Application {
	public static void main(String[] args) {

		// Inefficient
		String info = "";

		info += "My name is Bob.";
		info += " ";
		info += "I am a builder.";

		System.out.println(info);

		StringBuilder sb = new StringBuilder("");

		sb.append("My name is Sue.");
		sb.append(" ");
		sb.append("I am a lion tamer.");

		System.out.println(sb.toString());

		StringBuilder s = new StringBuilder();

		s.append("My name is Roger.")
		.append(" ")
		.append("I am a skydiver.");

		System.out.println(s.toString());
		
		
		///////// Formatting /////////
		
		System.out.printf("Total cost %-10d: quantity is %d\n", 7, 5);
		
		for(int i=0; i<20; i++) {
			System.out.printf("%-2d: %s\n", i, "some text");
			
			System.out.printf("Total value: %.2f\n", 5.6777);
			System.out.printf("Total value: %-6.1f\n", 343.3423);
		}
	}
}
