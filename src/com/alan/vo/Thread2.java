package com.alan.vo;

public class Thread2 implements Runnable {
	private String message;
	
	public Thread2(String message) {
		this.message=message;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread message is:" + this.message);
	}

}
