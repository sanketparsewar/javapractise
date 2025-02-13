package pattern;

public class Counter7 {
	public static void main(String[] args) {
		int n = 5;
		int count = ((n * (n + 1)) / 2) - n + 1;
		for (int i = n; i >= 1; i--) {
			int c = count;
			for (int j = n; j >= i; j--) {
				System.out.print(c + "\t");
				c -= j;
			}
			System.out.println();
			count++;
		}
	}
}
