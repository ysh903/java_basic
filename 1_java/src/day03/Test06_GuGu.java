package day03;

public class Test06_GuGu {

	public static void main(String[] args) {
		
		
		//OUT:	for(int i=1;i<=9;i++) { ->>라벨링작업->OUT
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				//if (j==5) break;
				//if(j==5) continue;
				//break OUT; OUT루프를 빠져나감.
				
				System.out.printf("%d*%d=%2d|",j,i,i*j);
			}
			System.out.println();
		}

	}

}
