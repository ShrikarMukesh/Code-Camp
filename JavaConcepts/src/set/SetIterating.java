package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIterating {
    public static void main(String[] args) {
    	
    	Set<String> setOfBooks = new HashSet<>(); 
    	setOfBooks.add("Effective Java"); 
    	setOfBooks.add("Clean Code"); 
    	setOfBooks.add("Refactoring"); 
    	setOfBooks.add("Head First Java"); 
    	setOfBooks.add("Clean Coder");
    	
    	System.out.println("-----Using for each loop");
    	for(String book : setOfBooks) {
    		System.out.println(book);
    	}
    	System.out.println("-----Using Iterator");
        Iterator<String> itr = setOfBooks.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
        System.out.println("-------Using double colon operator");
    	setOfBooks.forEach(System.out::println);
    	
    	
	}
}
