//To find area of rectangle
import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter length ");
		int length = s.nextInt();
		System.out.println("Enter breadth ");
		int breadth = s.nextInt();
		int area = length*breadth;
		System.out.println("Area= "+area);
	}
}
