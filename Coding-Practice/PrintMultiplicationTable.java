package Java_Codes;

import java.util.Scanner;

public class PrintMultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int a = sc.nextInt();
		int table = 1;
		for (int i = 1; i <= 10; i++) {
			table = a * i;
			System.out.println(a + " * " + i + " = " + table);
		}

	}

}
