package tut31;

 class Plant {
	
	public static final int ID = 7;
	 private String name;

	private int calculateGrowthForecast() {
		return 9;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class App {
 
	Plant plant1 = new Plant();
	
	private void testMethod() {
		plant1.getName();
	}

	
}
