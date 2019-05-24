package day03;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		System.out.println("성적처리 Application을 시작하려면 yes를 입력하세요_");
		Scanner input = new Scanner(System.in);
		
		String msg = input.nextLine();
		
		
		if (!(msg !=null && msg.equalsIgnoreCase("yes"))) {
			System.out.println("Application stop");
			if(input != null)
			{input.close();
			input=null;
				}
			return;
		}
		else 
		System.out.println("Application start");
		System.out.println("성적을 입력하세요..");
		System.out.println("국어 영어 수학 \n 입력 예) 90 90 90 엔터");
		
		int k1 = input.nextInt();
		int k2 = input.nextInt();
		int k3 = input.nextInt();
		input.nextLine();//엔터를 없앰
		

		
		double m=0.0;
		
		System.out.printf("국어는 %d, 영어는 %d, 수학은 %d \t",k1, k2, k3);
		System.out.printf("평균은 %.2f \n",m=((k1+k2+k3)/3.));
		
		//등급처리
		char grade = 'a';
		if (m>=90&&m<=100) grade='A';
		else if (m>=80&&m<90) grade='B';
		else if (m>=70&&m<80) grade='C';
		else if (m>=60&&m<70) grade='D';
		else grade='F';
		System.out.printf("성적처리결과 [%c]등급 \n",grade);
		
		
		
		if(input != null){
			input.close();
			input=null;
		}
		System.out.println("Application stop");
		
		
		
		
	}

}
