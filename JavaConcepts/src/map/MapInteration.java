package map;


import java.util.*;
public class MapInteration {
	public static void main(String[] args) {
		
        HashMap<String, String> map = new HashMap<>();
        
        map.put("Shrikar","Software Engineer"); 
        map.put("Kiran","Oil businness");
        map.put("Dinesh","Teacher"); 
        map.put("Nitish","Bussinessman");
        
        System.out.println(map);
        System.out.println("---------Iterating over Map.entrySet() using For-Each loop ");
        for(Map.Entry<String, String> entry : map.entrySet()) {
        	System.out.println(entry.getKey()+"  "+entry.getValue());
        }
        
        System.out.println("---------Iterating over keys or values using keySet() and values() methods");
        for(String name: map.keySet()) {
        	 System.out.println("key: " + name);
        }
        
        for(String whatHeDoes: map.values()) {
        	System.out.println("whatHeDoes: "+whatHeDoes);
        }
        
        System.out.println("---------Iterating using iterators over Map.Entry<K, V>");
        Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();
        while(itr.hasNext()) {
        	Map.Entry<String,String> entry =itr.next();
        	System.out.println(entry.getKey() + "    "+ entry.getValue());
        }
        
        System.out.println("----Using forEach(action) method");
        map.forEach((k,v) -> System.out.println("Key = "+ k + ", Value = " + v));
        
        System.out.println("-------Iterating over keys and searching for values (inefficient)");
        for (String name : map.keySet())  { 
            // search  for value 
            String url = map.get(name); 
            System.out.println("Key = " + name + ", Value = " + url); 
        } 
        
	}
}
