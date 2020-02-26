package list_interface;

import java.util.*;

public class ListIterator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Text 1");
		list.add("Text 2");
		list.add("Text 3");
		list.add("Text 4");
	    list.forEach((text -> System.out.println(text)));
	    System.out.println("Using for each loop");
	    for(String text : list) {
	    	System.out.println(text);
	    }
	    
	}
}
