package com.thread.printnumber.waitnotify.bythreethread;

public class RunnerForThreeThreads {
	public static void main(String[] args) throws InterruptedException {
		MyResourceForThreeThreads test = new MyResourceForThreeThreads();

		PrintNumberByThreeThreads r1 = new PrintNumberByThreeThreads(test, 1);
		PrintNumberByThreeThreads r2 = new PrintNumberByThreeThreads(test, 2);
		PrintNumberByThreeThreads r3 = new PrintNumberByThreeThreads(test, 3);
		
		PrintNumberByThreeThreads r4 = new PrintNumberByThreeThreads(test, 4);
		PrintNumberByThreeThreads r5 = new PrintNumberByThreeThreads(test, 5);
		PrintNumberByThreeThreads r6 = new PrintNumberByThreeThreads(test, 6);
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		
		Thread t4 = new Thread(r4);
		Thread t5 = new Thread(r5);
		Thread t6 = new Thread(r6);
		
		
		t1.start();
		t2.start();
		t3.start();
		
		t4.start();
		t5.start();
		t6.start();

	}
}
