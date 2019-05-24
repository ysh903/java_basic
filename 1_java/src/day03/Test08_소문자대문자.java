package day03;

public class Test08_소문자대문자 {

	public static void main(String[] args) {
		String msg = "hello java test";
		String msg2=null;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<msg.length();i++) {
			sb.append(((char)(msg.charAt(i)-32)));
	
	
		msg2 =sb.toString();
		
		}
		System.out.println(msg);
		System.out.println(msg2);
		
		
		/*
		 * String name = "홍길동"; System.out.println(name);
		 * System.out.println(name.length()); System.out.println(name.charAt(0)+"**");
		 * System.out.println("**"+name.charAt(name.length()-1));
		 * System.out.println(name.substring(1, 3));
		 */

	}

}
