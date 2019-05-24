
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//default
public class BookMgr {
	Map<String, String> bookList = new HashMap<String, String>();

	public BookMgr() {
		Scanner sc = null;
		try {
			sc = new Scanner(new File("c://lib/bookdata.txt"));
			while (sc.hasNextLine()) {
				String data = sc.nextLine();
				String[] bookdata = data.split("/");
				addBook(bookdata[0], bookdata[1]);

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

	public void addBook(String name, String price) {
		bookList.put(name, price);
	}

	public void removeBook(String name) {
		bookList.remove(name);
	}

	public void searchBook(String name) {
		if (bookList.containsKey(name)) {
			System.out.println(bookList.get(name));
		} else
			System.out.println("해당 정보는 없습니다.");
	}

	public void printBookList() {
		System.out.println("=== 책 목록 ===");
		bookList.forEach((t, u) -> System.out.printf("%s/%s\n", t, u));
	}

}
