package assignment;

public class Seller extends User {
	private double balance;
	private ArrayList<Store> stores;
	private ArrayList<Withdrawal> withdrawals;

	public Seller() {
		this("", "", '\u0000');
	}

	public Seller(String username, String password, char gender) {
		super(username, password, gender);
		this.balance = 0.0;
		this.stores = new ArrayList<Store>();
		this.withdrawals = new ArrayList<Withdrawal>();
	}

	// getters
	public double getBalance() {
		return balance;
	}
	public ArrayList<Store> getStores() {
		return stores;
	}
	public ArrayList<Withdrawal> getWithdrawals() {
		return withdrawals;
	}

	// setters
	public void setBalance(double balance) {
		this.balance = balance;
	}

	// methods
	public void menu() {
		System.out.println("Seller menu");
	}

	private void salesReport() {}

	private void viewStores() {}

	private void addStore() {}

	private void removeStore() {}

	private void transferOwnership() {}
}