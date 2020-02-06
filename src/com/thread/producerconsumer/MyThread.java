package com.thread.producerconsumer;

public class MyThread extends Thread {
	private String type;
	private TableAsResource tableAsResource;

	public MyThread(String type, TableAsResource tableAsResource) {
		this.type = type;
		this.tableAsResource = tableAsResource;

	}

	public void run() {
		tableAsResource.accupyTable(type);
	}
}
