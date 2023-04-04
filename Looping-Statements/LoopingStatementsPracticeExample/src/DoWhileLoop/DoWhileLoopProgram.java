package DoWhileLoop;

public class DoWhileLoopProgram {
//Note: In do while loop we can perform task for false condition only once.
	public static void ProductOfFirstFiveNumbers() {
		int firstNumber = 1;
		int lastNumber = 5;
		int product = 1;
		do {
			product = firstNumber * product;
			firstNumber++;
		} while (firstNumber <= lastNumber);
		System.out.println(product);

	}

	public static void SumOfFirstFiveCharacter() {
		char firstChar = 'a';
		char lastChar = 'e';
		int sumOfFiveChar = 0;
		do {
			sumOfFiveChar = sumOfFiveChar + firstChar;
			firstChar++;
		} while (firstChar < lastChar);
		System.out.println(sumOfFiveChar);
	}

	public static void NotEvenAndDivisibleByThreeAndSeven() {
		int firstNumber = 0;
		int lastNumber = 100;
		do {
			if (firstNumber % 2 != 0 && firstNumber % 3 == 0 && firstNumber % 7 == 0) {
				System.out.println(firstNumber);

			}
			firstNumber++;

		} while (firstNumber < lastNumber);
	}

	public static void main(String[] args) {
		NotEvenAndDivisibleByThreeAndSeven();
		SumOfFirstFiveCharacter();
		ProductOfFirstFiveNumbers();

	}

}
