package Methods_Practicing;

public class FindFactorialOfSevenAndReturnResultInStringFormat {

	public static void main(String[] args) {

		String fact = factorial();
		System.out.println(fact);
	}

	public static String factorial() {
		int fact = 1;
		for (int i = 1; i <= 7; i++) {
			fact = fact * i;
		}
		return "factorial of 7 is " + fact;
	}

}
