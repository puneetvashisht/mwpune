package com.cts.oops;

public class MotorBike extends Bike {
	
	int cc;
	int gears = 0;

	@Override
	public void speedUp() {
		speed+=5;
	}

//	@Override
	public void changeGears() {
		gears++;
		
	}

	
	
	

}
