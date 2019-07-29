package com.cts.oops;

public class MountainBike extends Bike {
	
	
	int gears;
	
	public MountainBike(int speed) {
		super();
		this.speed = speed;
		gears = 0;
	}
	
	public void changeGears(){
		gears++;
	}

	@Override
	public String toString() {
		return "MountainBike [speed=" + speed + ", gears=" + gears + "]";
	}

	@Override
	public void speedUp() {
		speed++;
		
	}

	
	
}
