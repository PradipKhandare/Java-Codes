import java.util.Scanner;

//Write a Java program to add two binary numbers.
public class Program15 {

	public static void main(String[] args) {

		long binary1, binary2;
		int i = 0, remainder = 0;
		int[] sum = new int[20];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first binary number : ");
		binary1 = sc.nextLong();
		System.out.println("Enter second binary number : ");
		binary2 = sc.nextLong();
		while (binary1 != 0 || binary2 != 0) {
			sum[i++] = (int) ((binary1 % 10 + binary2 % 10 + remainder) % 2);
			remainder = (int) ((binary1 % 10 + binary2 % 10 + remainder) / 2);
			binary1 = binary1 / 10;
			binary2 = binary2 / 10;
		}

		if (remainder != 0) {
			sum[i++] = remainder;

		}
		--i;
		System.out.println("sum of two binary number is : ");
		while (i >= 0) {
			System.out.print(sum[i--]);
		}
		System.out.println("\n");
	}

}
