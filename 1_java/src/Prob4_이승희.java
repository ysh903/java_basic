
import java.util.Arrays;

public class Prob4_이승희 {

	public static void main(String[] args) {
		int[] num = new int[44];
		for (int i = 0; i < num.length; i++) {// 첫 번째 수가 중복되는 문제점
			num[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {// j=0과 비교를 못함
				if (num[i] == num[j]) {
					num[i] = (int) (Math.random() * 45 + 1);
					j = 0;

				}

			}
		}

		System.out.println(Arrays.toString(num));

		for (int i = 0; i < num.length - 1; i++) {// 가장 작은 수만 교체
			int min = 46;
			int temp = 0;
			int minaddr = 0;
			for (int j = i; j < num.length; j++) {

				if (num[j] < min) {
					min = num[j];
					minaddr = j;
				}

			}

			if (num[i] > num[minaddr]) {
				temp = num[i];
				num[i] = num[minaddr];
				num[minaddr] = temp;
			}
		}
		System.out.println(Arrays.toString(num));

	}

}
