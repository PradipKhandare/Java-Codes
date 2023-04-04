package ArrayBasics;

public class PassingArrayToTheMethod {

	public static double productOfArray(int[] m) {
		int result = 1;
		for (int i = 1; i < m.length; i++) {
			result = result * m[i];
		}
		return result;
	}

	public static int summation(int[] m) {
		int res = 0;
		for (int a = 0; a < m.length; a++) {
			res = res + m[a];
		}
		return res;
	}

	public static void main(String[] args) {
		int[] n = { 10, 9, 8, 7, 6, 5 };
		int res = summation(n);
		System.out.println(res);
		double result = productOfArray(n);
		System.out.println(result);

	}

}
