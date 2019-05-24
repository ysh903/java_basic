package day06;
import util.Util;
import java.util.Arrays;
public class Test01 {

	public static void main(String[] args) {
		int[] num1 = { 99, 44, 77, 68, 80 };
		int[] result1=util.Util.sort(num1);
		System.out.println(Arrays.toString(result1));
		
		int[] num2 = { 2, 3, 9, 1, 7 };
		util.Util.sort(num2);
		
	}

}
