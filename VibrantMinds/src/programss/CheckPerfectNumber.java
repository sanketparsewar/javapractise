/*
Perfect number: perfect number is a positive integer that is equal to the sum of its proper positive divisors, that is, the sum of its positive divisors excluding the number itself.
Equivalently, a perfect number is a number that is half the sum of all of its positive divisors (including itself) i.e. σ1(n) = 2n.
The first perfect number is 6. Its proper divisors are 1, 2, and 3, and 1 + 2 + 3 = 6. 
Equivalently, the number 6 is equal to half the sum of all its positive divisors: ( 1 + 2 + 3 + 6 ) / 2 = 6. 
The next perfect number is 28 = 1 + 2 + 4 + 7 + 14. This is followed by the perfect numbers 496 and 8128.
*/

package programss;

public class CheckPerfectNumber {
	public static void main(String[] args) {
		int n = 5000;
		for (int i = 1; i <= n; i++) {
			int sum = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
			if (i == (sum / 2))
				System.out.println("perfect num: " + i);
		}
	}
}
