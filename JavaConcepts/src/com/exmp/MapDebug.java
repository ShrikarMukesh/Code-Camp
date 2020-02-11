package com.exmp;

import java.util.HashMap;
import java.util.Map;

public class MapDebug {
	public static void main(String[] args) {
		
		String s1 ="bb";
		String s2 ="bb";
		//System.out.println(s1.hashCode() + " " + s2.hashCode());
       Map<String,Integer> map = new HashMap<>();
       map.put(s1, 1);
       map.put(s2, 2);
       System.out.println(map);
       
    		   
	}
}
