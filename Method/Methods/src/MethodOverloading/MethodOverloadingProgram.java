package MethodOverloading;

//class consist of more than one method with same name and different argument is called method overloading.
public class MethodOverloadingProgram {

	public static void test(double a) {
		System.out.println("test method with double argument");
	}

	public static void test(char a) {
		System.out.println("test method with char argument");
	}

	public static void main(String[] args) {

		test(12);

	}

}
