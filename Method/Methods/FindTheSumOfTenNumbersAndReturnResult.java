package Methods_Practicing;

public class FindTheSumOfTenNumbersAndReturnResult {

	public static void main(String[] args) {
		int result = summation();
		System.out.println("Summation of 1 to 10 digits are : " + result);
	}

	public static int summation() {
		int result = 0;
		for (int i = 1; i <= 10; i++) {
			result = result + i;
		}

		return result;
	}

}
