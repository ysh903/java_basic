import java.util.Scanner;

public class BookApp {
	public static void main(String[] args) {
		BookMgr mgr = new BookMgr();
		Scanner keyboard = new Scanner(System.in);
		String name = "no name";
		String price = "0";

		while (true) {
			System.out.println("******** Book Application  ********");

			System.out.println("원하는 메뉴 번호를 입력하세요 ..");
			System.out.println("1. 입   력 ");
			System.out.println("2. 수   정");
			System.out.println("3. 삭   제");
			System.out.println("4. 검   색");
			System.out.println("5. 목록보기");
			System.out.println("6. 종   료");

			System.out.println("***********************************");

			String input = keyboard.nextLine();
			if (input == null || input.length() == 0) {
				System.out.println("아무것도 입력하지 않았습니다.");
			} else if (Integer.parseInt(input) < 1 || Integer.parseInt(input) > 6) {
				System.out.println("1~6사이의 번호를 입력하세요");
			} else if (Integer.parseInt(input) >= 1 && Integer.parseInt(input) <= 6) {
				int number = Integer.parseInt(input);

				switch (number) {
				case 1:
					System.out.println("입력할 정보를 입력하세요.");
					System.out.println("책의 제목은?");
					name = keyboard.nextLine();
					System.out.println("책의 가격은?");
					price = keyboard.nextLine();
					mgr.addBook(name, price);
					System.out.printf("%s 입력되었습니다.\n", name);
					break;

				case 2:
					System.out.println("수정할 정보를 입력하세요");
					System.out.println("책의 제목은?");
					name = keyboard.nextLine();
					System.out.println("책의 가격은?");
					price = keyboard.nextLine();
					mgr.addBook(name, price);
					System.out.printf("%s 수정되었습니다.\n", name);
					break;

				case 3:
					System.out.println("삭제할 정보를 입력하세요.");
					System.out.println("책의 제목은?");
					name = keyboard.nextLine();
					mgr.removeBook(name);
					System.out.printf("%s 삭제되었습니다.\n", name);
					break;

				case 4:
					System.out.println("검색할 정보를 입력하세요.");
					name = keyboard.nextLine();
					mgr.searchBook(name);
					break;

				case 5:
					mgr.printBookList();
					break;

				case 6:
					System.out.println("종료하겠습니다.");
					keyboard.close();
					return;

				}

			}
		}

	}

}
