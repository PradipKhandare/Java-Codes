package WhileLoop;
//Looping statement is used to verify the condition multiple times.

//looping statement are classified into three types,
//1]while loop
//2]do while loop
//3]for loop

public class WhileLoopProgram {
	// while loop does not perform task for false condition
	// If we pass false condition into while loop we get CTE as
	// "(Unreachable statement)".
	public static void NumberDivisibleByThreeAndSeven() {
		int numberOne = 0;
		int numberLast = 100;
		while (numberOne < numberLast) {
			if (numberOne % 3 == 0 && numberOne % 7 == 0) {
				System.out.println(numberOne);

			}
			numberOne++;

		}
	}

	public static void main(String[] args) {
		NumberDivisibleByThreeAndSeven();

	}

}
