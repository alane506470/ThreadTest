package com.alan.vo;

public class Thread1 extends Thread {
	private String message;
	public Thread1(String message) {
		this.message=message;
	}
	
	public void run() {
		System.out.println("Thread message is: " + this.message);
	}
}
