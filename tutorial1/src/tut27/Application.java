package tut27;

public class Application {
	public static void main(String[] args) {

		Machine mach1 = new Machine();
		
		mach1.start();
		mach1.stop();
		
		Car car1 = new Car();
		
		car1.start();
		car1.wipeWindShield();
		
	}

}
