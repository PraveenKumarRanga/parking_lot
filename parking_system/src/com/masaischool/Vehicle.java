package com.masaischool;

public class Vehicle {

	private String registrationNum;
	
	private String color;
	
	private String token;
	
	private VehicleType type;

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String registrationNum, String color, VehicleType type, String token) {
		super();
		this.registrationNum = registrationNum;
		this.color = color;
		this.token = token;
		this.type = type;
	}

	/**
	 * @return the registrationNum
	 */
	public String getRegistrationNum() {
		return registrationNum;
	}

	/**
	 * @param registrationNum the registrationNum to set
	 */
	public void setRegistrationNum(String registrationNum) {
		this.registrationNum = registrationNum;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
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
	
	
	
}
