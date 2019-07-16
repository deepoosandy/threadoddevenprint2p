package com.thread.printnumber.waitnotify;

import static java.lang.System.out;

public class MyResource {

	private volatile int i = 0;

	public void printOddEven(String name) throws InterruptedException {

		synchronized (this) {

			while (i < 10) {
				boolean oddAndEvn = isEven(i);
				if (oddAndEvn) {
					out.println(" Thread Name: " + name + " Even Number# " + i);

				} else {
					out.println(" Thread Name: " + name + " Odd Number# " + i);
				}
				i++;
				notify();
				wait();

			}
		}

	}

	private boolean isEven(int i) {
		return (i % 2 == 0) ? true : false;
	}

}
