package programss;

public class CheckPerfectCube {
	public static void main(String[] args) {
		int a[] = { 1, 8, 27, 32, 36, 216, 86, 64, 121, 729 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j <= a[i]; j++) {
				if (j * j * j == a[i]) {
					System.out.println(a[i] + " is Perfect Cube of " + j);
					break;
				} else if (j == a[i])
					System.out.println(a[i] + " is not Perfect Cube ");
			}
		}
	}
}
