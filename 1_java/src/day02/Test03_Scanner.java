package day02;
import java.util.*;
public class Test03_Scanner {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요_");
		System.out.println();
		String name = keyboard.nextLine();//ref data
		System.out.print("나이를 입력하세요_");
		System.out.println();
		int age = Integer.parseInt(keyboard.nextLine());
		//입력받은 문자열을 숫자로 변환
		
		System.out.println("국어/영어/수학 점수를 입력하세요_");
		System.out.println("입력예) 90 90 70처럼 점수를 입력후 엔터_");

		int k1 = keyboard.nextInt();
		int k2= keyboard.nextInt();
		int k3= keyboard.nextInt();//엔터가 다음으로 넘어감
		keyboard.nextLine();//엔ㅌ 처리
		
		
		
		
		System.out.println("**** 입력정보 확인****");
		System.out.printf("이름=%s, 나이=%d%n", name, age);
		System.out.printf("국어=%s 영어=%s 수학=%s 평균=%.2f%n", 
				k1,k2,k3,(k1+k2+k3)/3.);//점 찍어야함
		System.out.println("**** 입력정보 확인****");
		
		
		//keyboard =null; //gc가 언제 작동할 지 모름. 명시적 자원반납 필요
		//heap 에 일정부분 차있어야 gc 작동
		keyboard.close();//자원 반납
		
		

	}

}
