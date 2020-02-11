package com.java;
import java.util.Scanner;
class Maggi {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter a number");
		int N = scanner.nextInt();
		
		int i =1;
        if(N <= 20) {
   
        	while(i<=10) {
        		int ans  = N * i;
        		System.out.println(N+"*"+i+"="+ans);
        		i++;
        	}
        }
        scanner.close();
	}
}
