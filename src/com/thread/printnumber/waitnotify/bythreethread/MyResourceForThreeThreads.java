package com.thread.printnumber.waitnotify.bythreethread;

public class MyResourceForThreeThreads {

	private volatile int i = 0;
	private volatile int previous = 0;

	public void printOddEven(int threadnumber) throws InterruptedException {

		synchronized (this) {

			while (i < 10) {

				if (previous + 1 == threadnumber) {
					i++;
					System.out.println("Thread Number: " + threadnumber + " Number: " + i);

					notifyAll();
					previous++;
					if (previous == 6) {
						previous = 0;
					}
				}else{
					wait();
				}
			}
		}

	}

}
