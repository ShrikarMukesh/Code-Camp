package com.arrays;

import java.util.Scanner;

public class GradingStudents2 {
	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        System.out.println("how much?");
        int n = scan.nextInt();
        while (n-- > 0) {
            int grade = scan.nextInt();
            System.out.println(roundGrade(grade));
        }
        scan.close();
    }
    
    private static int roundGrade(int grade) {
        if (grade >= 38) {
        	
            int gradeMod5 = grade % 5;
            if (gradeMod5 > 2) {
                grade = grade +  5 - gradeMod5;
            }
        }
        return grade;
    }
}
