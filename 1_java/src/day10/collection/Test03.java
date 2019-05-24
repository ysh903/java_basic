package day10.collection;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Test03 {
	public static void main(String[] args) {


		//List<Book> list = new ArrayList<Book>();
		List<Book> list = new Vector <Book>();

		list.add(new Book("hello", 2000));
		list.add(new Book("hi", 200));
		list.add(new Book("Thanks", 4000));
		list.add(new Book("Thanks", 4000));
		//System.out.println(list);
		
		//list.remove(new Book("Thanks", 4000));
		//Collections.sort(list);

		//System.out.println(list);

		//for (int i=0;i<list.size();i++) {
		//	System.out.println(list.get(i).getTitle());
		//}
		
		Iterator<Book> it = list.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			//System.out.println(book);
			if (book.getTitle().equalsIgnoreCase("hello")){
				it.remove();
			}
		}
		System.out.println(list);
		
	}

}

class Book implements Serializable, Comparable<Book> {
	private String title;
	private int price;

	public Book() {
	}

	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if (title != null && title.length() > 0)
			this.title = title;// this 는 자기 자신을 가르킴
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price > 0)
			this.price = price;
	}

	public void print() {
		System.out.printf("BOOK[제목:%s	가격:%d]%n", title, price);
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}

	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		if (obj != null && obj instanceof Book) {
			Book temp = (Book) obj;
			if (title.equals(temp.title) && price == temp.price) {
				flag = true;
			}

		}
		return flag;
	}

	@Override
	public int compareTo(Book o) {

		return title.compareTo(o.title);
	}

}
