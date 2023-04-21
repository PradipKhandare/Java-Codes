package Methods_Practicing;

public class FindProductOfAllNumberWhichAreNotEvenDivisibleByFive {

	public static void main(String[] args) {

		boolean result = productOfNumbers();
		System.out.println(result);

	}

	public static boolean productOfNumbers() {
		int prod = 1;
		for (int i = 1; i <= 50; i++) {
			if (i % 2 != 0 && i % 5 == 0) {
				prod = prod * i;
			}
		}
		if (prod > 0) {
			return true;
		} else {
			return false;
		}
	}

}
