package arrays.day03;

import java.util.Arrays;

public class ArrayQuestion3 {
	public static void main(String[] args) {
		int a[] = { 124, 651, 3896, 467, 234, 977, 543, 23, 23, 467, 235, 112, 5, 12, 01 };
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			int temp = a[i];
			int length = 0;
			while (temp != 0 && temp > 10) {
				temp = temp / 10;
				length++;
			}
			int first = temp;
			first *= Math.pow(10, length);
			a[i] -= first;
			a[i] *= 10;
			a[i] += temp;
		}
		System.out.println(Arrays.toString(a));

	}
}
