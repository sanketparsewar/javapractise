//number equal to sum of cube of its digits
//ex: 0, 1, 153, 370, 371 and 407

package programss;

import java.util.Arrays;

public class CheckArmstrong {
	public static void main(String[] args) {
		int a[]= {223,3343,0, 1,34,121, 153, 370, 371, 407};
		for (int i = 0; i < a.length; i++) {
			int temp=a[i],sum=0,num=0;
			while(temp!=0)
			{
				num=temp%10;
				num=num*num*num;
				sum+=num;
				temp/=10;
			}
			a[i]=(a[i]==sum)?1:0;//1 for yes Armstrong and 0 for not	
		}
		System.out.println(Arrays.toString(a));
	}
}
