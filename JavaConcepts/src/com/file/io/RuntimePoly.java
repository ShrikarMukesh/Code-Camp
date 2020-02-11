package com.file.io;
class Parent{
	 int a =10;
	public void run() {	
		System.out.println("Running parent");
	}
}
class Child extends Parent{
	int a=90;
	public void run() {
		System.out.println("Running Child");
		super.run();
		System.out.println(super.a);
	}
}
public class RuntimePoly {
	public static void main(String[] args) {
       Child c = new Child();
       c.run();
        System.out.println(c.a);
	}
}
