//A number is said to be twisted prime if it is a prime number and reverse of the number is also a prime number. 
//Examples: Input : 97 
//Output : Twisted Prime Number Explanation: 97 is a prime number and its reverse 79 is also a prime number

package programss;

public class CheckTwistedPrime {
	public static void main(String[] args) {
		int n = 200;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (j == i) {
					int temp = i, num = 0, sum = 0;
					while (temp != 0) {
						sum *= 10;
						num = temp % 10;
						sum += num;
						temp /= 10;
					}
					for (int k = 1; k <= sum; k++)
						if (k == sum) {
							System.out.println(i);
							break;
						} else if (k != 1 && sum % k == 0)
							break;
				} else if (j != 1 && i % j == 0)
					break;
			}
		}
	}
}
