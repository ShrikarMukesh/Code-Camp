package com.java;

import java.util.Scanner;

public class JavaStdinandStdout {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		double d = scan.nextDouble();
        String s = scan.nextLine();
      
       
        //s="Welcome to HackerRank's Java tutorials!";
       // i =42;
        //
        if(i == 42) {
        	System.out.println("String: " + s);
        }
		if(d == 3.1415) {
			System.out.println("Double: " + d);
		}
		if(s == "Welcome to HackerRank's Java tutorials") {
		   System.out.println("Int: " + i);
		}
		scan.close();
	}

}
