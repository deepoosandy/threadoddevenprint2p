package com.thread.producerconsumer;

public class Client {
	public static final String VAITOR = "vaitor";
	public static final String CUSTOMER = "customer";

	public static void main(String args[]) {

		TableAsResource tableAsResource = new TableAsResource();

		MyThread vaitor = new MyThread(VAITOR, tableAsResource);
		MyThread customer = new MyThread(CUSTOMER, tableAsResource);
		vaitor.start();
		customer.start();
	}
}
