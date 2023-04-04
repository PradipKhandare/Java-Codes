package E1;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
	BigDecimal principle;
	BigDecimal interest;

	SimpleInterestCalculator(String principle, String interest) {
		this.principle = new BigDecimal(principle);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
	}

	public BigDecimal calculateTotalValue(int year) {
		BigDecimal yearBigDecimal = new BigDecimal(year);
		BigDecimal totalsum = principle.add((principle).multiply(interest).multiply(yearBigDecimal));

		return totalsum;
	}
}
