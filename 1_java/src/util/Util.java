package util;

public class Util {

	public static int[] sort(int[] n) {
		int[] a = n.clone();//원본 내용 복사
		for (int i = 0; i < a.length - 1; i++) {// 가장 작은 수만 교체
			int min = i;

			for (int j = i; j < a.length; j++) {

				if (a[min] > a[j]) {
					min = j;

				}

			}

			if (i != min) {
				int temp = a[i];
				a[i] = a[min];
				a[min] = temp;
			}
		}
		return a;
	}

}
