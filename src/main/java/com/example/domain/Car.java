package com.example.domain;

public class Car {

	private String carName;
	
	private String color;
	
	private Integer speed;

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", color=" + color + ", speed=" + speed + "]";
	}
	
}
