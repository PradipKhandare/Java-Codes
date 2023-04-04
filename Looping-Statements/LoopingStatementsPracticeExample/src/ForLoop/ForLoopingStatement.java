package ForLoop;

public class ForLoopingStatement {

	public static void main(String[] args) {
		int firstNumber = 1;
		int lastNumber = 10;
		int sumOfTen = 0;
		for (int i = 0; i <= lastNumber; i++) {
			sumOfTen = i + sumOfTen;
			System.out.println(sumOfTen);
		}
		System.out.println(sumOfTen);
	}

}
