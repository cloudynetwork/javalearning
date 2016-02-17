package tut27;

public class Car extends Machine {

	public void wipeWindShield() {
		System.out.println("Wiping windshield");
	}
	
	public static void main(String[] args) {
		

	}

	@Override
	public void start() {
		System.out.println("Car started!!");
	}

	@Override
	public void stop() {
		System.out.println("Car stopped!");
	}
	
//	public void showInfo() {
//		System.out.println("Car name: " + name);
//	}

}
