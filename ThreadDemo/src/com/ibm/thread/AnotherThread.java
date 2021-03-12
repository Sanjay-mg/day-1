package com.ibm.thread;

public class AnotherThread implements Runnable{

	@Override
	public void run() {
		System.out.println("Another thread: "+ Thread.currentThread());
		
	}

}
