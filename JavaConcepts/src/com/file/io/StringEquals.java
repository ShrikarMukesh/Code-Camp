package com.file.io;

public class StringEquals {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
          String s1 = new String("ABC");
          StringBuffer s2 = new StringBuffer("ABC");
          System.out.println(s1.equals(s2));
	}
}
