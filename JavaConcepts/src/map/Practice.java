package map;

import java.util.HashMap;
public class Practice {
	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<>();
		map.put("Shrikar","Software Engineer"); 
		map.put("Kiran","Oil businness");
		map.put("Dinesh","Teacher"); 
		map.put("Nitish","Bussinessman");
		
		map.forEach((K,V) -> System.out.println(K+"            "+V));;
	}
}
