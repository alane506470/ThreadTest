package com.alan.vo;

public class SumThread implements Runnable {
	public int sum = 0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// 以上 Thread 的程式如果執行完成就會發出通知 (notify) 執行完成了
		synchronized(this) {
		for(int i=0; i<=100;i++) {
			sum=sum + i;
		}
		notify();
		}
		
	}

}
