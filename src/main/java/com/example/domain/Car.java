package com.example.domain;

public class Car {

	private String carName2;
	
	private String color;
	
	private Integer speed;

	public String getCarName2() {
		return carName2;
	}

	public void setCarName2(String carName2) {
		this.carName2 = carName2;
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
		return "Car [carName2=" + carName2 + ", color=" + color + ", speed=" + speed + "]";
	}

	
}
