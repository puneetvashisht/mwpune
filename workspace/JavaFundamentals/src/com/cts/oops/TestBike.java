package com.cts.oops;

public class TestBike {
	
	public static void main(String[] args) {
		
		
		
		MountainBike mb = new MountainBike(10);
		RoadBike rb = new RoadBike(15);
		
		
		IBike bikes[] = {mb, rb};
		
		for(IBike b: bikes){
			System.out.println(b);
			b.speedUp();
			System.out.println(b);
			b.brakeDown();
			System.out.println(b);
			
			b.changeGears();
		}
		
		
	}

}
