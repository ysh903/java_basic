package day04;

import java.util.Arrays;

public class Test07 {

	public static void main(String[] args) {
		int[] num = new int[6];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 45 + 1);
		}
		System.out.println(Arrays.toString(num));

		for (int i = 0; i < num.length - 1; i++) {// selection 정렬. 성능 안 좋음
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					int k = num[i];
					num[i] = num[j];
					num[j] = k;
				}

			}

		}
		System.out.println(Arrays.toString(num));
		// 중복처리 알고리즘 필요
		// 가장 작은 수를 찾아서 삽입 알고리즘

	}

}
