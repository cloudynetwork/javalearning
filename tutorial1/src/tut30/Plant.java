package tut30;

public class Plant {

	// Bad practice
	public String name;

	// Acceptable as it's final. 
	public final static int ID = 8;
	
	private String plantType; 
	
	protected String species; 
	
	protected String genus;
	
	public Plant() {
		
		name = "Freddy";

		setPlantType("Oak");

	}

	public String getPlantType() {
		return plantType;
	}

	public void setPlantType(String plantType) {
		this.plantType = plantType;
	}
}

/*
 *
 * private -- only within same class
 * public --- from anywhere 
 * protected --- same class, subclass and same package
 * no modifier --- same package only 
 */ 