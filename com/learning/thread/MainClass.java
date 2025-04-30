package com.learning.thread;

public class MainClass extends Thread{
	
	public void run() {
		synchronized (this) {
			try {
				for(int i=1;i<=5;i++) 
				{
					Thread.sleep(10);
					System.out.println(i+":"+this.getName());
				}
			}catch(Exception e) {
				System.out.println(e);
			}	
		}
		
	}

	public static void main(String[] args) {
		MainClass mc= new MainClass();
		MainClass mc1= new MainClass();
		MainClass mc2= new MainClass();
		mc2.start();
		mc.start();
		mc1.start();
	}

}
