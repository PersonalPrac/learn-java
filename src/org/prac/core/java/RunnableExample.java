package org.prac.core.java;

class RunnableThread implements Runnable{

	Thread runner;
	
	public RunnableThread() {}
	
	public RunnableThread(String threadName) {
		runner = new Thread(this, threadName);
		System.out.println("Runner Name:"+ runner.getName());
		runner.start();
	}
	
	@Override
	public void run() {
		System.out.println("Thread in Runnable Thread:" +Thread.currentThread());
		
	}
	
}

public class RunnableExample {
	
	public static void main(String[] args) {
		Thread thread1 = new Thread(new RunnableThread(), "thread1");
		Thread thread2 = new Thread(new RunnableThread(),"thread2");
		
		RunnableThread thread3 = new RunnableThread("thread3");
		
		thread1.start();
		thread2.start();
		
		try {
			Thread.currentThread().sleep(1000);
		} catch(InterruptedException ie)
		{
			System.out.println(ie.getStackTrace());
		}
		
		System.out.println("Main Thread:"+ Thread.currentThread());
	}
	
	
}
