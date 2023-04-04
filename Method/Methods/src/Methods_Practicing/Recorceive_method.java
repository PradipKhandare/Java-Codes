package Methods_Practicing;

public class Recorceive_method {
// It is a process of method calling itself is called as Recursive method.	

	public static void test(int a) {
		/*
		 * System.out.println("method is calling itself hence it runs infinite times");
		 * test();
		 */
		// System.out.println("in order to stop that infinite run we need to use base
		// condition");
		if (a == 5) {
			return;
		}
		System.out.println(a);
		a++;
		test(a);
	}

	public static void main(String[] args) {
		test(0);
	}
}
