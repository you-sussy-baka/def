package assignment;

public class Payment extends Transaction {
	public Payment() {
		this(0, new TransactionAccount());
	}

	public Payment(double amount, TransactionAccount transactionAccount) {
		super(amount, transactionAccount);
	}

	// methods
	public boolean process() {
		super.setStatus("Processed");
		return true;
	}
}