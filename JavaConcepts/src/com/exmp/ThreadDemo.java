package com.exmp;
class MyThread extends Thread{
	@Override
	public void run() {
		for(int i =0;i<10;i++) {
			System.out.println("child thrad");
		}

	}
}
public class ThreadDemo{
	public static void main(String[] args) {
       MyThread t = new MyThread();
       t.run();
       for(int i =0;i<10;i++) {
    	   System.out.println("main thread");
       }
	}
}
