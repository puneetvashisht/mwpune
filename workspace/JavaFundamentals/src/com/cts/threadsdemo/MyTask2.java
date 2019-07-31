package com.cts.threadsdemo;

import java.util.concurrent.Callable;

public class MyTask2 implements Callable<Double>{


	@Override
	public Double call() throws Exception {
		System.out.println("Being run by: " + Thread.currentThread().getName());	
		return (Math.random()*10);
	}

}
