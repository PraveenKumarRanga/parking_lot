package com.masaischool;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;




public class ParkingLot {

	private int numFloors;
	
	private int spacePerFloor;
	
	private List<Floor> floors;

	public ParkingLot(int numFloors, int capacity, int spacePerFloor) {
		super();
		this.numFloors = numFloors;
		this.spacePerFloor = spacePerFloor;
		this.floors = new ArrayList<>();
		
		for(int i=1; i<numFloors; i++) {
			floors.add(new Floor(i,capacity, spacePerFloor));
		}
		
	}
	
	
	public String addVehicle(Vehicle vehicle) {
		
		for(Floor floor : floors) {
			List<ParkingSpace> space = floor.getSpaceForType(vehicle.getType());
			
			for(ParkingSpace s : space) {
				if(s.isAvailability()) {
					s.occupy(vehicle);
					System.out.println("Registration num : "+ vehicle.getRegistrationNum() +
							"parked space : "+ s.getSpaceNum() + "floor num : "+ floor.getFloorNumber());
					return vehicle.getToken();
				}
			}
		}
		System.out.println("Parking is full.");
		return null;
		
	}
	
	public void removeVehicle(String token) {
	
		for(Floor floor : floors) {
			
			for(List<ParkingSpace> spaces : floor.getSpaceMap().values()) {
				for(ParkingSpace space : spaces) {
					if(!space.isAvailability() && space.getParkedVehicle().getToken().equals(token)) {
						space.vacate();
						System.out.println("Vehicle with token : "+ token + " removed.");
						return;
					}
				}
			}
		}
		System.out.println("Vehicle with token : "+ token + " not found in parking lot.");
		
	}

	
	public boolean checkAvailability(int floorNum, VehicleType type) {
		if(floorNum < 1 || floorNum > numFloors) {
			System.out.println("Invalid floor number...");
			return false;
		}
		
		Floor floor = floors.get(floorNum-1);
		List<ParkingSpace> spaces = floor.getSpaceForType(type);
		
		for(ParkingSpace space : spaces) {
			if(space.isAvailability()&& space.getType() == type) {
				return true;
			}
			
		}
		return false;
		
		
		
		
	}

	private String generateToken() {
		// TODO Auto-generated method stub
		return "ABC123";   // dummy token
	}
	
	
}
