package list_interface;

import java.util.*;

public class ListIterator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Text 1");
		list.add("Text 2");
		list.add("Text 3");
	    list.forEach((String) -> System.out.println(list));
	}
}
