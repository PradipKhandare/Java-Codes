package Methods_Practicing;

public class CountTheNumberDivisibleBySevenAndReturnTheCount {

	public static void main(String[] args) {
		int res = countOfNumbers();
		System.out.println("Total numbers are : " + res);
	}

	public static int countOfNumbers() {
		int count = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0 && i % 7 == 0) {
				count++;
			}
		}

		return count;

	}
}
