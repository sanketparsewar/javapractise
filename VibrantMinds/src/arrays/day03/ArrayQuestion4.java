package arrays.day03;
import java.util.Arrays;
class ArrayQuestion4
{
	public static void main(String args[])
	{
		int a[] = { 124, 651, 3896, 467, 234, 977, 543, 23, 23, 467, 235, 112, 5, 12};
		for(int i=0;i<a.length;i++)
		{
			int last=a[i]%10;
			a[i]/=10;
			int temp=a[i],length=0;
			while(temp!=0)
			{
				length++;
				temp/=10;	
			}
			last*=Math.pow(10,length);
			last+=a[i];
			a[i]=last;
		}
		System.out.print(Arrays.toString(a));
	
	}
}