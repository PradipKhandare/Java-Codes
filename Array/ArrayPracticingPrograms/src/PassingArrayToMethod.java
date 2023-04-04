
public class PassingArrayToMethod {

	public static int summation(String[] m) {
		int res = 0;
		for (int a = 0; a < m.length; a++) {
			res = res + m[a];

		}
		return res;
	}

	public static void main(String[] args) {
		int[] n = { 18, 15, 14, 11, 9, 2 };
		int res = summation(n);
		System.out.println(res);
	}

}
