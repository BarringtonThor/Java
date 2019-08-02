public class SavingsAccount extends BankAccount {
	private double rate = .025;
	private int savingsNumber = 0;
	private String accountNumber;

	public SavingsAccount(String name, double begBal) {
		super(name, begBal);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}

	public SavingsAccount(SavingsAccount oldAccount, double begBal) {
		super(oldAccount, begBal);
		// savingsNumber++;
		// accountNumber = oldAccount.accountNumber + savingsNumber;
		savingsNumber = oldAccount.savingsNumber + 1;
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}

	public void postInterest() {
		double interestAmount = getBalance() * rate / 12;
		double finalAmount = getBalance() + interestAmount;
		setBalance(finalAmount);
	}

	public String getAccountNumber() {
		return accountNumber;
	}
}