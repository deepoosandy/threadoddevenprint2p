package com.thread.printnumber.semaphor;

import static java.lang.System.out;

import java.util.concurrent.Semaphore;

public class Resource {

	private volatile int i;

	public void printOddEven(String name, Semaphore semaphore) throws InterruptedException {

		
		while (i < 10) {
			semaphore.acquire();
			boolean oddAndEvn = isEven(i);
			if (oddAndEvn) {
				out.println(" Thread Name: " + name + " Even Number# " + i);

			} else {
				out.println(" Thread Name: " + name + " Odd Number# " + i);
			}
			i++;
			
			semaphore.release();
			Thread.sleep(1000);
			
		}

	}

	private boolean isEven(int i) {
		return (i % 2 == 0) ? true : false;
	}
}
