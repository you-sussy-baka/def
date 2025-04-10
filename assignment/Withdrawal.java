package assignment;

public class Withdrawal {
	public Withdrawal() {
		this(0, new TransactionAccount());
	}

	public Withdrawal(double amount, TransactionAccount transactionAccount) {
		super(amount, transactionAccount);
	}

	// methods
	public boolean process() {
		super.setStatus("Processed");
		return true;
	}
}