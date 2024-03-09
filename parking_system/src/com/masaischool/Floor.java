package com.masaischool;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




public class Floor {

	
	private int floorNumber;
	
	private int capacity;
	
	private Map<VehicleType, List<ParkingSpace>> spaceMap;

	
	
	public Floor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Floor(int floorNumber, int capacity, int capacityPerType) {
		super();
		this.floorNumber = floorNumber;
		this.capacity = capacity;
		this.spaceMap = new HashMap<>();
		
		for(VehicleType type : VehicleType.values()) {
			spaceMap.put(type, new ArrayList<>());
			
			for(int i=1; i<capacityPerType; i++) {
				spaceMap.get(type).add(new ParkingSpace(i,type));
			}
		}
		
	}
	
	/**
	 * @return the floorNumber
	 */
	public int getFloorNumber() {
		return floorNumber;
	}


	/**
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}

	public List<ParkingSpace> getSpaceForType(VehicleType type){
		return spaceMap.get(type);
	}

	/**
	 * @return the spaceMap
	 */
	public Map<VehicleType, List<ParkingSpace>> getSpaceMap() {
		return spaceMap;
	}

	/**
	 * @param spaceMap the spaceMap to set
	 */
	public void setSpaceMap(Map<VehicleType, List<ParkingSpace>> spaceMap) {
		this.spaceMap = spaceMap;
	}



	

	
	
	
	
}
