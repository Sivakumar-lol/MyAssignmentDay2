package week1.day2;

import java.util.Arrays;

public class seclargest {

	public static void main(String[] args) {
		int[] num= {25,67,45,76,88};
		Arrays.sort(num);
		int length=num.length;
		System.out.println(num[length-2]);
	}

}
