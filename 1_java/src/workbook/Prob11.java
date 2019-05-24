package workbook;

public class Prob11 {

	public static void main(String[] args) {
		int inx = 15;
		if (inx >= 10 && inx <= 20)
			System.out.println("ture");
		char ch1 = ' ';
		if (ch1 != '\t' && ch1 != ' ')
			System.out.println("true");
		char ch2 = 'x';
		if (ch2 == 'x' || ch2 == 'X')
			System.out.println("true");
		char ch3 = '0';
		if (ch3 >= 0 && ch3 <= 9)
			System.out.println("true");
		char ch4 = 'a';
		if (ch4 >= 'a' && ch4 <= 'z' || ch4 >= 'A' && ch4 >= 'Z')
			System.out.println("true");
		int year = 400;
		if ((year % 400 == 0 || year % 4 == 0) && year % 100 != 0)
			System.out.println("ture");
		boolean powerOn = false;
		if (powerOn == false)
			System.out.println("true");
		String str = "yes";
		if (str == "yes")
			System.out.println("true");
	}

}
