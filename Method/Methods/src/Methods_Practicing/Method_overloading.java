package Methods_Practicing;

public class Method_overloading {
	// class consist of more than one method with same name and different argument
	// is called method overloading.

	public static void test(double a) {
		System.out.println("test (double a) method");
	}

	public static void test(int a) {
		System.out.println("test (int a) method");
	}

	public static void main(String[] args) {
		test('a');

	}
// inside a class block we can not declare a method with same name and a same argument.
// we get compile time error because method call statement transfer the control to only
// one method at the single time.
}
