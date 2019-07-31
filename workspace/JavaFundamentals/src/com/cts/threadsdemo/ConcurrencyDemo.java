package com.cts.threadsdemo;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ConcurrencyDemo {

	public static void main(String[] args) {
		
		ExecutorService threadPool = new ThreadPoolExecutor(2, 2,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());
		
		for(int i=0;i<10;i++){
			MyTask2 task = new MyTask2();
			Future<Double> f = threadPool.submit(task);
			try {
				System.out.println(f.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		threadPool.shutdown();
		
		System.out.println("allz well thats ends well");
		
		

	}

}
