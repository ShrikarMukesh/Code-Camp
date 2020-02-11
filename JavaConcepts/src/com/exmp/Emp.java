package com.exmp;
class Practice  extends Thread{
	@Override
	public void run() {

		for(int i=1;i<5;i++){  
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){
				System.out.println(e);
			}  
			System.out.println(i);  
		}  
	}
}
class Emp  {
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		Practice p = new Practice();
		p.start();
		p.start();
	}
}