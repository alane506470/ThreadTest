package com.alan.vo;

public class SumThread implements Runnable {
	public int sum = 0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// �H�W Thread ���{���p�G���槹���N�|�o�X�q�� (notify) ���槹���F
		synchronized(this) {
		for(int i=0; i<=100;i++) {
			sum=sum + i;
		}
		notify();
		}
		
	}

}
