
//Write a Java program that takes three numbers as input to calculate and print the average of the numbers
import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		double n = sc.nextDouble();
		System.out.print("Enter the second number : ");
		double m = sc.nextDouble();
		System.out.print("Enter the third number : ");
		double o = sc.nextDouble();
		double avg = (n + m + o) / 3;
		System.out.println("the average of 3 number is : " + avg);

	}

}
