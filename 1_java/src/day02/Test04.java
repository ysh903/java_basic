package day02;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		int num = 15;
		System.out.println(15%3);
		System.out.println(num++);//15
		
		Scanner keyboard = null;
		String msg = "hello java programming";
		String msg2 = "hello java programming";
		boolean flag = num<15 && msg.length() >0;
		System.out.println(flag);
		System.out.println(num==msg.length());
		System.out.println(msg.equals(msg2));//간접data 비교
		System.out.println(msg==msg2);//둘의 주소가 같다
		System.out.println("======");
		
		String s1 = new String("hello");
		String s2 = new String("hello");
				System.out.println(s1==s2);  //false, 각자 저장주소 다름
		System.out.println(s1.equals(s2)); 
		//true, 객체 비교시 꼭 equals 사용할 것

		System.out.println(4<<2);//16
		System.out.println(4>>1);//2
		System.out.println(4&1);//0
		
		keyboard = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int jumsu = keyboard.nextInt();
		keyboard.nextLine();
		
		keyboard.close();
		keyboard=null;

		System.out.println("유효성 검증");
		if (!(jumsu>=0 && jumsu<=100)) {
			return;
		}
		
		System.out.println(jumsu>=80 ? "Pass":"No_PASS");
		
		byte a =10;
		byte b =20;
		byte c = (byte)(a+b);
		int d=10%-8;
		int e= -10%8;
		int f =(-10)%(-8);
		
		System.out.println(d+""+e+","+f);
		
		boolean x=(10.0d==10.0f);
		boolean y=(0.1d==0.1f);
		System.out.println(x+""+y);
		
		
		
		
		System.out.println("END");
	}

}
