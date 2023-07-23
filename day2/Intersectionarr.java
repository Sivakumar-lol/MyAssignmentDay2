package week1.day2;

public class Intersectionarr {

	public static void main(String[] args) {
		int[] num = { 5, 2, 7, 9,3};
		int[] num1 = { 1, 9, 2, 4, 8};
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num1.length; j++) {
				if (num[i] == num1[j]) {
					System.out.println(num[i]);
				}
			}
		}

	}

}
