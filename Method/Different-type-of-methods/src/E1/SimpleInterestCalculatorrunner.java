package E1;

import java.math.BigDecimal;

public class SimpleInterestCalculatorrunner {
	// Total amount=princi+princi*interest*noOfYrs/100;

	public static void main(String[] args) {
		SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00", "7.5");
		BigDecimal totalsum = calculator.calculateTotalValue(5);
		System.out.println(totalsum);

	}

}
