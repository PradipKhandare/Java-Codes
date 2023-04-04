package ArrayReferenceVariable;

public class ArrayLengthVariable {

	public static void nullPointerException() {
		/*
		 * 
		 * If we pass null inside a array reference variable and if we try to defined or
		 * count the length of array object since we are not pointing to any of array
		 * object because of null keyword we get runtime exception called
		 * NULLPOINTEREXCEPTION.
		 * 
		 */
		int[] i = null;
		System.out.println(i);
		System.out.println(i.length);// nullPointerException
	}

	public static void main(String[] args) {
		// it is used to count the number of unit present inside the variable.
		// We can access the length variable using array reference variable.
		// The return type of length variable is in integer format.
		int[] i = new int[3];
		System.out.println(i);
		System.out.println(i.length);
		// We can access array units with the help of index value.
		// index value start with 0.
		// ends with array reference variable.length-1.
		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[2]);
		System.out.println(i.length);
		System.out.println(i.length - 1);
		i[0] = 1;
		i[1] = 2;
		i[2] = 3;
		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[2]);
	}

}
