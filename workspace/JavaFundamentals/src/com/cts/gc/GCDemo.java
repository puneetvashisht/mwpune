package com.cts.gc;

public class GCDemo {

	public static void main(String[] args) {
		String str = "";
		for(int i=0; i<100000000; i++){
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			str = str + i;
			
		}

	}

}
