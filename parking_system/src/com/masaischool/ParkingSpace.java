package com.masaischool;


public class ParkingSpace {

	private int spaceNum;
	
	private boolean availability;
	
	private VehicleType type;
	
	private Vehicle parkedVehicle;

	
	public ParkingSpace() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ParkingSpace(int spaceNum, VehicleType type) {
		super();
		this.spaceNum = spaceNum;
		this.availability = true;
		this.type = type;
		
	}
	
	
	
	/**
	 * @return the spaceNum
	 */
	public int getSpaceNum() {
		return spaceNum;
	}

	/**
	 * @param spaceNum the spaceNum to set
	 */
	public void setSpaceNum(int spaceNum) {
		this.spaceNum = spaceNum;
	}

	/**
	 * @return the availability
	 */
	public boolean isAvailability() {
		return availability;
	}

	/**
	 * @param availability the availability to set
	 */
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	/**
	 * @return the type
	 */
	public VehicleType getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(VehicleType type) {
		this.type = type;
	}

	/**
	 * @return the parkedVehicle
	 */
	public Vehicle getParkedVehicle() {
		return parkedVehicle;
	}

	/**
	 * @param parkedVehicle the parkedVehicle to set
	 */
	public void setParkedVehicle(Vehicle parkedVehicle) {
		this.parkedVehicle = parkedVehicle;
	}

	public void occupy(Vehicle vehicle) {
		parkedVehicle = vehicle;
		
		availability = false;
	}
	
	public void vacate() {
		parkedVehicle = null;
		availability = true;
	}
	
	
	
}
