package programss;

import java.util.Arrays;

public class CheckPrime {
	public static void main(String[] args) {
		int a[] = { 71, 12, 11, 46, 53, 76, 923, 33, 233 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j <= a[i]; j++) {
				if (j == a[i]) { //2==71
					a[i] = 1;// yes prime
//				System.out.println("Prime");
				} else if (j != 1 && a[i] % j == 0) {
					a[i] = 0;// not prime
//				System.out.println("Not prime");
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
