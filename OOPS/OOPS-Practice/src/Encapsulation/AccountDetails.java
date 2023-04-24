package Encapsulation;

public class AccountDetails {
	private double Balance = 1234.123;

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double n) {
		this.Balance = this.Balance + n;
	}

	public static void main(String[] args) {

	}

}
