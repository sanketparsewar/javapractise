package superKeyword;

public class Demo2 extends Demo1 {
	int a = 1, b = 2;

	Demo2() {
		
		System.out.println("Default const of Demo2");
	}

	Demo2(int a) {
		super(2);
		System.out.println("parameteerised const of Demo2");
	}

	void m1() {
		System.out.println("M1 method of Demo2");
	}
}
