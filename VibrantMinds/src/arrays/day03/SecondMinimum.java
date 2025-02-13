package arrays.day03;

public class SecondMinimum {
	public static void main(String[] args) {
		int a[] = { 10, 0, 1, 2, 4, 9, 1, 1, 3, 5, 2, 6 };
		int min = Integer.MAX_VALUE, smin = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (min > a[i]) {
				smin = min;
				min = a[i];
			} else if (smin > a[i] && min < a[i])
				smin = a[i];
		}
		System.out.println("Min= " + min + " Smin= " + smin);
	}
}
