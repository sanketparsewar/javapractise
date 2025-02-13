//A strong number is a positive integer where the sum of the factorials of its digits equals the number itself. 
//For example, 145 is a strong number because 1! + 4! + 5! = 1 + 24 + 120 = 145. 
//Other examples of strong numbers include 1, 2, 145,and 40585 

package programss;

public class CheckStrong {
	public static void main(String[] args) {
		int n = 100000;
		for (int i = 1; i <= n; i++) {
			int temp = i, sum = 0, num = 0, fact = 1;
			while (temp != 0) // 0
			{
				fact = 1;   //fact=1
				num = temp % 10; // 1
				for (int j = num; j >= 1; j--) // 1>=1
					fact *= j; // fact=1
				sum += fact; // sum=145
				temp /= 10; // temp=0
			}
			if (i == sum)
				System.out.println(i);
		}
	}
}
