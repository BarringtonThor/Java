//	To represent the a credit card

public class CreditCard {
	private Money balance; // the current balance
	private Money creditLimit;
	private Person owner;
	// To do - finish Task #3 step 1

	// Constructor creates a credit card for the Person parameter
	// with an approved credit limit of the Money parameter
	// and sets the balance to a Money amount of zero
	public CreditCard(Person newCardholder, Money limit) {
		balance = new Money(0);
		owner = newCardholder;
		creditLimit = limit; // pass by reference
		// To do - finish Task #3 step 2
	}

	// Accessor method returns the balance
	public Money getBalance() {
		return new Money(balance);
	}

	// Accessor method returns the credit limit
	// To do - finish Task #3 step 3

	public Money getCreditLimit() {
		return new Money(creditLimit);
	}

	// Accessor method returns information about the owner
	// To do - finish Task #3 step 4

	public String getPersonals() {
		return owner.toString();
	}

	// Method to make a charge to the credit card, if
	// the credit limit will not be exceeded
	public void charge(Money amount) {
		// To do - finish Task #3 step 5
		if (balance.add(amount).compareTo(creditLimit) < 0) {
			System.out.println("Charge: " + balance);
			balance = balance.add(amount);
		}
	}

	// Method to make a payment to the credit card
	// To do - finish Task #3 step 6
	public void payment(Money amount) {
		System.out.println("Payment: " + amount);
		balance = balance.subtract(amount);
	}
}