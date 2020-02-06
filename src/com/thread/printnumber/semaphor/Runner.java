package com.thread.printnumber.semaphor;

import java.util.concurrent.Semaphore;

public class Runner {

	public static void main(String[] args) throws InterruptedException {
		Semaphore semaphore = new Semaphore(1);
		Resource test = new Resource();
		com.thread.printnumber.semaphor.EvenAndOddNumberThread r1 = new com.thread.printnumber.semaphor.EvenAndOddNumberThread(
				"First Thread", semaphore, test);
		com.thread.printnumber.semaphor.EvenAndOddNumberThread r2 = new com.thread.printnumber.semaphor.EvenAndOddNumberThread(
				"Second Thread", semaphore, test);
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();

	}

}
