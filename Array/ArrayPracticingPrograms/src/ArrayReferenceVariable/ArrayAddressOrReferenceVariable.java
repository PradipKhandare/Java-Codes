package ArrayReferenceVariable;
//Array it is a continues block of memory where we can store same type of values.

//In order to store same type of values in array, first we need to create object.
//Object is nothing but the one block of memory.
//Since we are using object to store array we can called it as a array object.
//In order to store the reference or address of object we need to create a block of memory.
//we can create array for both primitive or non primitive values.
//Inside array reference variable we can store two type of object.
//1]Address of array object.
//2]null keyword.
//we can create null keyword using two ways
//1] Declaration and initialization
//2] Using new keyword.

public class ArrayAddressOrReferenceVariable {

	public static void usingNewKeyword() {
//new it is a keyword in java. It is used to create an object(a block of memory).
		int[] n = new int[3];
		int[] i;
		i = new int[3];
		System.out.println(i);
		// Note: Array consist of fixed size of memory allocation.
	}

	public static void declarationAndInitialization() {
		int[] n = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(n);// address or reference of object.
	}

	public static void main(String[] args) {
		int[] a;
		byte[] b;
		short[] c;
		long[] d;
		float[] e;
		double[] f;
		char[] g;
		boolean[] h;
		String[] i;
		usingNewKeyword();
		declarationAndInitialization();

	}

}
