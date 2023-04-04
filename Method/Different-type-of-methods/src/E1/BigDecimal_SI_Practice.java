package E1;

import java.math.BigDecimal;

public class BigDecimal_SI_Practice {
	BigDecimal principle;
	BigDecimal interest;

	BigDecimal_SI_Practice(String principle, String interest) {
		this.principle = new BigDecimal(principle);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
	}

	public BigDecimal calculateTotalSum(int year) {
		BigDecimal yearBigDecimal = new BigDecimal(year);
		BigDecimal TotalValue = principle.add((principle).multiply(yearBigDecimal).multiply(interest));
		return TotalValue;
	}

}
