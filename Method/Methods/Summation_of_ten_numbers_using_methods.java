package Methods_Practicing;

public class Summation_of_ten_numbers_using_methods {

	public static int sumofnumbers() {
		int firstnumber = 1;
		int lastnumber = 10;
		int sumofallthenumbers = 0;
		for (int i = firstnumber; i <= lastnumber; i++) {
			sumofallthenumbers = i + sumofallthenumbers;

		}

		return (sumofallthenumbers);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = sumofnumbers();
		System.out.println(sum);

	}

}
