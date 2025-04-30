package com.learning.thread;

public class ThreadConcept extends Thread{
	
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Run Methoud is Called !");
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			
		}
		}
	}

}
