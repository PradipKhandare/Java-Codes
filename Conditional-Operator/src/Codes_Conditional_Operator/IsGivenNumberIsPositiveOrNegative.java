package Codes_Conditional_Operator;

import java.util.Scanner;

public class IsGivenNumberIsPositiveOrNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number : ");
		int a = sc.nextInt();
		String res = ((a < 0) ? "Given number is Negative" : "Given number is Positive");
		System.out.println(res);

	}

}
