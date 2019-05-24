package day09.ex;
//Book class equal, toString 오버라이딩

//BookMgr class 파일의 내용을 읽어들여 bookList에 등록, 생성자함수. 
//기본적으로 책이 들어가있고, 추가 책에 중복체크

public class Prob09 {

	public static void main(String[] args) {
		BookMgr mgr = new BookMgr();

		mgr.addBook(new Book("java", 7600));
		mgr.addBook(new Book("java", 7600));
		mgr.addBook(new Book("java2", 9600));
		mgr.addBook(new Book("sql", 1600));
		mgr.addBook(new Book("ejb", 600));

		mgr.printBookList();
		mgr.printTotalPrice();

	}

}
