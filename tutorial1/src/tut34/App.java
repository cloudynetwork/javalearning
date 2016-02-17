package tut34;

import java.util.ArrayList;

class Machine {

	@Override
	public String toString() {
		return "I am a machine";
	}
	
	public void start() {
		System.out.println("Starting!");
	}
	
}

class Camera extends Machine {
	@Override
	public String toString() {
		return "I am a camera";
	}
	
	public void snap() {
		System.out.println("snap!");
	}
	

}

public class App {

	public static void main(String[] args) {
		
		ArrayList<Machine> list1 = new ArrayList<Machine>();
		
		list1.add(new Machine());
		list1.add(new Machine());
		
		showList(list1);
		
	ArrayList<Camera> list2 = new ArrayList<Camera>();
		
		list2.add(new Camera());
		list2.add(new Camera());
		
		showList(list2);
		
		
	ArrayList<Machine> list3 = new ArrayList<Machine>();
		list3.add(new Camera ());
		list3.add(new Machine ());
	}
	
	public static void showList(ArrayList<? extends Machine> list) {
		for (Machine value : list) {
			System.out.println(value);
			value.start();
		}
	}

	public static void showList2(ArrayList<? super Camera> list) {
		for (Object value : list) {
			System.out.println(value);
		}
	}

}
