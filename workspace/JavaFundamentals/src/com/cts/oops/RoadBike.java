package com.cts.oops;

public class RoadBike extends Bike {

	
	public RoadBike(int speed) {
		this.speed = speed;
	}


	@Override
	public void speedUp(){
		speed+=2;
	}
	@Override
	public String toString() {
		return "RoadBike [speed=" + speed + "]";
	}


	@Override
	public void changeGears() {
		
	}
	
	
}
