package arrays.day03;

import java.util.Arrays;
public class ArrayQuestion1 {
	public static void main(String[] args) {

	int a[]= {34,18,24,16,12,20,32,44,15,41};
	for (int i = 0; i < a.length; i++) {
		if(a[i]%4==0)
			a[i]=(a[i]%10==4)?-3:-1;
		
		else if(a[i]%10==4) 
			a[i]=-2;	
	}
	System.out.println(Arrays.toString(a));
	}
}
