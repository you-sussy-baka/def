package assignment;

import java.time.LocalDate;

public class TransactionAccount {
	private String type;
	private String details;
	private String holderName;
	private LocalDate expiryDate;
	private String bankName;

	public TransactionAccount() {
		this("", "", "");
	}

	public TransactionAccount(String type, String details, String holderName) {
		// ewallet
		this.type = type;
		this.details = details;
		this.holderName = holderName;
	}

	public TransactionAccount(String type, String details, String holderName, LocalDate expiryDate) {
		// credit card
		this.type = type;
		this.details = details;
		this.holderName = holderName;
		this.expiryDate = expiryDate;
	}

	public TransactionAccount(String type, String details, String holderName, String bankName) {
		// bank transfer
		this.type = type;
		this.details = details;
		this.holderName = holderName;
		this.bankName = bankName;
	}

	// getters
	public String getType() {
		return type;
	}
	public String getDetails() {
		return details;
	}
	public String getHolderName() {
		return holderName;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public String getBankName() {
		return bankName;
	}

	// methods
	public boolean verify() {
		return true;
	}
}