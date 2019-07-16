package com.thread.printnumber.waitnotify;

public class Runner {
	public static void main(String[] args) throws InterruptedException {
		MyResource test = new MyResource();

		EvenAndOddNumberThread r1 = new EvenAndOddNumberThread(test, "First Thread");
		EvenAndOddNumberThread r2 = new EvenAndOddNumberThread(test, "Second Thread");
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();

	}
}
