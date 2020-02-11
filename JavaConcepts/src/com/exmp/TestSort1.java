package com.exmp;
import java.util.*;
class AITStudent implements Comparable<AITStudent>{  
	int rollno;  
	String name;  
	int age;  
	
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	AITStudent(int rollno,String name,int age){  
		this.rollno=rollno;  
		this.name=name;  
		this.age=age;  
	}  

	public int compareTo(AITStudent st){  
		if(age==st.age)  
			return 0;  
		else if(age>st.age)  
			return 1;  
		else  
			return -1;  
	}  
}  
public class TestSort1 {
	public static void main(String args[]){  
		ArrayList<AITStudent> al=new ArrayList<AITStudent>();  
		al.add(new AITStudent(101,"Vijay",23));  
		al.add(new AITStudent(106,"Ajay",27));  
		al.add(new AITStudent(105,"Jai",21));  

		Collections.sort(al);  
		for(AITStudent st:al){  
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
	  
	Comparator<AITStudent> cm1=Comparator.comparing(AITStudent::getName);  
	Collections.sort(al,cm1);  
	System.out.println("Sorting by Name");  
	for(AITStudent st1: al){  
		System.out.println(st1.rollno+" "+st1.name+" "+st1.age);  
	}  
	//Sorting elements on the basis of age  
	Comparator<AITStudent> cm2=Comparator.comparing(AITStudent::getAge);  
	Collections.sort(al,cm2);  
	System.out.println("Sorting by Age");  
	for(AITStudent st: al){  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
	}    
	}
}
