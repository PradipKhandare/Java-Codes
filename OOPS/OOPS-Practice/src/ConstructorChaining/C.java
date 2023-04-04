package ConstructorChaining;

public class C extends B {
	static int c = 30;
	int c1 = 30;

	C() {
		System.out.println("C()");
	}

	public static void main(String[] args) {
		C obj = new C();

	}

}
