
public class Array {

	public static void main(String[] args) {
// Array it is a continues block of memory where we can store same type of values.
// In order to store same type of values in array first we need to create object.
		// (object means a block of memory)
// Since this object is use to store array values is called as array object.
// Before creating an array object first we need to create block up memory to store the reference or address of array object.
// inside array reference variable we can store 2 elements;
		/*
		 * 1) address of array object. 2) Null keyword.
		 */
		createarrayusingdeclareationandinitilization();
		createarrayusingnewkeyword();
	}

	public static void createarrayusingdeclareationandinitilization() {
// Syntax: datatype [] var_name = {val1, val2, val3----};
		int[] n = { 1, 2, 3, 4, 5 };
		System.out.println(n);// address or reference.

		/*
		 * int [] m = ; m= {1,2,3};// here we can not declare and initialize array in
		 * multiple statement. System.out.println(m);
		 */

	}

	public static void createarrayusingnewkeyword() {
// New keyword is used to create object(block of memory) in java
// Syntax: datatype [] var_name = new datatype [size];
		int[] i = new int[5];
		System.out.println(i);// address or reference.
		int[] k;
		k = new int[5];// here we can declare and initialize array in multiple statement
		System.out.println(k);
	}

}
