import java.util.Scanner;

public class Prob2_이승희 {

	public static void main(String[] args) {
		/*
		  변수 num의 값에따라  양수 음수  0을 출력하는  코드를 완성하세요.
		   힌트: 삼항연산자.
		*/
			int num = 90;
			System.out.printf("num %d은(는)",num);
			System.out.println(num>=0?(num==0?"0":"양수"):"음수");
			//System.out.println(num>0?"양수":num==0?"0":"음수");

			/*
		        다음은 대문자를 소문자로 변경하는 코드입니다.
		        변수 ch에 저장된 문자가 대문자 인 경우에만 
			소문자로 변경하는 코드를 완성 합니다.
		  	*/
			char ch = 'P';
			char lowerCase = 'A'<=ch&&ch<='Z'?(char)(ch+32):ch;
			System.out.print("ch:"+ch);
			System.out.println(" to lowerCase :"+lowerCase);

			
			/*  년도를 입력받아  윤년인지 판별하여 출력해  보세요 */
			System.out.println("년도를 입력해주세요");
			Scanner keyboard = new Scanner(System.in);
			int year = keyboard.nextInt();
			keyboard.nextLine();			
			keyboard.close();
			System.out.printf("%d년도는 ",year);
			
			
		//100으로 나누어지는 해는 윤년이 아님. 400의 배수는 윤년
			System.out.println(year%400==0||(year%4==0&&year%100!=0)?"윤년":"평년");
			
	}

}
