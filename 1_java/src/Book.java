

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Book extends Object implements Serializable {
	Map<String, String> bookList = new HashMap<String, String>();
	
	
	private String title;// 외부에서 접근할 수 없다, 오픈하고 싶으면 public 사용
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	

}
