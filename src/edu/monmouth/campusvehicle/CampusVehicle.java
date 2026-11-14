package edu.monmouth.campusvehicle;

public class CampusVehicle {
	
	// class attributes
	private String id;
	private String location;
	private boolean available;
	private Color color;
	
	// Default constructor setting the attributes to default values
	public CampusVehicle() {
		setId(CampusVehicleConstants.DEFAULT_ID);
		setLocation(CampusVehicleConstants.DEFAULT_LOCATION);
		setAvailable(CampusVehicleConstants.DEFAULT_AVAILABLE);
		setColor(CampusVehicleConstants.DEFAULT_COLOR);
	}
	
	// constructor setting attributes to parameter value, apart from color which is set to default
	public CampusVehicle(String id, String location, boolean available) {
		setId(id);
		setLocation(location);
		setAvailable(available);
		setColor(CampusVehicleConstants.DEFAULT_COLOR);
	}
	
	// Using delegation by calling the three parameter constructor and then setting the color
	public CampusVehicle(String id, String location, boolean available, Color color) {
		this(id, location, available);
		setColor(color);
	}
	
	// accessor for the id attribute
	public String getId() {
		return id;
	}
	
	// Updated setId method based on what is said in point 2
	public void setId(String id) {
		if ((id != null) && (id.equals("") == false) && (id.length()>= CampusVehicleConstants.LOWER_ID_LIMIT)
				&& (id.length() <= CampusVehicleConstants.UPPER_ID_LIMIT) && (id.substring(0,2).equalsIgnoreCase("mu"))) {
		this.id = id.toLowerCase();
		}
		else {
			this.id = "UNKNOWN"; // Point number 3
		}
	}
	
	// accessor for the location 
	public String getLocation() {
		return location;
	}
	
	// Refactoring the setLocation method by comparing location an array of locations
	public void setLocation(String location) {
		boolean validLocation = false;
		for (String value : CampusVehicleConstants.LOCATIONS) {
			if ((location.toLowerCase()).equals(value)){
				validLocation = true;
				break;
			}
		}
		
		if ((location != null) && (location.equals("") == false) && (validLocation == true)){
			this.location = location.toLowerCase();
				}
		else {
			this.location = "UNKNOWN"; // point 5
		}
		
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	// Updated method based on point 6
	public void checkOut() {
		if (this.available == true){
		available = false;
		}
		
	}
	public void returnVehicle() {
		available = true;
	}
	
	// The mutator method for the color variable
	public void setColor(Color color) {
		this.color = color;
	}
	
	// The accessor method for the color variable
	public Color getColor() {
		return color;
	}

}
