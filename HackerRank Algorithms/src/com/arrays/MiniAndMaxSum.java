package com.arrays;
import java.util.Scanner;
// inputs 1 2 3 4 5 
// inputs 1 3 5 7 9
class MiniAndMaxSum {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long sum = 0;
        long min = Integer.MAX_VALUE;
        long max = Integer.MIN_VALUE;
        System.out.println("Enter the elements into the array");
        for (int i = 0; i < 5; i++) {
            long num = scan.nextLong();
            sum = sum + num;
            min = Math.min(min, num);
            max = Math.max(max, num);
            
        }
        scan.close();
        System.out.print((sum - max) + " " + (sum - min));
    }
}
