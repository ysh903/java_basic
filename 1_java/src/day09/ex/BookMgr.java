package day09.ex;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//default
public class BookMgr {
	private Book[] bookList;// 주소값 null
	int count = 0;

	public BookMgr() {
		bookList = new Book[10];
		Scanner sc = null;
		try {
			sc = new Scanner(new File("c://lib/bookdata.txt"));
			while (sc.hasNextLine()) {
				String data = sc.nextLine();
				String[] bookdata = data.split("/");
				addBook(new Book(bookdata[0], Integer.parseInt(bookdata[1])));

			}
		} catch (FileNotFoundException e) {
			System.out.println("bookdata.txt 파일 확인 필요");
			e.printStackTrace();
		} catch (Exception e) {

		} finally {
			if (sc != null)
				sc.close();
		}

	}

	public void addBook(Book book) {
		if (count == bookList.length) {
			Book[] temp = new Book[bookList.length * 2];
			System.arraycopy(bookList, 0, temp, 0, bookList.length);
			bookList = temp;
		}

		for (int i = 0; i < count; i++) {
			if (bookList[i].equals(book)) {
				return;
			}
		}

		bookList[count] = book;
		count++;

	}

	public void printBookList() {
		System.out.println("=== 책 목록 ===");
		for (int i = 0; i < count; i++) {
			System.out.printf("%s:%d%n", bookList[i].getTitle(), bookList[i].getPrice());
		}
	}

	public void printTotalPrice() {
		System.out.println("=== 책 가격의 총합 ===");
		int sum = 0;

		for (int i = 0; i < count; i++) {
			sum += bookList[i].getPrice();

		}
		System.out.println(sum);
	}

}
