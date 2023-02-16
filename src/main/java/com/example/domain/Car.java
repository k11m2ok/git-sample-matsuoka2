package com.example.domain;

public class Car {

	private String carName3;
	
	private String color;
	
	private Integer speed;

	public String getCarName3() {
		return carName3;
	}

	public void setCarName3(String carName3) {
		this.carName3 = carName3;
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
		return "Car [carName3=" + carName3 + ", color=" + color + ", speed=" + speed + "]";
	}

}
