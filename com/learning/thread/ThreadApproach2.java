package com.learning.thread;

public class ThreadApproach2 implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Accessing Thread via Runnable Interface!");
		try {
			Thread.sleep(2000);
		}catch(Exception e) {
			
		}
		}
	}

}
