package assignment;

import java.util.ArrayList;

public class Store {
	private String name;
	private String description;
	private String contactNumber;
	private ArrayList<Product> products;
	
	private static ArrayList<Store> stores = new ArrayList<Store>();

	public Store() {
		this("", "", "");
	}

	public Store(String name, String description, String contactNumber) {
		this.name = name;
		this.description = description;
		this.contactNumber = contactNumber;
		this.products = new ArrayList<Product>();
		stores.add(this);
	}

	// getters
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public ArrayList<Product> getProducts() {
		return products;
	}
	public static ArrayList<Store> getStores() {
		return stores;
	}

	// setters
	public void setName(String name) {
		this.name = name;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	// methods
	public void addProduct(Product product) {
		this.products.add(product);
	}
	public void removeProduct(Product product) {
		this.products.remove(product);
	}
	public void removeStore() {
		
	}
}