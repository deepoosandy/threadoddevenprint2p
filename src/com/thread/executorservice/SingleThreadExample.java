package com.thread.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExample {
public static void main(String[] args) {
	ExecutorService executor=Executors.newSingleThreadExecutor();
	
	executor.execute(()->{
		System.out.println("Single Thread Emplementation");
	});
	executor.submit(()->{
		System.out.println("Single Thread Emplementation");
	});
	
	ExecutorService fixedExecutor=Executors.newFixedThreadPool(3);
	fixedExecutor.execute(()->{
		System.out.println("Fixed 1 Thread Emplementation");
	});
	fixedExecutor.submit(()->{
		System.out.println("Fixed 2 Thread Emplementation");
	});
	
	fixedExecutor.execute(()->{
		System.out.println("Fixed 3 Thread Emplementation");
	});
	fixedExecutor.submit(()->{
		System.out.println("Fixed 4 Thread Emplementation");
	});
}
}
