package ExceptionsInArray;

public class ArrayIndexOutOfBoundException {
	/*
	 * When we try to access array object based on its index value, If the index
	 * value is greater than or equal to size of array then we get
	 * ARRAINDEXOUTOFBOUNDEXCEPTION.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = new int[10];
		System.out.println(n[10]);// ArrayIndexOutOfBoundException.

	}

}
