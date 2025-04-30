package com.learning.thread;

public class WithoutSynchKeyThread extends Thread{
	int count=0;
	
	public void run() {
		increment();
		System.out.println("Count : "+count);
	}

	void increment() {
		count++;
	}

}
