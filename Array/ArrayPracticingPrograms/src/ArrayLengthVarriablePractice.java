
public class ArrayLengthVarriablePractice {

	public static void main(String[] args) {
		int[] i = new int[10];
		System.out.println(i.length);

		int[] j = { 1, 2, 3, 4, 5, 6, 7, 8, 8 };
		System.out.println(j.length);

		// Null pointer exception.

		int[] k = null;
		System.out.println(k);
		System.out.println(k.length);// nullpointerexception. this is runtime exception.

	}

}
