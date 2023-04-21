package Java_Codes;

import java.util.Scanner;

public class PrintFabonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the count here : ");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int c;
		int i = 1;
		while (i <= n) {
			System.out.print(a + " ,");
			c = a + b;
			a = b;
			b = c;
			i++;
		}

	}

}
