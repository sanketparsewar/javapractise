package arrays.day03;

public class FirstMaximum {
	public static void main(String[] args) {
		int a[]= {23,954,32,1,43,546,67,5,34};
		int max=0;
		for (int i = 0; i < a.length; i++) {
			if(max<a[i])
				max=a[i];
		}
		System.out.println(max);
	}
}
