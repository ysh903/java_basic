package day06;

public class BookTest {

	public static void main(String[] args) {
		Book b1 = new Book();
		//b1.title="java";public이 아닌 private라 접근 불가
		b1.setTitle("java");
		b1.setPrice(90);
		b1.print();
		
		
	}

}
