public class CheckingAccount extends BankAccount {
	private static double fee = .15;
	private String accountNumber = getAccountNumber() + "-10";

	public CheckingAccount(String name, double begBal) {
		super(name, begBal);
		setAccountNumber(accountNumber);
	}

	public boolean withdraw(double amount) {
		double finalAmount = amount + fee;
		super.withdraw(finalAmount);
		boolean completed = true;
		return completed;
	}
}