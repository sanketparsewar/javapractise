//nth max element from array

package programss;

import java.util.Arrays;

public class RemoveDuplicatesFromArr {
	static int[] removeDuplicates(int[] a) {
		int[] b = new int[a.length];
		int index = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1]) {
				b[index++] = a[i];
			}
		}
		b[index++] = a[a.length - 1];
		a = Arrays.copyOf(b, index);
		return a;

	}

	public static void main(String[] args) {
		int a[] = { 20, 30, 40, 50, 80, 10, 90, 80, 90, 60, 70, 100, 100 };
		int n = 200; // 1st max element
		Arrays.sort(a);

		a = removeDuplicates(a);
		System.out.println(Arrays.toString(a));
//		Arrays.sort(a);
		if (n >= 0 && n <= a.length)
			System.out.println(a[a.length - n]);

		else
			System.out.println(-1);

	}
}
