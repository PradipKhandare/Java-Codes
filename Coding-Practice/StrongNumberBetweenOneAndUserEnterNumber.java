package Java_Codes;

import java.util.Scanner;

public class StrongNumberBetweenOneAndUserEnterNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hey user enter your number : ");
		int n = sc.nextInt();
		int m = n;
		int sum = 0;
		while (n > 0) {
			int a = n % 10;
			sum = sum + fact(a);
		}

	}

}
