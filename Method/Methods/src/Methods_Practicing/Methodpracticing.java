package Methods_Practicing;

public class Methodpracticing {

	public static boolean numbersWhichAreNotDivisibleByFiveAndNotAnEven() {
		int res = 1;
		int lastNumber = 100;
		for (int i = 1; i <= lastNumber; i++) {
			if (i % 2 != 2 && i % 5 == 0) {
				res = res * i;
				return true;
			}
		}

	}

	public static String isCharVowelorNot() {
		char character = 'B';
		if (character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
			return character + " " + "is Vowel";
		} else {
			return character + " " + "is not vowel";
		}
	}

	public static double factorialOfSeven() {
		int factorial = 1;
		int lastNumber = 7;
		for (int i = 1; i <= lastNumber; i++) {
			factorial = i * factorial;
		}
		return factorial;
	}

	public static int sumOfFirstTenNumbers() {
		int sumOfNumbers = 0;
		int lastNumbers = 10;
		for (int i = 0; i <= lastNumbers; i++) {
			sumOfNumbers = sumOfNumbers + i;
		}
		return sumOfNumbers;
	}

	public static int NumbersWhichAreDivisibleBySevenBetweenZeroToHundred() {
		int count = 0;
		int lastNumber = 100;
		for (int i = 0; i <= lastNumber; i++) {
			if (i % 7 == 0 && i % 2 != 0) {
				count++;
			}

		}

		return count;
	}

	public static String MethodCallingPractice() {
		System.out.println("Ali ka method");
		return "Pradu";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = MethodCallingPractice();
		System.out.println(a);
		int countOfNumbers = NumbersWhichAreDivisibleBySevenBetweenZeroToHundred();
		System.out.println(countOfNumbers);
		int sumOfNumbers = sumOfFirstTenNumbers();
		System.out.println(sumOfNumbers);
		double factorial = factorialOfSeven();
		System.out.println(factorial);
		System.out.println(isCharVowelorNot());
		System.out.println(numbersWhichAreNotDivisibleByFiveAndNotAnEven());

	}

}
