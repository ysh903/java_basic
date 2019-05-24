package day10.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test04 {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		set.add("hello");
		set.add("hello2");
		set.add("hello9");
		set.add("hello1");
		set.add("hello");
		System.out.println(set);
		
		
	
		
		Set<Book> set1 = new TreeSet<Book>();
		set1.add(new Book("hello", 2000));
		set1.add(new Book("hi", 200));
		set1.add(new Book("Thanks", 4000));
		set1.add(new Book("Thanks", 4000));
		System.out.println(set1);
		
		//for (Book data:set1) {
		//	System.out.println(data);
		//}
		Iterator<Book> it = set1.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			//System.out.println(book);
			if (book.getTitle().equalsIgnoreCase("hello")){
				it.remove();
			}
		}
		
		
	}
}
