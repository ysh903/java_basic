package workbook;

public class Prob12_1 {

	public static void main(String[] args) {
		int i=0;
		while (i<=10) {
			int j=0;
			while (j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
