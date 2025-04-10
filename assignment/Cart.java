package assignment;

import java.util.HashMap;

public class Cart {
	private HashMap<Variant, Integer> items;

	public Cart() {
		this.items = new HashMap<Variant, Integer>();
	}

	public void addItem(Variant variant, int quantity) {
		this.items.put(variant, quantity);
	}

	public void removeItem(Variant variant) {
		this.items.remove(variant);
	}

	public void updateItem(Variant variant, int quantity) {
		this.items.put(variant, quantity);
	}

	public void clearCart() {
		this.items.clear();
	}

	public void viewCart() {
		
	}
}