package com.cts.threadsdemo;

public class MyTask implements Runnable{

	@Override
	public void run() {
		System.out.println("Being run by: " + Thread.currentThread().getName());	
	}

}
