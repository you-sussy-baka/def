package assignment;

public class Variant {
	private String name;
	private double price;
	private int stock;

	public Variant() {
		this("", 0, 0);	
	}

	public Variant(String name, double price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	// getters
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public int getStock() {
		return stock;
	}

	// setters
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}

	// methods
	public boolean deductStock(int quantity) {
		if (this.stock >= quantity) {
			this.stock -= quantity;
			return true;
		} else return false;
	}
}