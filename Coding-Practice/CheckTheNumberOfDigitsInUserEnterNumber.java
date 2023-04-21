package Java_Codes;

import java.util.Scanner;

public class CheckTheNumberOfDigitsInUserEnterNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number : ");
		int n = sc.nextInt();
		int count = 0;
		while (n > 0) {
			count++;
			n = n / 10;
		}
		System.out.println("Total digits are  : " + count);

	}

}
