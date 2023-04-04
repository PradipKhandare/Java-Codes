package IfStatement;

//Decision making statement is used to verify the condition before performing a particular task.
//Else block is not mandatory.

public class IfStatementProgram {

	public static void FindeVowelOrNotUsingSwitch() {
		char ch = 'O';
		switch (ch) {

		case 'A': {
			System.out.println("Vowel");
			break;
		}

		case 'E': {
			System.out.println("Vowel");
			break;
		}

		case 'I': {
			System.out.println("Vowel");
			break;
		}

		case 'O': {
			System.out.println("Vowel");
			break;
		}

		case 'U': {
			System.out.println("Vowel");
			break;
		}

		default: {
			System.out.println("It is not vowel");
		}

		}
	}

	public static void FindEvenOrOddUsingSwitch() {
		int n = 100;
		System.out.println("Switch explanation begins");
		switch (n % 2) {
		case 0: {
			System.out.println("The number is even bro.....");
			break;
			// Break is a keyword in java.
			// Break keyword is declared inside switch block.
			// It is used to stop the execution of particular task.
		}
		case 1: {
			System.out.println("The number is odd bro.......");
			break;
		}

		}
	}

	public static void ElseIfLadderProgram() {
		// verifying more than one condition is called else-if ladder.
		int number = 763;
		if (number % 2 != 0 && number % 7 == 0) {
			System.out.println("Hiii");
		} else if (number % 2 == 0 || number % 9 == 0) {
			System.out.println("Hello");
		} else if (number % 9 != 0 && number % 2 != 0) {
			System.out.println("Byeeee");
		} else {
			System.out.println("Block");
		}
	}

	public static void IsGivenNumaberIsPositiveOrNegative() {
		int number = 100;
		if (number > 0) {
			System.out.println("The " + number + " : is Positive");
		} else {
			System.out.println("The " + number + " : is Negative");
		}
	}

	public static void IsGivenNumberDivisibleByThreeAndSeven() {
		int number = 63;
		if (number % 7 == 0 && number % 3 == 0) {
			System.out.println("The " + number + " is divisible by 3 and 7");
		} else {
			System.out.println("The given number is not divisible by 3 and 7");
		}
	}

	public static void EvenOrOdd() {

		int number = 100;
		if (number % 2 == 0) {
			System.out.println("The given number is even");
		} else {
			System.out.println("The given number is odd");
		}

	}

	public static void MaximumOfTwoNumbers() {
		int numberOne = 100;
		int numberTwo = 200;
		if (numberOne > numberTwo) {
			System.out.println("The maximum number is : " + numberOne);
		} else {
			System.out.println("the maximum number is : " + numberTwo);
		}
	}

	public static void IfStatementExample() {
		// In if statement we perform we perform particular task only for when the
		// condition is true.
		char character = 'A';
		if (character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
			System.out.println("Given character is vowel");
		} else {
			System.out.println("Given character is not vowel");
		}

	}

	public static void main(String[] args) {
		IfStatementExample();
		MaximumOfTwoNumbers();
		EvenOrOdd();
		IsGivenNumberDivisibleByThreeAndSeven();
		IsGivenNumaberIsPositiveOrNegative();
		ElseIfLadderProgram();
		FindEvenOrOddUsingSwitch();
		FindeVowelOrNotUsingSwitch();

	}

}
