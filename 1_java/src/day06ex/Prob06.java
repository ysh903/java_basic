package day06ex;

public class Prob06 {

	public static void main(String[] args) {
		BookMgr mgr = new BookMgr();
		
		mgr.addBook(new Book("java",7600));
		mgr.addBook(new Book("java1",6600));
		mgr.addBook(new Book("java2",9600));
		mgr.addBook(new Book("sql",1600));
		mgr.addBook(new Book("ejb",600));
		
		
		mgr.printBookList();
		mgr.printTotalPrice();
		
		
	}

}
