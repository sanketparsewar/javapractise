package superKeyword;

public class Demo3 extends Demo2 {
	int a = 3, b = 4;

	Demo3() {
		super(19);
		System.out.println("Default const of Demo3");
	}

	Demo3(int a) {
		System.out.println("Parametrised const of Demo3");
	}

	void m1() {
		System.out.println("m1 method of Demo3");
		System.out.println("a= "+super.a+" b="+super.b);
		super.m1();
	}
}
