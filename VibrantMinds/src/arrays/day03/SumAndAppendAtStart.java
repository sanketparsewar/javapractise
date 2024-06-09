package arrays.day03;

import java.util.Arrays;

public class SumAndAppendAtStart {
	public static void main(String[] args) {
		int a[]= {10,132,453,5467,7667,87};
		for (int i = 0; i < a.length; i++) {
			int temp=a[i],sum=0,length=0;
			while(temp!=0) {
				sum=sum+temp%10;
				temp=temp/10;
				length++;
			}
			sum*=Math.pow(10, length);
			a[i]+=sum;
		}
		System.out.println(Arrays.toString(a));
	}
}
