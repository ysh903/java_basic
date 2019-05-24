package day03;

public class Gugudan {

	public static void main(String[] args) {
		System.out.printf("****\t구구단\t****\n");
		for (int i=1; i<10;i++) {
			for (int j=2;j<10;j++) {
				System.out.printf("%2d*%2d=%4d|",j,i,i*j);
			}
			System.out.println();
		}
		
		

	}

}
