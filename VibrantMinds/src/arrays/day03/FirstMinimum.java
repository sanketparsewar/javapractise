package arrays.day03;

public class FirstMinimum {
	public static void main(String[] args) {
		int[] array = new int[] {2,2,1,10,20,10,6,7,9,8,6,2,3,4};
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if(min>array[i])
				min=array[i];
		}
		System.out.println("Min = "+min);
	}
}
