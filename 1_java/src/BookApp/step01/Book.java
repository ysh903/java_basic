package BookApp.step01;


import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Book extends Object implements Serializable {
	Map<String, String> map = new HashMap<String, String>();
	private String title;// 외부에서 접근할 수 없다, 오픈하고 싶으면 public 사용
	private String price;

	public Book() {
	}

	public Book(String title, String price) {		
		map.put(title, price);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if (title != null && title.length() > 0)
			this.title = title;// this 는 자기 자신을 가르킴
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		if (Integer.parseInt(price) > 0)
			this.price = price;
	}

	public void print() {
		System.out.printf("BOOK[제목:%s	가격:%d]%n", title, price);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((map == null) ? 0 : map.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
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
		if (map == null) {
			if (other.map != null)
				return false;
		} else if (!map.equals(other.map))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	
	

}
