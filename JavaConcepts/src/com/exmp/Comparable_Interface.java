package com.exmp;

import java.util.*;


class Cricketer implements Comparable<Object>{
	String name;
	int runs;
	float avg;

	public Cricketer(String name, int runs, float avg) {
		super();
		this.name = name;
		this.runs = runs;
		this.avg = avg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public float getAvg() {
		return avg;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		//return "Cricketer [name=" + name + ", runs=" + runs + ", avg=" + avg + "]";
		return name+ " "+ runs+" "+avg;
	}

	@Override
	public int compareTo(Object o) {
      if(this.runs > ((Cricketer)(o)).runs) {
    	  return 1;
      } else if(this.runs < ((Cricketer)(o)).runs) {
    	  
    	  return -1;
      }else {
    	  return 0;
      }
	}

	
}
public class Comparable_Interface {
	
	public static void main(String[] args) {
        Cricketer c1 = new Cricketer("Dhoni", 1000, 55.5f);
        Cricketer c2 = new Cricketer("Virat", 20000, 65.5f);
        Cricketer c3 = new Cricketer("ABD", 300, 75.5f);
        ArrayList<Cricketer>  al = new ArrayList<Cricketer>();
        al.add(c1);
        al.add(c2);
        al.add(c3);
        System.out.println(al);
       Collections.sort(al);
       System.out.println(al);
	}
}
