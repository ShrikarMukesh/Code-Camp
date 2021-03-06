package com.arrays;

import java.util.Scanner;

class TimeConversion {
	
	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the time");
        //Input ---- 07:05:45PM
        
        String str = scan.nextLine();
        scan.close();
        
        int hours   = Integer.parseInt(str.substring(0,2));
        int minutes = Integer.parseInt(str.substring(3,5));
        int seconds = Integer.parseInt(str.substring(6,8));

        /* Convert to 24-hour format */
        if (str.substring(8, 10).equals("PM") && hours != 12) {
            hours += 12;
        } 
        else if (str.substring(8, 10).equals("AM") && hours == 12) {
            hours = 0;
        }
        System.out.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
