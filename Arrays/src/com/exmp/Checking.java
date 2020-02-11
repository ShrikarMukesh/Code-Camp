package com.exmp;

public class Checking {
	public static void main(String[] args) {

		String s1="J2eeJavaStrutsHibernate";
		String s2="HibernateStrutsJ2eeJava";

		if(s1.length()!=s2.length()){
			
			System.out.println("Strings are not in rotataion.");
		}
		else{

			String s3=s1+s1;
			if(s3.contains(s2)){
				
				System.out.println("Strings are in rotataion.");
			}
			else{
				
				System.out.println("Strings are not in rotataion.");
			}
		}
	}
}
