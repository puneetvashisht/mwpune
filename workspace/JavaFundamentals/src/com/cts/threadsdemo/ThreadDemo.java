package com.cts.threadsdemo;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {

	public static void main(String[] args) {
		
		List<Thread> threads = new ArrayList<>();
		for(int i=0;i<10;i++){
			Thread t = new Thread(new MyTask());
			t.start();
			threads.add(t);
		}
		
		for(Thread t : threads){
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		System.out.println("Being run by: " + Thread.currentThread().getName());

	}
	

}
