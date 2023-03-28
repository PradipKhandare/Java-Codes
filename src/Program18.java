import java.util.Scanner;

//Write a Java program to convert a decimal number to octal number
public class Program18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();

		int quot = num;
		int i = 1;
		int oct_num[] = new int[100];

		while (quot != 0) {
			oct_num[i++] = quot % 8;
			quot = quot / 8;
		}

		System.out.println("Octal number is : ");
		for (int j = i - 1; j > 0; j--) {
			System.out.print(oct_num[j]);

		}

	}

}
