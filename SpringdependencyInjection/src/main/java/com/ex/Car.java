package com.ex;

public class Car implements Vehicle{
	private String fuelType;
	private int Speed;
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getSpeed() {
		return Speed;
	}
	public void setSpeed(int speed) {
		Speed = speed;
	}
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Car Started");
		System.out.println("Fuel Type = "+fuelType);
		System.out.println("Speed is "+Speed);
	}
	

}
