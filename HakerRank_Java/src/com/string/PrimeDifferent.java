package com.string;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimeDifferent {
	
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner scanner = new Scanner(System.in);
		BigInteger n = scanner.nextBigInteger();
		System.out.println(n.isProbablePrime(10) ? "prime" : "not prime");
		scanner.close();
	}

}
