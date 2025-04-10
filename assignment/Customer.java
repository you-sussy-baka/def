package assignment;

import java.util.ArrayList;

public class Customer extends User {
	private Cart cart;
	private ArrayList<Product> wishlist;
	private ArrayList<Order> orders;

	public Customer() {
		this("", "", '\u0000');
	}

	public Customer(String username, String password, char gender) {
		super(username, password, gender);
		this.cart = new Cart();
		this.wishlist = new ArrayList<Product>();
		this.orders = new ArrayList<Order>();
	}

	// getters
	public Cart getCart() {
		return cart;
	}

	// methods
	public void menu() {
		System.out.println("Customer menu");
	}

	private void searchProduct() {}
}