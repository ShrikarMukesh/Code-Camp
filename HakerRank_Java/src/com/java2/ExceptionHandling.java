package com.java2;

import java.util.*;
import java.util.Scanner;

class ExceptionHandling {
	public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      try {
    	  int c = a/b;
    	  System.out.println(c);
    	  
      }catch (InputMismatchException e) {
          System.out.println(e.getClass().getName());
      } catch (ArithmeticException e) {
          System.out.println(e.getClass().getName() + ": / by zero");
      }
      scanner.close();
	}
}
