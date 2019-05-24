package day11;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test02_Properties {

	public static void main(String[] args) {
		Properties p =new Properties();
		try {
			p.load(new FileInputStream("dbinfo.txt"));
			String url=p.getProperty("url");
			String user =p.getProperty("user");
			String pw =p.getProperty("pw");
			System.out.println(url);
			System.out.println(user+"/"+pw);
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
