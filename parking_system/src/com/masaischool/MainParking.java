package com.masaischool;

public class MainParking {

	public static void main(String[] args) {
		ParkingLot parkingLot = new ParkingLot(2,2,2);
		
		Vehicle car1 = new Vehicle("HR 16 6232 ", "White", VehicleType.CAR, "token1");
		String token1 = parkingLot.addVehicle(car1);
		
		Vehicle car2 = new Vehicle("HR 05 3932", "Black", VehicleType.CAR, "token1");
		String token2 = parkingLot.addVehicle(car2);
		
		parkingLot.removeVehicle(token1);
		
		System.out.println("Availability on floor 1 : "+ parkingLot.checkAvailability(1, VehicleType.CAR));
	}
	
	
	
}
