package com.thread.printnumber.waitnotify.bythreethread;

public class PrintNumberByThreeThreads implements Runnable {

	private MyResourceForThreeThreads test;

	private int name;

	PrintNumberByThreeThreads(MyResourceForThreeThreads test, int name) {
		this.test = test;
		this.name = name;
	}

	@Override
	public void run() {

		try {
			test.printOddEven(name);
		} catch (InterruptedException e) {
			System.out.println("Exception Occurs :");
		}
	}

}
