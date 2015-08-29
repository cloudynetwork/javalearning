package tut15;

class Robot {
	public void speak(String text) {
		System.out.println(text);
	}
	
	public void jump(int height) {
		System.out.println("Jumping: " + height);
	}
	
	public void move(String direction, double distance) {
		System.out.println("Moving " + distance + " meters in direction " + direction);
	}
}

public class Application {
	public static void main(String[] args) {

		Robot sam = new Robot();
		
		sam.speak("Hi I'm Sam");
		sam.jump(7);
		sam.move("Upwards", 7.22);
		
		String greeting = "I am a greeting!";
		sam.speak(greeting);
	}
}
