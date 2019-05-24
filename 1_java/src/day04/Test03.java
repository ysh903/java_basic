package day04;

import java.util.Arrays;

public class Test03 {
	public static void main(String[] args) {
		String msg = "hello java programming~~";
		char[] c;
		//c=new char[10];
		c=new char[msg.length()];
		
		for (int i=0;i<c.length;i++)
		{
			c[i]=msg.charAt(i);
		}
		
		for(char data:c) {//c에서 자료 추출해서 data에 넣음
		System.out.print(data);
		}
		System.out.println();
		System.out.println(Arrays.toString(c));
		System.out.println("===================================");
		int[] n1= {1,2,3};
		int[] n2= new int[n1.length*2];
		System.out.println(Arrays.toString(n1));
		System.out.println(Arrays.toString(n2));
		System.arraycopy(n1, 0, n2, 1, n1.length);//배열 복사
		System.out.println(Arrays.toString(n2));
		System.out.println("===================================");
		for(int data:n2) {
			System.out.print(data);
		}
		System.out.println();
		System.out.println("===================================");
		char[] s="SQL".toCharArray();//String은 Char의 배열이기 때문
		System.out.println(Arrays.toString(s));
		System.out.println("===================================");
		String[] s3= {"java", "sql","cent os","R",msg};
		
		for(String data:s3) {
			if(data.length()>5) {
				System.out.println(data);
			}
		}
		
		
		
	}

}
