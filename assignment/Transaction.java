package assignment;

import java.time.LocalDateTime;

public abstract class Transaction {
	private double amount;
	private String status;
	private TransactionAccount transactionAccount;
	private LocalDateTime createdAt;
	private LocalDateTime processedAt;

	public Transaction() {
		this(0);
	}

	public Transaction(double amount, TransactionAccount transactionAccount) {
		this.amount = amount;
		this.transactionAccount = transactionAccount;
		this.status = "Pending";
		this.createdAt = LocalDateTime.now();
	}

	// getters
	public double getAmount() {
		return amount;
	}
	public String getStatus() {
		return status;
	}
	public TransactionAccount getTransactionAccount() {
		return transactionAccount;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public LocalDateTime getProcessedAt() {
		return processedAt;
	}

	// setters
	public void setStatus(String status) {
		this.status = status;
	}
	public void setProcessedAt(LocalDateTime processedAt) {
		this.processedAt = processedAt;
	}

	// methods
	public abstract boolean process();
}