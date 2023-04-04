import java.util.Scanner;

public class DoWhileLoopPracticeExamples {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		do {
			System.out.println("cube is" + " " + (number * number * number));
			System.out.println("enter the number");
			number = scanner.nextInt();
		} while (number >= 0);
		System.out.println("thank you have a fun");
	}

}
