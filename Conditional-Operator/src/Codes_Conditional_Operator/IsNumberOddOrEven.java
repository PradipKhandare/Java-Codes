package Codes_Conditional_Operator;

import java.util.Scanner;

public class IsNumberOddOrEven {

	public static void main(String[] args) {

		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String res = (num % 2 == 0 ? "the given number is even" : "the given number is odd");
		System.out.println(res);

	}

}
