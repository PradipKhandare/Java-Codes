
//Write a Java program to convert a decimal number to binary number
import java.util.Scanner;

public class Program16 {

	public static void main(String[] args) {
		int dec_Num, quot, i = 1, j;
		int[] bin = new int[100];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		dec_Num = sc.nextInt();

		quot = dec_Num;

		while (quot != 0) {
			bin[i++] = quot % 2;
			quot = quot / 2;
		}

		System.out.println("Binary number is : ");
		for (j = i - 1; j > 0; j--) {
			System.out.print(bin[j]);
		}

		System.out.print("\n");

	}

}
