package com.thread.printnumber.semaphor;

import java.util.concurrent.Semaphore;

public class EvenAndOddNumberThread extends Thread {
	private String name;
	private Resource resource;
	private Semaphore semaphore;

	EvenAndOddNumberThread(String name, Semaphore semaphore,Resource resource) {
		this.name = name;
		this.resource=resource;
		this.semaphore=semaphore;
	}

	@Override
	public void run() {
			try {
				resource.printOddEven(name,semaphore);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}

}
