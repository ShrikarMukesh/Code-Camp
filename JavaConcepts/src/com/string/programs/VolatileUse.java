package com.string.programs;

public class VolatileUse {
    volatile int x =0;
    public void writeThread() {
    	x=1;
    }
    public void readThread() {
      int r2 = x;
      System.out.println(r2);
    }
    public static void main(String[] args) {
		VolatileUse v = new VolatileUse();
		v.readThread();
	}
}
