
//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		System.out.print("enter the first number : ");
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		System.out.print("enter the second number : ");
		int second = sc.nextInt();
		System.out.println("The addition of the number is : " + first + second);
		System.out.println("The multiplication of the number is : " + first * second);
		System.out.println("the division of the number is : " + first / second);
		System.out.println("the remainder of the number is : " + first % second);

	}

}
