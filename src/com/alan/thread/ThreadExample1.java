package com.alan.thread;

import com.alan.vo.SumThread;
import com.alan.vo.Thread1;
import com.alan.vo.Thread2;

public class ThreadExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// extends Thread
//		thread1method();
		// Implement Runnable
//		thread2method();
		// �O�]���b���� Thread �ɤw�g�N���G���L�X�Ӥ���A�~���� run ��k���p�� 1 �[�� 100�C�]���y�����檺���G�����D�C
		threadSum();
	}
	
	protected  static void thread1method() {
		Thread1 thread1 = new Thread1("message1");
		Thread1 thread2 = new Thread1("message2");
		Thread1 thread3 = new Thread1("message3");
		Thread1 thread4 = new Thread1("message4");
		Thread1 thread5 = new Thread1("message5");
		Thread1 thread6 = new Thread1("message6");
		Thread1 thread7 = new Thread1("message7");
		Thread1 thread8 = new Thread1("message8");
		Thread1 thread9 = new Thread1("message9");
		Thread1 thread10 = new Thread1("message10");
	      thread1.start();
	      thread2.start();
	      thread3.start();
	      thread4.start();
	      thread5.start();
	      thread6.start();
	      thread7.start();
	      thread8.start();
	      thread9.start();
	      thread10.start();
	}
	
	protected static void thread2method() {
		Thread thread1 = new Thread(new Thread2("message1"));
	      Thread thread2 = new Thread(new Thread2("message2"));
	      Thread thread3 = new Thread(new Thread2("message3"));
	      Thread thread4 = new Thread(new Thread2("message4"));
	      Thread thread5 = new Thread(new Thread2("message5"));

	      thread1.start();
	      thread2.start();
	      thread3.start();
	      thread4.start();
	      thread5.start();
	}
	
	protected static void threadSum() {
		SumThread sum=new SumThread();
		Thread thread = new Thread(sum);
		thread.start();
		  synchronized(thread) {
	            try {
					thread.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
		int result=sum.sum;
		System.out.println("Count result is:" + result);
		
	}

}
