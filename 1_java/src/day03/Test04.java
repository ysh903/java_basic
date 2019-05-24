package day03;

public class Test04 {

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++) {
		System.out.println("Hello");
		System.out.println(i);
		}
		
		int i=10;
		while (i >5) {
			System.out.println("while loop");
			i--;
			
		}
		do {
			System.out.println("do-while loop");
		} while (i>5);
		
		boolean flag = false;
		while (!flag) {
			i--;
			System.out.println("flag");
			if  (i==0) flag = !flag;
			
		}
		
		
		
		
		
		
		
		
		
		
	}
}
