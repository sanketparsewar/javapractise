package arrays.day03;

import java.util.Arrays;

public class ArrayQuestion6 {
	public static void main(String[] args) {
		int a[]= { 124, 651, 3896, 467, 234, 977, 543, 23, 23, 467, 235, 112, 5, 21};
		for(int i=0;i<a.length;i++)
		{
			int last=a[i]%10,first=0;
			a[i]/=10;
			
			while(a[i]!=0) {
				first=a[i]%10;
				a[i]/=10;
			}
			first*=10;
			a[i]=first+last;
		}		
		System.out.println(Arrays.toString(a));
	}
}
