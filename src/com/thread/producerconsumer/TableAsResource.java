package com.thread.producerconsumer;

import static java.lang.System.out;

public class TableAsResource {

	public TableAsResource() {

	}

	public void accupyTable(String type) {

		synchronized (this) {

			notifyAll();
			if (Client.CUSTOMER.equalsIgnoreCase(type)) {
				out.println("Now table is in use by customer so, vator have to wait  ");
				try {
					Thread.sleep(1000);
					out.println("Now customer has finish his food. ");
				} catch (InterruptedException e) {
				}
			} else if (Client.VAITOR.equalsIgnoreCase(type)) {
				out.println("Now table is free vator can put any thing on table.");

				try {
					Thread.sleep(1000);
					out.println("Now vator has finish his task. ");
				} catch (InterruptedException e) {

				}
			}

			try {
				wait();
			} catch (InterruptedException e) {
			}

		}
	}

}
