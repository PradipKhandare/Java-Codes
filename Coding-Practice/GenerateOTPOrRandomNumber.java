package Java_Codes;

public class GenerateOTPOrRandomNumber {

	public static void main(String[] args) {
		int min = 1000;
		int max = 9999;
		int a = (int) (Math.random() * ((max - min + 1) + min));
		System.out.println(a);

	}

}
