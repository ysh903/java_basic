package workbook;

public class Prob13 {

	public static void main(String[] args) {
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				if(i+j==6)
					System.out.printf("%d+%d=6%n",i,j);
			}
		}
		System.out.println((int)(Math.random()*6+1));
		System.out.println((int)(Math.random()*6+1));
		System.out.println((int)(Math.random()*6+1));

		
		

	}

}
