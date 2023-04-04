package E1;

import java.math.BigDecimal;

public class BigDecimal_SI_PracticeRunner {
	public static void main(String[] args) {
		BigDecimal_SI_Practice simpleInterestCalculator = new BigDecimal_SI_Practice("1550.546", "6");
		BigDecimal TotalValue = simpleInterestCalculator.calculateTotalSum(5);
		System.out.println(TotalValue);

	}

}
