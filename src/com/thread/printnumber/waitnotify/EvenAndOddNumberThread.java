package com.thread.printnumber.waitnotify;

public class EvenAndOddNumberThread implements  Runnable{
	
	private MyResource test;
	
	private String name;
	

	EvenAndOddNumberThread(MyResource test,String name) {
		this.test=test;
		this.name=name;
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
