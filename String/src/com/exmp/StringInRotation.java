package com.exmp;

public class StringInRotation {

	public static void main(String[] args) {
		String s1="J2EEJavaStrutsHibernate";
		String s2="HibernateStrutsJ2EEJava";
		
		if(s1.length()!=s2.length())
		{
			System.out.println("Strings are not in rotation.");
		}
		else
		{
			String s3 = s1+s1;
			if(s3.contains(s2))
			{
				System.out.println("Strings are in rotation.");
			}
			else
			{
				System.out.println("Strings are not  in rotation.");
			}
		}

	}

}
