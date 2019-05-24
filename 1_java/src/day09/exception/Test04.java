package day09.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		System.out.println("start");
		Scanner sc = null;
		try {
			sc = new Scanner(new File("c://lib/bookdata.txt"));// 절대경로
			while (sc.hasNextLine()) {
				String data = sc.nextLine();
				String[] bookdata = data.split("/");
				String title = bookdata[0];
				int price = Integer.parseInt(bookdata[1]);
				System.out.println("Read : "+data);
			}
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println("파일을 준비해주세요.");
		} catch (Exception e) {
			System.out.println("bookdata parsing error");
			System.out.println(e.getMessage());
		}

		finally {
			if (sc != null)
				sc.close();
		}

		System.out.println("end");
	}

}
