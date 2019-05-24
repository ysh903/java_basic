package day01;
import java.util.Date;
//import java.sql.Date; 같은 date 끼리 충돌일어남

public class Sample03 {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println("Today : "+today);
		today = new Date();
		
		
		java.sql.Date d;
		System.out.println(Integer.MAX_VALUE);
		System.out.println((int)'a');
		char c = 'a';
		System.out.println(Character.isDigit(c));

		
		
		
	}

}
