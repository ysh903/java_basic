package day04;

import java.util.Arrays;

public class Test01 {
	public static void main(String[] args) {
		int count=0; // 디폴트 초기화가 되어있지 않다.
		double m = 0.0;
		int[] jumsu;// 선언
		jumsu = new int[5];// 생성, 0으로 디폴트 초기화가 되어 있다.

		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = 90 - i * 10;
			System.out.println(jumsu[i]);
		}
		
		System.out.println();
		System.out.println(jumsu);//주소 찍힘
		System.out.println(Arrays.toString(jumsu));//배열 출력 Api
		
		int[] num= {88,55,77,99,77,33};
		System.out.println(Arrays.toString(num));
		
		String[] names;
		names = new String[5];
		names[0]="홍길동";
		names[1]="김길동";
		names[2]="최길동";
		names[3]="";
		System.out.println(Arrays.toString(names));
		
		int sum=0;
		for(int i=0;i<jumsu.length;i++) {
			sum+=jumsu[i];	
		}
		m=sum/jumsu.length;//평균
		
		for(int i=0;i<jumsu.length;i++) {
			if (names[i]!=null&&names[i].length()!=0)//null과 공백 제거
			System.out.printf("%s**: %d %n",names[i].charAt(0),jumsu[i]);
			else
				System.out.printf("무명: %d %n",jumsu[i]);
		}
		
		
		System.out.printf("학생평균 %.2f %n",m);
		
	}
}
