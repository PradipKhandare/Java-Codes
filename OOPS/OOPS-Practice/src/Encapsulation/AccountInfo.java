package Encapsulation;

public class AccountInfo {

	public static void main(String[] args) {

		AccountDetails acd = new AccountDetails();
		double bal = acd.getBalance();
		System.out.println(bal);
		acd.setBalance(123.12);
		System.out.println(acd.getBalance());

	}

}
