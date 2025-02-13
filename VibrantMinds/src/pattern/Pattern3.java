package pattern;

public class Pattern3 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print((char) (i + 64));
			System.out.println();
		}
		for (int i = n - 1; i >= 1; i--) {
			for (int j = 1; j <= i; j++)
				System.out.print((char) (i + 64));
			System.out.println();
		}

		System.out.println();
		for (int i = n; i >= 1; i--) {
			for (int j = i; j >= 1; j--)
				System.out.print((char) (i + 64));
			System.out.println();
		}
		for (int i = 1 + 1; i <= n; i++) {
			for (int j = i; j >= 1; j--)
				System.out.print((char) (i + 64));
			System.out.println();
		}
	}
}
