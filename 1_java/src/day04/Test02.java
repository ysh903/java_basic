package day04;

import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {
		int[] num = new int[10];
		//1~100사이의 난수
		for (int i=0;i<num.length;i++) {
			num[i]=(int)(Math.random()*100);
			System.out.printf("%d번째 난수는: %d %n",i+1,num[i]);
		}

		int[] num2 = num;//같은 영역 사용, 주소를 넘겨줌
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(num2));
		
		int[] num3=num.clone();//내용 복제, 주소는 다름
		System.out.println(Arrays.toString(num3));
		System.out.println(num);//주소 나옴
		System.out.println(num2);
		System.out.println(num3);
		
		
		
	}

}
