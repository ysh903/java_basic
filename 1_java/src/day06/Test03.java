package day06;

public class Test03 {

	public static void main(String[] args) {
		int a = 100;
		int b = 10;
		int max = new day06.Test03().max(a, b);
		System.out.println(max);
		int min=min(a,b);
		System.out.println(min);
	}

	public int max(int a, int b) {
		return a > b ? a : b;
	}
	public static int min(int a, int b) {
		return a < b ? a : b;
	}

}
