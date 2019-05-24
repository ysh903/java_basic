package day06ex;

public class Book {
	private String title;//외부에서 접근할 수 없다, 오픈하고 싶으면 public 사용
	private int price;
	
	public Book() {}
	
	public Book(String title, int price) {
		this.title=title;
		this.price=price;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		if (title !=null&&title.length()>0)
		this.title = title;//this 는 자기 자신을 가르킴
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if (price>0) this.price = price;
	}
	public void print() {
		System.out.printf("BOOK[제목:%s	가격:%d]%n",title,price);
	}
}
